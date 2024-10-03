package ar.edu.unq.po2.tp5;

public class Producto implements IProducto{
	protected  int stock;
	protected  String nombre;
	protected  double precio;
	public Producto(int stock, String nombre, double precio) {
		this.stock= stock; 
		this.nombre=nombre;
		this.precio=precio;
	}
	@Override
	public void disminuirStock() {
        stock--;
    }
	@Override
	public double calcularPrecio(){
		return precio;
	}
	public int getStock() {
	      return stock;
	    }

	public String getNombre() {
	      return nombre;
	    }
	
}
