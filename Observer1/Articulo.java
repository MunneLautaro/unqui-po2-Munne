package ar.edu.unq.po2.Observer1;

import java.util.List;

public class Articulo {
	private String titulo;
	private List<String> autores;
	private String tipo;
	private String filiacion;
	private String pais;
	private String palabraClave;
	
	public Articulo(String titulo, List<String> autores, String tipo, String filiacion, String pais, String palabraClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.tipo = tipo;
		this.filiacion = filiacion;
		this.pais = pais;
		this.palabraClave = palabraClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public String getTipo() {
		return tipo;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public String getPais() {
		return pais;
	}


	public String getPalabraClave() {
		return palabraClave;
	}

}
