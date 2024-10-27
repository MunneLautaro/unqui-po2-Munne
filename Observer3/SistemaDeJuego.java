package ar.edu.unq.po2.Observer3;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeJuego {
	private List <Pregunta> preguntas;
	private List <Persona> participantes;
	private IEstado estado;
	private int respuestasCorrectas;
	public SistemaDeJuego() {
		this.preguntas     = new ArrayList();
		this.participantes = new ArrayList();
		this.estado        = new EstadoSinComenzar();
		this.respuestasCorrectas = 0;
	}
	
	public void sumarRespuestaCorrecta() {
		this.respuestasCorrectas++;
	}
	public int cantidadDeRespuestasCorrectas(){
		return this.respuestasCorrectas;
	}
	public void agregarParticipante(Persona persona) {
		participantes.add(persona);
	}
	public void agregarPregunta(Pregunta pregunta) {
		preguntas.add(pregunta);
	}
	public void removerParticipante(Persona persona) {
		participantes.remove(persona);
	}
	public void removerPregunta(Pregunta pregunta) {
		preguntas.remove(pregunta);
	}
	public void setEstado(IEstado estado) {
		this.estado = estado;
	}
	public void notificarInicio() {
		this.estado.notificarInicio(this);
	}
	public void registrarJugador(Persona persona) {
		this.estado.registrarJugador(this, persona);
	}
	public void terminarJuego() {
		this.estado.terminarJuego(this);
	}
	public void verificarRespuesta(Pregunta pregunta, String respuesta, Persona persona) {
		this.estado.verificarRespuesta(this, pregunta,respuesta, persona);
	}
	public int cantidadDeParticipantes() {
		return this.participantes.size();
	}
	public List <Persona> getParticipantesDelJuego(){
		return this.participantes;
	}
	public List <Pregunta> getPreguntasDelJuego(){
		return this.preguntas;
	}
	public int cantPreguntasDelJuego(){
		return this.preguntas.size();
	}

	public void respuestaCorrecta(Persona persona) {
		this.sumarRespuestaCorrecta();
		persona.respuestaCorrecta();
	}

	public void respuestaIncorrecta(Persona persona) {
		persona.respuestaIncorrecta();
	}
 }
