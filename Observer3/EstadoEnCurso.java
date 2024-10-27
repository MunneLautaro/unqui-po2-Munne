package ar.edu.unq.po2.Observer3;

public class EstadoEnCurso implements IEstado {

	@Override
	public void notificarInicio(SistemaDeJuego sisDeJuego) {
		

	}

	@Override
	public void registrarJugador(SistemaDeJuego sisDeJuego, Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminarJuego(SistemaDeJuego sisDeJuego) {
		if (sisDeJuego.cantidadDeRespuestasCorrectas() == sisDeJuego.cantPreguntasDelJuego()){
		sisDeJuego.setEstado(new EstadoSinComenzar());
		} 
	}

	@Override
	public void verificarRespuesta(SistemaDeJuego sisDeJuego,Pregunta pregunta ,String respuesta, Persona persona) {
		if (pregunta.esRespuestaCorrecta(respuesta)){
			sisDeJuego.respuestaCorrecta(persona);
		} else {
			sisDeJuego.respuestaIncorrecta(persona);
		}

	}

}
