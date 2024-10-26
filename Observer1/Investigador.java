package ar.edu.unq.po2.Observer1;

public class Investigador extends Sub{
	private String nombre;
    private String email;
	public Investigador(String nombre, String email) {
	 super();
     this.nombre = nombre;
     this.email = email;
 }
 // Implementación del método de recibir notificación
	@Override
	public void recibirNotificacion(Articulo articulo) {
		System.out.println(articulo.getTitulo());
	}

	// Getters y setters adicionales
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}
}

