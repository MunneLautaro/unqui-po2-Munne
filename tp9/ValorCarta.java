package ar.edu.unq.po2.tp9;

public enum ValorCarta {
    A(14), K(13), Q(12), J(11), DIEZ(10), NUEVE(9), OCHO(8), SIETE(7), 
    SEIS(6), CINCO(5), CUATRO(4), TRES(3), DOS(2);

    private final int valor;

    ValorCarta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}