package ar.edu.unq.po2.tp5;

public class Factura {
	double costoDeUnidad;
	int cantidadDeServicios;
	double impuestos;
	public Factura(double costoDeUnidad, int cantidadDeServicios, double impuestos) {
		this.costoDeUnidad= costoDeUnidad;
		this.cantidadDeServicios= cantidadDeServicios;
		this.impuestos = impuestos;
	}
	public double montoAPagar() {
		return costoDeUnidad*cantidadDeServicios+impuestos*cantidadDeServicios;
	}
}
