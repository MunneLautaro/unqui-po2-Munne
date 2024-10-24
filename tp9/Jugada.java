package ar.edu.unq.po2.tp9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public enum Jugada {
	Poker(3), Color(2), Trio(1), Nada(0) ;
	private int importancia;
	private List<Carta> mano;
	Jugada(int importancia) {
		// TODO Auto-generated constructor stub
		this.importancia = importancia;
		this.mano  = new ArrayList();
	}
	
	
	public int getImportancia() {
		return this.importancia;
	}
	
	
	public static List<ValorCarta> comparar(Jugada jugada1, List<ValorCarta> cartasJugada1, Jugada jugada2, List<ValorCarta> cartasJugada2) {
	    // Primero comparamos por la importancia de la jugada
	    if (jugada1.getImportancia() != jugada2.getImportancia()) {
	        return jugada1.getImportancia() > jugada2.getImportancia() ? cartasJugada1 : cartasJugada2;
	    }

	    // Si las jugadas son iguales, comparamos por el valor de las cartas
	    return compararCartas(cartasJugada1, cartasJugada2);
	}

	// Compara dos listas de cartas para desempatar jugadas iguales y devuelve la ganadora
	private static List<ValorCarta> compararCartas(List<ValorCarta> cartasJugada1, List<ValorCarta> cartasJugada2) {
	    // Ordenamos las listas de cartas de mayor a menor
	    cartasJugada1.sort(Comparator.comparingInt(ValorCarta::getValor).reversed());
	    cartasJugada2.sort(Comparator.comparingInt(ValorCarta::getValor).reversed());

	    // Comparamos carta por carta
	    for (int i = 0; i < cartasJugada1.size(); i++) {
	        int comparacion = Integer.compare(cartasJugada1.get(i).getValor(), cartasJugada2.get(i).getValor());
	        if (comparacion != 0) {
	            return comparacion > 0 ? cartasJugada1 : cartasJugada2;
	        }
	    }

	    // Si todas las cartas son iguales, entonces las manos son equivalentes
	    return cartasJugada1; // Si todas las cartas son iguales, retorna cualquiera
	}
}
