package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto{
	
	public ProductoDeCooperativa (int stock, String nombre, double precio) {
		super(stock, nombre, precio);
		
	}
	@Override
	public double calcularPrecio(){
		return precio*0.9;
	}
}
