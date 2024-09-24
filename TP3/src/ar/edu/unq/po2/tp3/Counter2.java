package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter2 {

	ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	public void addNumber(int number) {
		this.listaDeNumeros.add(number);
		
	}
	
	
	
	public int cantPares () {
		
		int cantidadDePares = 0;
		
		for(int n : listaDeNumeros) {
		
			if(n % 2 == 0) {
				
				cantidadDePares = cantidadDePares + 1;
			}
			
		}
		return(cantidadDePares);
	} 
	
public int cantImpares () {
		
		int cantidadDeImpares = 0;
		
		for(int n : listaDeNumeros) {
		
			if(n % 2 != 0) {
				
				cantidadDeImpares = cantidadDeImpares + 1;
			}
			
		}
		return(cantidadDeImpares);
	} 

public int cantMultiplos (int num) {
	
	int cantDeMultiplos = 0;
	
	for(int n : listaDeNumeros) {
	
		if(n % num == 0) {
			
			cantDeMultiplos = cantDeMultiplos + 1;
		}
		
	}
	return(cantDeMultiplos);
} 

}
