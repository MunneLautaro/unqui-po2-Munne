package ar.edu.unq.po2.Composite2Warcraf;

import java.util.List;

public class Ejercito extends Personaje{
	private List<Personaje> personajes;
	public Ejercito(List<Personaje> personajes) {
		this.personajes = personajes;
	}
	
	public void agregarPersonaje(Personaje p) {
		this.personajes.add(p);
	}
	public void removerPersonaje(Personaje p) {
		this.personajes.remove(p);
	}
	
	@Override
	public void caminar(Punto punto) {
		personajes.stream()
		.forEach(p-> p.caminar(punto));
	}

}
