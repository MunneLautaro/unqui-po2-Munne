package ar.edu.unq.po2.tp9;

public class Carta {
	private ValorCarta valor;
	private Palo palo;
    public Carta(ValorCarta valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public ValorCarta getValor() {
        return this.valor;
    }

    public Palo getPalo() {
        return this.palo;
    }
    public Carta elMayor(Carta c1, Carta c2) {
    	if (c1.getValor().getValor()>c2.getValor().getValor()) {
    		return c1;
    	}else {
    		return c2;
    	}	
    }
    
    public static boolean esMismoPalo(Carta c1, Carta c2) {
    	return (c1.getPalo().getPalo()==c2.getPalo().getPalo());
    }
    
    
    public static boolean esMayor(Carta c1, Carta c2) {
    	return (c1.getValor().getValor()>c2.getValor().getValor());
    }
    

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
