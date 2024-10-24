package ar.edu.unq.po2.tpState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testMaquinaJuego {
	private MaquinaDeJuegos maq;
	private EstadoApagado ea;
	private EstadoEncendido ee;
	private EstadoEsperandoFicha eef;
	private EstadoSolitarioJugando esj;
	private EstadoCoopJugando ecj;
	
	@BeforeEach
	void setUp() throws Exception {
		maq  = new MaquinaDeJuegos();
		ea   = mock(EstadoApagado.class);
		ee   = mock(EstadoEncendido.class);
		eef  = mock(EstadoEsperandoFicha.class);
		esj  = mock(EstadoSolitarioJugando.class);
		ecj  = mock(EstadoCoopJugando.class);
	}

	@Test
	void testPrender() {
		maq.setEstado(ea);
		maq.encender();
		verify(ea).encender(maq);
		assertEquals(ea, maq.getEstado());
	}
	@Test
	void testPresionarInicio() {
		maq.setEstado(ee);
		maq.iniciaJuego();
		verify(ee).presionarInicio(maq);
	}
	@Test
	void testInsertarMoneda() {
		maq.setEstado(eef);
		maq.ingresarFichas();
		verify(eef).insertarFicha(maq);
	}
	@Test
	void testPasarAModoUnJugado() {
		maq.setEstado(eef);
		maq.iniciaJuego();
		verify(eef).presionarInicio(maq);
	}
	@Test
	void testUnJugador() {
		maq.setEstado(esj);
		maq.terminarJuego();
		verify(esj).terminarJuego(maq);
	}
	@Test
	void testDosJugadores() {
		maq.setEstado(ecj);
		maq.terminarJuego();
		verify(ecj).terminarJuego(maq);
	}
}
