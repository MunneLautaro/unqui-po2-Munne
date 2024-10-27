package ar.edu.unq.po2.Observer3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeJuegoTest {
	private SistemaDeJuego sis;
	private Pregunta preg1;
	private Pregunta preg2;
	private Pregunta preg3;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	private EstadoSinComenzar esc;
	private EstadoEnCurso eec;
	
	@BeforeEach
	void setUp() throws Exception {
		sis = new SistemaDeJuego();
		preg1 = mock(Pregunta.class);
		preg2 = mock(Pregunta.class);
		preg3 = mock(Pregunta.class);
		p1    = mock(Persona.class);
		p2    = mock(Persona.class);
		p3    = mock(Persona.class);
		p4    = mock(Persona.class);
		p5    = mock(Persona.class);
		esc   = mock(EstadoSinComenzar.class);
		eec   = mock(EstadoEnCurso.class);
	}

	@Test
	void testAgregarPersona() {
		sis.setEstado(esc);
		sis.registrarJugador(p1);
		
		verify(esc).registrarJugador(sis, p1);
	}
	@Test
	void testSeNotificaQueEmpiezaElJuego() {
		sis.setEstado(esc);
		//Para Test De ESTADO
		//sis.registrarJugador(p1);
		//sis.registrarJugador(p2);
		//sis.registrarJugador(p3);
		//sis.registrarJugador(p4);
		//sis.registrarJugador(p5);
		sis.notificarInicio();
		
		
		verify(esc).notificarInicio(sis);

	}
	@Test
	void testVerificarRespuesta() {
		sis.setEstado(eec);
		//Sirve para los test de los ESTADO
		//when(preg1.getPregunta()).thenReturn("Hola?");
		//when(preg1.getRespuesta()).thenReturn("Hola");
		//sis.agregarPregunta(preg1);
		//sis.registrarJugador(p1);
		//sis.verificarRespuesta(preg1, "Hola", p1);
		sis.verificarRespuesta(preg1, "Hola", p1);
		
		
		verify(eec).verificarRespuesta(sis, preg1, "Hola", p1);
	}
	@Test
	void testTerminaElJuego() {
		sis.setEstado(eec);
		sis.terminarJuego();
		verify(eec).terminarJuego(sis);
	}

}
