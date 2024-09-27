package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;
import ar.edu.unq.po2.tp4.Producto;

public class SuperMercado {
	private String nombreSM;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public SuperMercado(String nombre, String dir) {
		this.nombreSM  = nombre;
		this.direccion = dir;
		this.productos = new ArrayList();
	}
	public void agregarProducto(Producto prod) {
		productos.add(prod);
    }
	public int cantidadDeProductos() {
		int productosTotales = 0;
		for(Producto prod : productos) {
			productosTotales = 1 + productosTotales;
		}
		return(productosTotales);
	}
	
	public double precioTotales() {
		double preciosTotalesDelSM = 0;
		for(Producto prod : productos) {
			preciosTotalesDelSM = preciosTotalesDelSM + prod.getPrecio();
		}
		return(preciosTotalesDelSM);
	}
	
}
//precioTotalesDescuentosPerso = precioTotalesDescuentosPerso + prod.getPrecio();