package ar.edu.unq.po2.Observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Interes {
	private List<Sub> suscriptores;
	public Interes() {
		this.suscriptores = new ArrayList();
	}

    // Método para suscribirse al interés
    public void suscribir(Sub sub) {
        suscriptores.add(sub);
    }

    // Método para desuscribirse del interés
    public void desuscribir(Sub sub) {
        suscriptores.remove(sub);
    }

    // Notifica a todos los suscriptores sobre un nuevo artículo relevante
    public void notificarSuscriptores(Articulo articulo) {
        suscriptores.forEach(sub -> sub.recibirNotificacion(articulo));
    }

    // Método abstracto que verifica si el artículo cumple con el interés específico
    public abstract boolean cumpleCon(Articulo articulo);
    
}
