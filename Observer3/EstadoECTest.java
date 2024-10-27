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

class EstadoECTest {

	private SistemaDeJuego sis;
	private Pregunta preg1;
	private Pregunta preg2;
	private Pregunta preg3;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
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
		eec   = new EstadoEnCurso();
	}

	@Test
	void testSeTerminaElJuego() {
		when(sis.cantidadDeRespuestasCorrectas()).thenReturn(3);
		when(sis.cantPreguntasDelJuego()).thenReturn(3);
		
		eec.terminarJuego(sis);
		
		verify(sis).setEstado(any());
	}
	@Test
	void testSeRegistraUnaRespuesta() {
		when(preg1.esRespuestaCorrecta("Hola")).thenReturn(true);

		eec.verificarRespuesta(sis, preg1, "Hola", p1);
		
		verify(sis).respuestaCorrecta(p1);
		verify(sis, never()).respuestaIncorrecta(p1);
	}
	@Test
	void testNoSeIniciaJuego() {
		eec.notificarInicio(sis);
		
		verify(sis, never()).setEstado(any());
	}
	@Test
	void testNoSeAgregaUnJugador() {

		
		when(sis.cantidadDeParticipantes()).thenReturn(3);
		when(sis.getParticipantesDelJuego()).thenReturn(Arrays.asList(p1, p2, p3));
		
		eec.registrarJugador(sis, p4);
		
		verify(p4, never()).solicitudAceptada();
	}

}
