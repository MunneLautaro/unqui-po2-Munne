package ar.edu.unq.po2.Observer3;

public class EstadoSinComenzar implements IEstado{

	@Override
	public void notificarInicio(SistemaDeJuego sisDeJuego) {
		if (sisDeJuego.cantidadDeParticipantes() == 5){
		sisDeJuego.getParticipantesDelJuego().stream()
		.forEach(p-> p.recibirNotiDeInicio());
		sisDeJuego.setEstado(new EstadoEnCurso());
		}
	}

	@Override
	public void registrarJugador(SistemaDeJuego sisDeJuego, Persona persona) {
		if (sisDeJuego.cantidadDeParticipantes() < 5){
			sisDeJuego.agregarParticipante(persona);
			persona.solicitudAceptada();
			} else if (sisDeJuego.cantidadDeParticipantes() == 5) {
				this.notificarInicio(sisDeJuego);
			}
	}

	@Override
	public void terminarJuego(SistemaDeJuego sisDeJuego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarRespuesta(SistemaDeJuego sisDeJuego, Pregunta pregunta,String respuesta, Persona persona) {
		// TODO Auto-generated method stub
		
	}

}
