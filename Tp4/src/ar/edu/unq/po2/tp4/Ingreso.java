package ar.edu.unq.po2.tp4;


public class Ingreso {
	private String mesPercep; 
	private String concepto;
	private double monto;
	public Ingreso(String fecha, String concepto, double monto) {
		this.mesPercep = fecha;
		this.concepto  = concepto;
		this.monto     = monto;
	}
	
	public double getMonto() {
		return(monto);
	}
	public double getMontoImponible() {
		return(monto);
	}
}
