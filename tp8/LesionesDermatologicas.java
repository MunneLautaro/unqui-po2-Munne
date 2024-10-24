package ar.edu.unq.po2.tp8;

public enum LesionesDermatologicas {
    ROJO("La más grave", 1),
    GRIS("Bastante grave", 2),
    AMARILLO("Importante", 3),
    MIEL("Normal", 4);

    private final String descripcion;
    private final int nivelGravedad;


    // Constructor del enum
    private LesionesDermatologicas(String descripcion, int nivelGravedad) {
        this.descripcion = descripcion;
        this.nivelGravedad = nivelGravedad;
    }

    // Getter para la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Getter para el nivel de gravedad
    public int getNivelGravedad() {
        return nivelGravedad;
    }

    // Getter para obtener el siguiente estado
    public LesionesDermatologicas getSiguiente() {
    	 int siguienteIndice = (this.ordinal() + 1) % LesionesDermatologicas.values().length;
         return LesionesDermatologicas.values()[siguienteIndice];
    }
}