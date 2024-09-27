package ar.edu.unq.po2.tp4;
import java.util.ArrayList;

public class Trabajador {
	ArrayList <Ingreso> listaDeIngresos;
	public Trabajador() {
		this.listaDeIngresos = new ArrayList();
	}
	 public void agregarIngreso(Ingreso ingreso) {
		 listaDeIngresos.add(ingreso);
	    }
	 public double getTotalPercibido() {
		 double totalPercibido= 0;
		 for(Ingreso ingreso :listaDeIngresos) {
			 totalPercibido = totalPercibido + ingreso.getMonto();
		 }
		 return(totalPercibido);
	 }
	 
	 public double getMontoImponible() {
		 double totalImponible= 0;
		 for(Ingreso ingreso :listaDeIngresos) {
			 totalImponible = totalImponible + ingreso.getMontoImponible();
		 }
		 return(totalImponible);
	 }
	 public double getImpuestoAPagar() {
		 double totalImpuestosAPagar = getMontoImponible()*0.02;
		 
		 return(totalImpuestosAPagar);
	 }
	 
}
