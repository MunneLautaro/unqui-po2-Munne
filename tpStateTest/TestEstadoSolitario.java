package ar.edu.unq.po2.tpState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEstadoSolitario {
	private MaquinaDeJuegos maq;
	private EstadoApagado ea;
	private EstadoEncendido ee;
	private EstadoEsperandoFicha eef;
	private EstadoSolitarioJugando esj;
	private EstadoCoopJugando ecj;
	@BeforeEach
	void setUp() throws Exception {
		maq  = mock (MaquinaDeJuegos.class);
		ea   = mock (EstadoApagado.class);
		ee   = mock (EstadoEncendido.class);
		eef  = mock (EstadoEsperandoFicha.class);
		esj  = new EstadoSolitarioJugando();
		ecj  = mock(EstadoCoopJugando.class);
	}

	@Test
	void testTerminarJuego() {
		esj.terminarJuego(maq);
		verify(maq).setEstado(any());
	}


}
