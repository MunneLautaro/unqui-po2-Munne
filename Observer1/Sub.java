package ar.edu.unq.po2.Observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Sub {
	protected List<Interes> intereses;

    public Sub() {
        this.intereses = new ArrayList<>();
    }
    public void agregarInteres(Interes interes) {
        this.intereses.add(interes);
        interes.suscribir(this);
    }

    // Método para eliminar un interés del suscriptor
    public void removerInteres(Interes interes) {
        this.intereses.remove(interes);
        interes.desuscribir(this);
    }
	public abstract void recibirNotificacion(Articulo articulo);
}
