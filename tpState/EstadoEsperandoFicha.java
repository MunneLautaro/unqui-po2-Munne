package ar.edu.unq.po2.tpState;

public class EstadoEsperandoFicha implements IEstado{
	private int cantFichas; 
	
	
	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		this.cantFichas++;
	}

	
	public void presionarInicio(MaquinaDeJuegos maquina) {
		EstadoSolitarioJugando estadoSolitario = new EstadoSolitarioJugando();
		EstadoCoopJugando estadoCoop = new EstadoCoopJugando();
		if (cantFichas > 0 && cantFichas ==1) {
			maquina.setEstado(estadoSolitario);
		} else {
			maquina.setEstado(estadoCoop);
		}
		
	}

	
	public void terminarJuego(MaquinaDeJuegos maquina) {
		
		
	}

	
	public void encender(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}
	public int getFichas() {
		return this.cantFichas;
	}
}
