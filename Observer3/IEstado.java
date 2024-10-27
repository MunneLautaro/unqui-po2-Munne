package ar.edu.unq.po2.Observer3;

public interface IEstado {
	public void notificarInicio(SistemaDeJuego sisDeJuego);
	public void registrarJugador(SistemaDeJuego sisDeJuego, Persona persona);
	public void terminarJuego(SistemaDeJuego sisDeJuego);
	public void verificarRespuesta(SistemaDeJuego sisDeJuego, Pregunta pregunta,String respuesta, Persona persona);
}
