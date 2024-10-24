package ar.edu.unq.po2.StateMp3;

public class ModoSeleccion implements IModoMp3{

	@Override
	public void play(MP3 mp3) {
		ModoReprod modo = new ModoReprod();
		mp3.setModo(modo);
	}

	@Override
	public void stop(MP3 mp3) {
		// TODO Auto-generated method stub
		 System.out.println("Error: No se puede detener, no hay ninguna canción reproduciéndose.");
	}

	@Override
	public void pause(MP3 mp3) {
		System.out.println("Error: No se puede pausar, no hay ninguna canción reproduciéndose.");
		
	}



}
