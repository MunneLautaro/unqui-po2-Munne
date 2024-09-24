package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmandoNumeros2 {
	ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	public void addNumber(int number) {
		this.listaDeNumeros.add(number);
		
	}	

	public int elNumeroConMasPares () {
		
		int primeroDeLaLista= listaDeNumeros.get(0);
		int cantidadDeParesMaximo = 0;
		
		for(int n : listaDeNumeros) {
		
			 if ((cantPares(primeroDeLaLista)>=(cantPares(n)))) {
				
				 cantidadDeParesMaximo= primeroDeLaLista;
				
			}
			 else cantidadDeParesMaximo = n;
			 
		}
		return(cantidadDeParesMaximo);
	}
	public int elMayor (int n, int m) {
		
		if(n>m) {
			return(n);
		}
		else {
			return(m);
		}
	}
	public int cantPares (int numero) {

        int cantidadDePares = 0;
        int restoDeNumero = numero%10;
        while(restoDeNumero>0&& numero>9) {
        	restoDeNumero = numero%10;
        	numero = numero/10;

                if(restoDeNumero % 2 == 0) {
                cantidadDePares = cantidadDePares + 1;
                
            }

        }
        
    
	
	 if(numero % 2 == 0) {
         cantidadDePares = cantidadDePares + 1;
         
     }
	 return(cantidadDePares);
	}
}
	