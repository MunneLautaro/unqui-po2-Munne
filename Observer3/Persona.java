package ar.edu.unq.po2.Observer3;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private List<Pregunta> preguntas;
	public Persona(String nombre) {
		this.nombre = nombre;
		this.preguntas = new ArrayList();
	}
	
	public void solicitarEntrada(SistemaDeJuego sisDeJuego) {
		sisDeJuego.registrarJugador(this);
		
	}
	public void responder(String respuesta,SistemaDeJuego sisDeJuego) {
		sisDeJuego.verificarRespuesta(preguntas.getFirst(), respuesta, this);
		preguntas.removeFirst();
	}
	public void recibirNotiDeInicio() {
		System.out.print("El juego inicio");
	}
	public void respuestaIncorrecta() {
		System.out.print("Es respuesta Incorrecta");
	}
	public void respuestaCorrecta() {
		System.out.print("Es respuesta Correcta");
	}
	public void solicitudAceptada() {
		System.out.print("Estas adentro");
	}
	public String getNombre() {
		return this.nombre;
	}
}
