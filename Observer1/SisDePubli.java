package ar.edu.unq.po2.Observer1;

import java.util.ArrayList;
import java.util.List;

public class SisDePubli {
	private List<Articulo> articulos;      // Lista de artículos publicados
    private List<Interes> intereses;       // Lista de intereses para suscripciones

    public SisDePubli() {
        this.articulos = new ArrayList<>();
        this.intereses = new ArrayList<>();
    }

    // Agrega un interés al sistema para permitir suscripciones
    public void agregarInteres(Interes interes) {
        intereses.add(interes);
    }

    // Agrega un artículo y notifica a los interesados si coincide con alguno de sus intereses
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
        notificarIntereses(articulo);
    }
 // Agrega un interés al sistema para permitir suscripciones
    public void removerInteres(Interes interes) {
        intereses.remove(interes);
    }

    // Agrega un artículo y notifica a los interesados si coincide con alguno de sus intereses
    public void removerArticulo(Articulo articulo) {
        articulos.remove(articulo);
        notificarIntereses(articulo);
    }

    // Recorre los intereses y notifica a los que coincidan con el artículo
    public void notificarIntereses(Articulo articulo) {
    	intereses.stream()
        .filter(interes -> interes.cumpleCon(articulo)) // Filtramos intereses que coincidan con el artículo
        .forEach(interes -> interes.notificarSuscriptores(articulo)); // Notificamos a los suscriptores de cada interés relevante
    }
}
