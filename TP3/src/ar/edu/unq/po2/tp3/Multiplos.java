package ar.edu.unq.po2.tp3;

public class Multiplos {
	
public int elMayor (int n, int m) {
		
		if(n>m) {
			return(n);
		}
		else {
			return(m);
		}
	}
public int elMayorMultiploDe (int x) {
	
	int n= 0;
	
	while(x*n<=1000) {
		n=n+1;
	}
	return(x*(n-1));
}
	public int elMayorMultiplo (int x, int y) {
		
		int n = elMayorMultiploDe (x);
		int m = elMayorMultiploDe (y);
		int resultado= 0;
		if (elMayor (n, m)<=1000) {
			resultado= (elMayor (n, m));
		}
		else {
			resultado= (-1);
		}
		return(resultado);
	}
	
}