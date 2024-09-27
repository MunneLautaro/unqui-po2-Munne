package ar.edu.unq.po2.tp4;



public class ProductoPrimeraNecesidad extends Producto{
	private int descuentoProd;
	public ProductoPrimeraNecesidad(String nombre, double precio, int descuento) {
		super(nombre, precio);
		this.descuentoProd=descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
		this.descuentoProd=0;
	}
	
	@Override
	public double getPrecio() {
		double precioProd=0;
		if(this.descuentoProd==0) {
			precioProd = super.getPrecio()*0.9;	
		}else {
			precioProd =super.getPrecio()-((super.getPrecio()*this.descuentoProd)/100);
		}
		return(precioProd);
	}
	
	
	
	
	
}
