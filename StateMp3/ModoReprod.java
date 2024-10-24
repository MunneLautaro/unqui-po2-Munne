package ar.edu.unq.po2.StateMp3;

public class ModoReprod implements IModoMp3{

	@Override
	public void play(MP3 mp3) {
		System.out.println("Error: ya se esta reproduciendo.");
		
	}

	@Override
	public void stop(MP3 mp3) {
		ModoSeleccion modo = new ModoSeleccion();
		mp3.setModo(modo);
		
	}

	@Override
	public void pause(MP3 mp3) {
		ModoPausa modo = new ModoPausa();
		mp3.setModo(modo);
		
	}

	

}
