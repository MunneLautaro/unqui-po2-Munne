package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombreDeEquipo;
	private ArrayList<PersonaEquipo> integrantes;
	
	public EquipoDeTrabajo(String nombreDeEquipo) {
		this.nombreDeEquipo  = nombreDeEquipo;
		this.integrantes = new ArrayList<>();
	}
	
	public String getNombreDeEquipo(){
		return nombreDeEquipo;
	}
	 public void agregarIntegrante(PersonaEquipo persona) {
	        integrantes.add(persona);
	    }
	
	public double promedioDeEdades() {
		int promedioTotal= 0;
		if (integrantes.isEmpty()) {
			 return 0;
		}
		for (PersonaEquipo p : integrantes) {
			promedioTotal =promedioTotal + p.getEdad();
		}
		return(promedioTotal/integrantes.size());
	}
	
}
