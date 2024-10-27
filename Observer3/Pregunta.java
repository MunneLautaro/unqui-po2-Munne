package ar.edu.unq.po2.Observer3;

public class Pregunta {
	private String pregunta;
	private String respuesta;
	public Pregunta(String pregunta, String respuesta) {
		this.pregunta  = pregunta;
		this.respuesta = respuesta;
	}
	public boolean esRespuestaCorrecta(String respuesta) {
		return respuesta.toLowerCase() == this.respuesta.toLowerCase();
	}
	public String getRespuesta(){
		return this.respuesta;
	}
	public String getPregunta(){
		return this.pregunta;
	}
}

