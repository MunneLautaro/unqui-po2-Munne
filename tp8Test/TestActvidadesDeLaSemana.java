package ar.edu.unq.po2.tp8;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class TestActvidadesDeLaSemana {
	ActividadSemanal actividad1 = new ActividadSemanal(DiaDeLaSemana.Lunes, 9, 1, Deporte.FUTBOL);  // costo base 500 + 2*200 = 900
    ActividadSemanal actividad2 = new ActividadSemanal(DiaDeLaSemana.Jueves, 14, 2, Deporte.FUTBOL); // costo base 1000 + 2*200 = 1400
    ActividadSemanal actividad3 = new ActividadSemanal(DiaDeLaSemana.Miercoles, 10, 1, Deporte.TENNIS); // costo base 500 + 3*200 = 1100
    ActividadSemanal actividad4 = new ActividadSemanal(DiaDeLaSemana.Domingo, 12, 1, Deporte.TENNIS); // costo base 1000 + 3*200 = 1600
    ActividadSemanal actividad5 =  new ActividadSemanal(DiaDeLaSemana.Lunes, 8, 2, Deporte.BASKET); // costo base 500 + 2*200 = 900
    private List<ActividadSemanal> actividades2;
	 @BeforeEach
	    public void setup() {
	        actividades2 = new ArrayList<>();
	    }
	@Test
    public void testObtenerActividadesFutbol() {
        // Crear algunas actividades para la prueba
        ActividadSemanal actividad1 = new ActividadSemanal(DiaDeLaSemana.Lunes, 10, 2, Deporte.FUTBOL);
        ActividadSemanal actividad2 = new ActividadSemanal(DiaDeLaSemana.Martes, 12, 1, Deporte.RUNNING);
        ActividadSemanal actividad3 = new ActividadSemanal(DiaDeLaSemana.Miercoles, 14, 2, Deporte.BASKET);
        ActividadSemanal actividad4 = new ActividadSemanal(DiaDeLaSemana.Jueves, 16, 3, Deporte.FUTBOL);

        // Crear la lista de actividades
        List<ActividadSemanal> actividades = Arrays.asList(actividad1, actividad2, actividad3, actividad4);

        // Llamar al método a probar
        List<ActividadSemanal> actividadesFutbol = ActividadSemanal.todasLasActivdadesDe(actividades,  Deporte.FUTBOL);

        // Verificar que solo hay 2 actividades de FUTBOL
        assertEquals(2, actividadesFutbol.size(), "Debe haber 2 actividades de FUTBOL");
	}
	@Test
    public void testHorasOfrecidas() {
        // Crear algunas actividades para la prueba
        ActividadSemanal actividad1 = new ActividadSemanal(DiaDeLaSemana.Lunes, 10, 2, Deporte.FUTBOL);
        ActividadSemanal actividad2 = new ActividadSemanal(DiaDeLaSemana.Martes, 12, 1, Deporte.RUNNING);
        ActividadSemanal actividad3 = new ActividadSemanal(DiaDeLaSemana.Miercoles, 14, 2, Deporte.BASKET);
        ActividadSemanal actividad4 = new ActividadSemanal(DiaDeLaSemana.Jueves, 16, 3, Deporte.FUTBOL);

        // Crear la lista de actividades
        List<ActividadSemanal> actividades = Arrays.asList(actividad1, actividad2, actividad3, actividad4);

        // Llamar al método a probar
        int horasTotales = ActividadSemanal.cantidadDeHoras(actividades);

        // Verificar que solo hay 2 actividades de FUTBOL
        assertEquals(8, horasTotales, "Debe haber 2 actividades de FUTBOL");
	}
	@Test
	public void testElMasBarato() {
        // Crear algunas actividades para la prueba
        ActividadSemanal actividad1 = new ActividadSemanal(DiaDeLaSemana.Lunes, 10, 2, Deporte.FUTBOL);
        ActividadSemanal actividad2 = new ActividadSemanal(DiaDeLaSemana.Martes, 12, 1, Deporte.RUNNING);
        ActividadSemanal actividad3 = new ActividadSemanal(DiaDeLaSemana.Miercoles, 14, 2, Deporte.BASKET);
        ActividadSemanal actividad4 = new ActividadSemanal(DiaDeLaSemana.Jueves, 16, 3, Deporte.FUTBOL);

        // Crear la lista de actividades
        List<ActividadSemanal> actividades = Arrays.asList(actividad1, actividad2, actividad3, actividad4);

        // Llamar al método a probar
        ActividadSemanal elMasBarato = ActividadSemanal.actividadMasBarataDe(actividades, Deporte.FUTBOL);

        // Verificar que solo hay 2 actividades de FUTBOL
        assertEquals(actividad1, elMasBarato, "Debe haber 2 actividades de FUTBOL");
	}
	//@Test
    //public void testActividadMasEconomicaPorDeporte() {
		// Llamar al método que estamos probando
      //  Map<Deporte, ActividadSemanal> masEconomica = ActividadSemanal.lasActividadesMasEconomicas(actividades2);

        // Verificar que los deportes tienen la actividad más económica correcta
        //assertEquals(900, masEconomica.get(Deporte.FUTBOL).calcularCosto());
        //assertEquals(1100, masEconomica.get(Deporte.TENNIS).calcularCosto());
        //assertEquals(900, masEconomica.get(Deporte.BASKET).calcularCosto());
    //}
	
}
