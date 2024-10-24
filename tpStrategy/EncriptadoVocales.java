package ar.edu.unq.po2.tpStrategy;

import java.util.stream.Collectors;

public class EncriptadoVocales implements IEncriptarStrategy{
	
	 private static final String VOCALS = "aeiou";

	    @Override
	    public String encriptar(String texto) {
	        return texto.chars()
	            .mapToObj(c -> {
	                char ch = (char) c;
	                int idx = VOCALS.indexOf(ch);
	                if (idx != -1) {
	                    return String.valueOf(VOCALS.charAt((idx + 1) % VOCALS.length()));
	                }
	                return String.valueOf(ch);
	            })
	            .collect(Collectors.joining());
	    }

	    @Override
	    public String desencriptar(String texto) {
	        return texto.chars()
	            .mapToObj(c -> {
	                char ch = (char) c;
	                int idx = VOCALS.indexOf(ch);
	                if (idx != -1) {
	                    return String.valueOf(VOCALS.charAt((idx - 1 + VOCALS.length()) % VOCALS.length()));
	                }
	                return String.valueOf(ch);
	            })
	            .collect(Collectors.joining());
	    }
}
