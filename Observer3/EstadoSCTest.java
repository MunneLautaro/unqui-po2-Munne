package ar.edu.unq.po2.Observer3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoSCTest {

	private SistemaDeJuego sis;
	private Pregunta preg1;
	private Pregunta preg2;
	private Pregunta preg3;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	private Persona p6;
	private EstadoSinComenzar esc;
	private EstadoEnCurso eec;
	
	@BeforeEach
	void setUp() throws Exception {
		sis   = mock(SistemaDeJuego.class);
		preg1 = mock(Pregunta.class);
		preg2 = mock(Pregunta.class);
		preg3 = mock(Pregunta.class);
		p1    = mock(Persona.class);
		p2    = mock(Persona.class);
		p3    = mock(Persona.class);
		p4    = mock(Persona.class);
		p5    = mock(Persona.class);
		p6    = mock(Persona.class);
		esc   = new EstadoSinComenzar();
		eec   = mock(EstadoEnCurso.class);
	}

	@Test
	void testComenzarPartida() {
		when(sis.cantidadDeParticipantes()).thenReturn(5);
		when(sis.getParticipantesDelJuego()).thenReturn(Arrays.asList(p1, p2, p3, p4, p5));
		
		esc.notificarInicio(sis);
		
		verify(sis).setEstado(any());
		verify(p1).recibirNotiDeInicio();
		verify(p2).recibirNotiDeInicio();
		verify(p3).recibirNotiDeInicio();
		verify(p4).recibirNotiDeInicio();
		verify(p5).recibirNotiDeInicio();
	}
	@Test
	void testSeAgregaUnJugador() {

		
		when(sis.cantidadDeParticipantes()).thenReturn(3);
		when(sis.getParticipantesDelJuego()).thenReturn(Arrays.asList(p1, p2, p3));
		
		esc.registrarJugador(sis, p4);
		
		verify(p4).solicitudAceptada();
	}
	@Test
	void testNoHayMasSlot() {

		
		when(sis.cantidadDeParticipantes()).thenReturn(5);
		when(sis.getParticipantesDelJuego()).thenReturn(Arrays.asList(p1, p2, p3, p4, p5));
		
		esc.registrarJugador(sis, p6);
		
		verify(p6, never()).solicitudAceptada();
		verify(sis).setEstado(any());
		verify(p1).recibirNotiDeInicio();
		verify(p2).recibirNotiDeInicio();
		verify(p3).recibirNotiDeInicio();
		verify(p4).recibirNotiDeInicio();
		verify(p5).recibirNotiDeInicio();
	}


}
