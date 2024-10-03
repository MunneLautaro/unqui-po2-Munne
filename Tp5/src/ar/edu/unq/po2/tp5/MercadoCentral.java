package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;


public class MercadoCentral {
	private double montoTotal;
	private List<Producto> productos;
	
	public MercadoCentral() {
		this.montoTotal= 0;
		this.productos = new ArrayList ();  
	}
	
	public void registrarProducto(Producto prod) {
		if (prod.getStock() > 0) {
			prod.disminuirStock();
			productos.add(prod);
			double precio = prod.calcularPrecio();
	        montoTotal += precio;
		}
	}
		public void registrarFactura(Factura factura, AgenciaRecaudadora agencia) {
	        double montoFactura = factura.montoAPagar();
	        montoTotal += montoFactura;  // Acumula el monto de la factura
	        agencia.registrarPago(factura);  // Notifica a la agencia
	        
	}
	public double montoTotalAPagar() {
		return(montoTotal);
	}
}
