package ar.edu.unq.po2.Observer1;

public class Titulo extends Interes{
	private String nombre;
	public Titulo(String nombre) {
		super();
		this.nombre=nombre;
	}
	
	@Override
	public boolean cumpleCon(Articulo articulo) {
		return articulo.getTitulo()==this.nombre;
	}
	
}
