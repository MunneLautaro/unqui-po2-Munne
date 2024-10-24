package ar.edu.unq.po2.Composite2Warcraf;

public class Ingeniero extends Personaje{
	private int lajas;
	private Punto posicionActual;
	public Ingeniero(int lajas, Punto punto) {
		this.lajas=lajas;
		this.posicionActual = punto;
	}
	
	public int getLajas(){
		return this.lajas;
	}

	@Override
	public void caminar(Punto punto) {
		while (this.posicionActual != punto) {
			colocarLaja();
			avanzarADestino(punto);
		}
	}
	
	public void avanzarADestino(Punto punto) {
		int nuevaPosicionX = this.posicionActual.getX();
		int nuevaPosicionY = this.posicionActual.getY();		
		
		if (nuevaPosicionX < punto.getX()) {
			nuevaPosicionX++;
		} else if (nuevaPosicionX > punto.getX()) {
			nuevaPosicionX--;
		}
		
		if (nuevaPosicionY < punto.getY()) {
			nuevaPosicionY++;
		} else if (nuevaPosicionY > punto.getY()) {
			nuevaPosicionY--;
		}
		posicionActual = new Punto(nuevaPosicionX, nuevaPosicionY);
	}
	public int colocarLaja() {
		return this.lajas--;
	}
	public Punto getPosicion() {
		return(this.posicionActual);
	}
}
