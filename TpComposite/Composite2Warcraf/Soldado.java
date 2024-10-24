package ar.edu.unq.po2.Composite2Warcraf;

public class Soldado extends Personaje{
	private Punto posicionActual;
	public Soldado(Punto punto) {
		this.posicionActual = punto;
	}
	
	@Override
	public void caminar(Punto punto) {
		while (this.posicionActual != punto) {
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
}
