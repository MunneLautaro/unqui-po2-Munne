package ar.edu.unq.po2.StateMp3;

public class ModoPausa implements IModoMp3{

	@Override
	public void play(MP3 mp3) {
		System.out.println("Error: No se puede reproducir.");
	}

	@Override
	public void stop(MP3 mp3) {
		ModoSeleccion modo = new ModoSeleccion();
		mp3.setModo(modo);
		
	}

	@Override
	public void pause(MP3 mp3) {
		ModoReprod modo = new ModoReprod();
		mp3.setModo(modo);
	}

}
