package ar.edu.unq.po2.tp9;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
public class PokerStatus {
	private Carta carta;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private List<Carta> mano;
	public PokerStatus(Carta carta, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.carta=carta;
		this.carta2=carta2;
		this.carta3=carta3;
		this.carta4=carta4;
		this.carta5=carta5;
		this.mano  = new ArrayList();
	}
	public void agregarCarta(Carta carta) {
		mano.add(carta);
	}
	public List<Carta> getMano(){
		return this.mano;
	}
	
	
	
	
	public static boolean verificarPoker(List<Carta> mano) {
		return mano.stream()
	            .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting())) // Agrupa las cartas por su valor y cuenta cuántas veces aparece cada uno
	            .values()
	            .stream()
	            .anyMatch(count -> count == 4); // Verifica si hay algún valor que aparezca 4 veces
	}
	public static boolean verificarColor(List<Carta> mano) {
		return mano.stream()
	            .collect(Collectors.groupingBy(Carta::getPalo, Collectors.counting())) // Agrupa las cartas por su valor y cuenta cuántas veces aparece cada uno
	            .values()
	            .stream()
	            .anyMatch(count -> count == 5);
	}
	public static boolean verificarTrio(List<Carta> mano) {
		return mano.stream()
	            .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting())) // Agrupa las cartas por su valor y cuenta cuántas veces aparece cada uno
	            .values()
	            .stream()
	            .anyMatch(count -> count == 3);
	}
	public static Jugada verificar(List<Carta> mano) {
		
		if (verificarPoker (mano)) {
			return(Jugada.Poker);
		} 	
		else if (verificarColor (mano)) {
			return(Jugada.Color);
		}		
		else if (verificarTrio (mano)) {
			return(Jugada.Trio);
		} 		
		else {
		return(Jugada.Nada);
		}
	}
	
	public static List<Carta> comparar(List<Carta> mano1, List<Carta> mano2) {
	    // Primero comparamos por la importancia de la jugada
	    if (verificar(mano1).getImportancia() != verificar(mano2).getImportancia()) {
	        return verificar(mano1).getImportancia() > verificar(mano2).getImportancia() ? mano1 : mano2;
	    }

	    // Si las jugadas son iguales, comparamos por el valor de las cartas
	    return compararCartas(mano1, mano2);
	}

	// Compara dos listas de cartas para desempatar jugadas iguales y devuelve la ganadora
	private static List<Carta> compararCartas(List<Carta> mano1, List<Carta> mano2) {
	    // Ordenamos las listas de cartas de mayor a menor
		List<ValorCarta> manoVal1= mano1.stream()
				.map(Carta::getValor)  // Obtén el valor de cada carta (tipo ValorCarta)
			    .collect(Collectors.toList());
		List<ValorCarta> manoVal2= mano2.stream()
				.map(Carta::getValor)  // Obtén el valor de cada carta (tipo ValorCarta)
			    .collect(Collectors.toList());
		
		manoVal1.sort(Comparator.comparingInt(ValorCarta::getValor).reversed());
		manoVal2.sort(Comparator.comparingInt(ValorCarta::getValor).reversed());

	    // Comparamos carta por carta
	    for (int i = 0; i < manoVal1.size(); i++) {
	        int comparacion = Integer.compare(manoVal1.get(i).getValor(), manoVal2.get(i).getValor());
	        if (comparacion != 0) {
	            return comparacion > 0 ? mano1 : mano2;
	        }
	    }

	    // Si todas las cartas son iguales, entonces las manos son equivalentes
	    return mano1; // Si todas las cartas son iguales, retorna cualquiera
	}

}
