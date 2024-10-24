package ar.edu.unq.po2.StateMp3;

public class MP3 {
	private IModoMp3 modo;
	public MP3() {
		this.modo= new ModoSeleccion();
	}
	
	public void play() {
		this.modo.play(this);
	}
	public void stop() {
		this.modo.stop(this);
	}
	
	public void pause() {
		this.modo.pause(this);
	}
	
	public void setModo(IModoMp3 modo) {
		this.modo = modo;
	}
	
}
