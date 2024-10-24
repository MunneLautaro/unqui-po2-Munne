package ar.edu.unq.po2.tp9;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TestCarta {
	private Carta carta1;
	private Carta carta2;
	@BeforeEach
	void setUp() throws Exception {
		carta1= new Carta(ValorCarta.A, Palo.CORAZONES);
		carta2= new Carta(ValorCarta.K, Palo.CORAZONES);
	}

	@Test
	void testEsMayor() {
		assertTrue(Carta.esMayor(carta1, carta2));
	}
	@Test
	void testSonElMismoPalo() {
		
		assertTrue(Carta.esMismoPalo(carta2, carta1));
	}
}
