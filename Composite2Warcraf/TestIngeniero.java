package ar.edu.unq.po2.Composite2Warcraf;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestIngeniero {
	private Ingeniero inge;
	private Punto puntoO;
	private Punto puntoD;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCamina() {
		// Mockeamos los puntos de origen y destino
	    puntoO = new Punto(0, 0);
	    puntoD = new Punto(3, 2);

	    // Configuramos los valores que deben devolver los métodos getX() y getY()
	    when(puntoO.getX()).thenReturn(0);
	    when(puntoO.getY()).thenReturn(0);
	    when(puntoD.getX()).thenReturn(3);
	    when(puntoD.getY()).thenReturn(2);
	    
	    // Creamos una instancia real de Ingeniero
	    inge = new Ingeniero(5, puntoO);

	    // Llamamos al método que queremos probar
	    inge.caminar(puntoD);

	    // Ahora verificamos los resultados esperados
	    assertEquals(0, inge.getLajas()); // Verificamos la cantidad de lajas restantes

	    // En lugar de verify(), puedes verificar los efectos del método
	    assertEquals(puntoD, inge.getPosicion()); // Si tienes un método para obtener la posición actual
	}

}
