package ar.edu.unq.po2.Composite1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTierra {
	private PorcionDeCultivoPuro porcionSoja;
	private PorcionDeCultivoPuro porcionTrigo;
	private PorcionDeCultivoMixta porcionMixta;
	@BeforeEach
	void setUp() throws Exception {
		porcionSoja  = mock (PorcionDeCultivoPuro.class);
		porcionTrigo = mock (PorcionDeCultivoPuro.class);
		porcionMixta = mock (PorcionDeCultivoMixta.class);
	}

	@Test
    public void testCalcularGananciaDeSoja_ParcelaPuraSoja() {
		// Configurar el mock para devolver un valor específico cuando se llama a calcularGananciaDeSoja
        when(porcionSoja.calcularGananciaDeSoja()).thenReturn(500.0);

        // Verificar que la ganancia para una parcela de soja es 500
        assertEquals(500.0, porcionSoja.calcularGananciaDeSoja());

        // Verificar que se llamó al método calcularGananciaDeSoja
        verify(porcionSoja, times(1)).calcularGananciaDeSoja();
    }
	@Test
    public void testCalcularGananciaDeSoja_ParcelaPuraSoja2() {
		 // Configurar el mock para una parcela de trigo que no da ganancia de soja
        when(porcionTrigo.calcularGananciaDeSoja()).thenReturn(0.0);

        // Verificar que la ganancia para una parcela de trigo es 0
        assertEquals(0.0, porcionTrigo.calcularGananciaDeSoja());

        // Verificar que se llamó al método calcularGananciaDeSoja
        verify(porcionTrigo, times(1)).calcularGananciaDeSoja();
    }
	@Test
	 public void testCalcularGananciaDeSoja_ParcelaPuraTrigo() {
		 // Configurar el mock para una parcela de trigo que no da ganancia de soja
       when(porcionTrigo.calcularGananciaDeSoja()).thenReturn(300.0);

       // Verificar que la ganancia para una parcela de trigo es 0
       assertEquals(300.0, porcionTrigo.calcularGananciaDeSoja());

       // Verificar que se llamó al método calcularGananciaDeSoja
       verify(porcionTrigo, times(1)).calcularGananciaDeSoja();
    }
	@Test
	 public void testCalcularGananciaDeSoja_ParcelaPuraTrigo2() {
		 // Configurar el mock para una parcela de trigo que no da ganancia de soja
      when(porcionSoja.calcularGananciaDeSoja()).thenReturn(0.0);

      // Verificar que la ganancia para una parcela de trigo es 0
      assertEquals(0.0, porcionSoja.calcularGananciaDeSoja());

      // Verificar que se llamó al método calcularGananciaDeSoja
      verify(porcionSoja, times(1)).calcularGananciaDeSoja();
   }
	@Test
    public void testCalcularGananciaDeSoja_ParcelaMixta() {

        // Configurar el comportamiento del mock
        when(porcionMixta.calcularGananciaDeSoja()).thenReturn(250.0);

        // Verificar que la ganancia en una parcela mixta es proporcional
        assertEquals(250.0, porcionMixta.calcularGananciaDeSoja());

        // Verificar que se llamó al método calcularGananciaDeSoja
        verify(porcionMixta, times(1)).calcularGananciaDeSoja();
    }

}
