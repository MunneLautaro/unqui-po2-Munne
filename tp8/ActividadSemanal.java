package ar.edu.unq.po2.tp8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;




public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	
	public ActividadSemanal(DiaDeLaSemana dia, int horaDeInicio, int duracion, Deporte deporte) {
		this.dia          = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion     = duracion;
		this.deporte      = deporte;
		
	}
	
	
	
	public DiaDeLaSemana getDia() {
		return this.dia ;
	}
	public int hsDeInicio() {
		return this.horaDeInicio ;
	}
	public int getDuracion() {
		return this.duracion;
	}	
	public Deporte getDeporte() {
		return this.deporte;
	}		
	
	
	
	public double calcularCosto() {
        int costoBasePorHora;
        
        // Determinar costo base por hora según el día de la semana
        switch (dia) {
            case Lunes:
            case Martes:
            case Miercoles:
                costoBasePorHora = 500;
                break;
            case Jueves:
            case Viernes:
            case Sabado:
            case Domingo:
                costoBasePorHora = 1000;
                break;
            default:
                throw new IllegalArgumentException("Día de la semana no válido");
        }
        
        double costoTotalDeHoras   = costoBasePorHora * this.duracion;
        double costoPorComplejidad = this.deporte.getComplejidad()* 200;
        return (costoTotalDeHoras + costoPorComplejidad);
	}
	public static List<ActividadSemanal> todasLasActivdadesDe (List <ActividadSemanal> actividades, Deporte deporte){
		return actividades.stream()
		.filter(a-> a.getDeporte() == deporte)
		.collect(Collectors.toList());
	}
	public static int cantidadDeHoras(List <ActividadSemanal> actividades) {
		return actividades.stream()
	    .mapToInt(ActividadSemanal::getDuracion)
	    .sum();
	}
	public static ActividadSemanal actividadMasBarataDe(List<ActividadSemanal> actividades, Deporte deporte) {
		List<ActividadSemanal> actividadesDelDeporte = todasLasActivdadesDe (actividades, deporte);
	    return actividadesDelDeporte.stream()
	    		.filter(a-> a.getDeporte() == deporte)
	            .min(Comparator.comparingDouble(ActividadSemanal::calcularCosto))
	            .orElseThrow(() -> new IllegalArgumentException("La lista de actividades está vacía"));
	}
	
	public static Map<Deporte, ActividadSemanal> lasActividadesMasEconomicas(List<ActividadSemanal> actividades){
		return actividades.stream()
		        .collect(Collectors.groupingBy(
	                    ActividadSemanal::getDeporte, // Agrupa por deporte
	                    Collectors.collectingAndThen( // Convierte el resultado de minBy en ActividadSemanal
	                        Collectors.minBy(Comparator.comparing(ActividadSemanal::calcularCosto)), // Encuentra la más económica
	                        Optional::get // Obtén el valor dentro del Optional
	                    )
	            ));
	}
	@Override
	public String toString() {
	    return String.format("Deporte: %s. Dia: %s A LAS: %d. Duración: %d hora(s).",
	            deporte.name(),
	            dia.name(),
	            horaDeInicio,
	            duracion);
	}
	 public void imprimirTodasLasActividades(List<ActividadSemanal> actividades) {
	        actividades.stream()
	            .map(ActividadSemanal::toString) // Convertir cada actividad a su representación en String
	            .forEach(System.out::println);   // Imprimir cada una
	 }
}
