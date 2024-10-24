package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugada {
	private Carta carta;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private PokerStatus pS;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	private PokerStatus pS2;
	@BeforeEach
	void setUp() throws Exception {
		//Set up
		carta  = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		pS = mock(PokerStatus.class);
		pS.agregarCarta(carta);
		pS.agregarCarta(carta2);
		pS.agregarCarta(carta3);
		pS.agregarCarta(carta4);
		pS.agregarCarta(carta5);
		
		carta6  = mock(Carta.class);
		carta7 = mock(Carta.class);
		carta8 = mock(Carta.class);
		carta9 = mock(Carta.class);
		carta10 = mock(Carta.class);
		pS2 = mock(PokerStatus.class);
		pS2.agregarCarta(carta6);
		pS2.agregarCarta(carta7);
		pS2.agregarCarta(carta8);
		pS2.agregarCarta(carta9);
		pS2.agregarCarta(carta10);
	}
	@Test
	void test() {
		
	}

}
