package ar.edu.unq.po2.tpState;

public class MaquinaDeJuegos {
	private IEstado estado;
	
	public MaquinaDeJuegos() {
		
		this.estado = new EstadoApagado();
	}
	
	public void encender() {
		this.estado.encender(this);
	}
	public void iniciaJuego() {
		this.estado.presionarInicio(this);
	}
	public void ingresarFichas() {
		this.estado.insertarFicha(this);
	}
	
	public void setEstado(IEstado estado) {
		this.estado=estado;
	}
	
	public void terminarJuego() {
		this.estado.terminarJuego(this);
		
	}
	public IEstado getEstado() {
		return estado;
	}
}
