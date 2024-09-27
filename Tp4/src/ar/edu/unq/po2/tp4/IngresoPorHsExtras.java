package ar.edu.unq.po2.tp4;

import java.util.Date;

public class IngresoPorHsExtras extends Ingreso{
	private double hsExtras;
	public IngresoPorHsExtras (String fecha, String concepto, double monto, double hsExtras) {
		super(fecha, concepto, monto);
		this.hsExtras = hsExtras;
	}
	@Override
	public double getMontoImponible() {
		return(0);
	}
}
