package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombreDeProducto;
	private double precioDeProducto;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		
		this.nombreDeProducto   = nombre;
		this.precioDeProducto   = precio;
		this.esPrecioCuidado    = false;
		
	}
	
	
	public double getPrecio() {
		return(precioDeProducto);
	}
	public void cambiarEstadoDePrecio(boolean estado) {
		this.esPrecioCuidado = estado;
	}
	
}
