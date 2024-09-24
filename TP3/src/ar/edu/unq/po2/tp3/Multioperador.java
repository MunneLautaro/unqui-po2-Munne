package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	public void addNumber(int number) {
		this.listaDeNumeros.add(number);
		
	}
	public int suma() {
		int sumaTotal = 0;
		for(int n : listaDeNumeros) {
			
			sumaTotal = sumaTotal +n;
		}
		return(sumaTotal);
	}
	
	public int resta() {
		int restaTotal = 0;
		for(int n : listaDeNumeros) {
			
			restaTotal = restaTotal - n;
		}
		return(restaTotal);
	}
	public int multiplicacion() {
		int productoTotal = 1;
		for(int n : listaDeNumeros) {
			
			productoTotal = productoTotal * n;
		}
		return(productoTotal);
	}
	
}