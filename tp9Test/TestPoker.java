package ar.edu.unq.po2.tp9;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestPoker {
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
		pS     = new PokerStatus(carta, carta2, carta3, carta4, carta5); 
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
		pS2 =  new PokerStatus(carta6, carta7, carta8, carta9, carta10); 
		pS2.agregarCarta(carta6);
		pS2.agregarCarta(carta7);
		pS2.agregarCarta(carta8);
		pS2.agregarCarta(carta9);
		pS2.agregarCarta(carta10);
	}

	@Test
	void testHayPoker() {
		//exercise
		when(carta.getValor()).thenReturn(ValorCarta.A);
		when(carta2.getValor()).thenReturn(ValorCarta.A);
		when(carta3.getValor()).thenReturn(ValorCarta.A);
		when(carta4.getValor()).thenReturn(ValorCarta.A);
		when(carta5.getValor()).thenReturn(ValorCarta.K);
		//verify
		assertTrue(pS.verificarPoker(pS.getMano()));
	}
	@Test
	void testHayColor() {
		//exercise
		when(carta.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta2.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta3.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta4.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta5.getPalo()).thenReturn(Palo.CORAZONES);
		//verify
		assertTrue(pS.verificarColor(pS.getMano()));
	}
	@Test
	void testHayTrio() {
		//exercise
		when(carta.getValor()).thenReturn(ValorCarta.K);
		when(carta2.getValor()).thenReturn(ValorCarta.A);
		when(carta3.getValor()).thenReturn(ValorCarta.A);
		when(carta4.getValor()).thenReturn(ValorCarta.A);
		when(carta5.getValor()).thenReturn(ValorCarta.K);
		//verify
		assertTrue(pS.verificarTrio(pS.getMano()));
	}
	@Test
	void testHayJugada() {
		//exercise
		when(carta.getValor()).thenReturn(ValorCarta.A);
		when(carta2.getValor()).thenReturn(ValorCarta.A);
		when(carta3.getValor()).thenReturn(ValorCarta.A);
		when(carta4.getValor()).thenReturn(ValorCarta.A);
		when(carta5.getValor()).thenReturn(ValorCarta.K);
		when(carta.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta2.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta3.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta4.getPalo()).thenReturn(Palo.CORAZONES);
		when(carta5.getPalo()).thenReturn(Palo.CORAZONES);
		//verify
		assertEquals(Jugada.Poker, (pS.verificar(pS.getMano())));
	}
	
	
	@Test
	void testMejorMano() {
		 {
				when(carta.getValor()).thenReturn(ValorCarta.A);
				when(carta2.getValor()).thenReturn(ValorCarta.A);
				when(carta3.getValor()).thenReturn(ValorCarta.OCHO);
				when(carta4.getValor()).thenReturn(ValorCarta.A);
				when(carta5.getValor()).thenReturn(ValorCarta.K);
				when(carta.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta2.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta3.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta4.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta5.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta6.getValor()).thenReturn(ValorCarta.A);
				when(carta7.getValor()).thenReturn(ValorCarta.A);
				when(carta8.getValor()).thenReturn(ValorCarta.A);
				when(carta9.getValor()).thenReturn(ValorCarta.A);
				when(carta10.getValor()).thenReturn(ValorCarta.K);
				when(carta6.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta7.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta8.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta9.getPalo()).thenReturn(Palo.CORAZONES);
				when(carta10.getPalo()).thenReturn(Palo.CORAZONES);
				assertEquals(pS2.getMano(), (PokerStatus.comparar(pS.getMano(), pS2.getMano() )));
			}
	}
}
