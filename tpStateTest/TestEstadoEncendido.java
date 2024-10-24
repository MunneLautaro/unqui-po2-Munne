package ar.edu.unq.po2.tpState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEstadoEncendido {

	private MaquinaDeJuegos maq;
	private EstadoApagado ea;
	private EstadoEncendido ee;
	private EstadoEsperandoFicha eef;
	private EstadoSolitarioJugando esj;
	private EstadoCoopJugando ecj;
	@BeforeEach
	void setUp() throws Exception {
		maq  = mock (MaquinaDeJuegos.class);
		ea   =  mock (EstadoApagado.class);
		ee   = new EstadoEncendido();
		eef  = mock(EstadoEsperandoFicha.class);
		esj  = mock(EstadoSolitarioJugando.class);
		ecj  = mock(EstadoCoopJugando.class);
	}

	@Test
	void test() {
		ee.presionarInicio(maq);
		verify(maq).setEstado(any());
	}
}
