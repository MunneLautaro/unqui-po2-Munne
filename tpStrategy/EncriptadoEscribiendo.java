package ar.edu.unq.po2.tpStrategy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncriptadoEscribiendo implements IEncriptarStrategy{
	 @Override
	    public String encriptar(String texto) {
	        return texto.toLowerCase().chars()
	            .mapToObj(c -> c == ' ' ? "0" : String.valueOf(c - 'a' + 1))
	            .collect(Collectors.joining(","));
	    }

	    @Override
	    public String desencriptar(String texto) {
	        return Arrays.stream(texto.split(","))
	            .map(num -> {
	                int n = Integer.parseInt(num);
	                return n == 0 ? " " : String.valueOf((char) ('a' + n - 1));
	            })
	            .collect(Collectors.joining());
	    }
}
