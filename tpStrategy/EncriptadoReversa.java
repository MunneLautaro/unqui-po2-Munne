package ar.edu.unq.po2.tpStrategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncriptadoReversa implements IEncriptarStrategy{
	@Override
	public String encriptar(String texto) {
	    return Arrays.stream(texto.split(" ")) // Convierte el arreglo de palabras en un Stream
	            .map(palabra -> new StringBuilder(palabra).reverse().toString()) // Invierte cada palabra
	            .collect(Collectors.joining(" ")); // Une las palabras invertidas con un espacio
	}

	@Override
	public String desencriptar(String texto) {
		// TODO Auto-generated method stub
		return encriptar(texto);
	}
}
