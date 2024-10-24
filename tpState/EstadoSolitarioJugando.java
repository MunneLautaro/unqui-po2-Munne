package ar.edu.unq.po2.tpState;

public class EstadoSolitarioJugando implements IEstado{

	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void presionarInicio(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminarJuego(MaquinaDeJuegos maquina) {
		EstadoApagado estado = new EstadoApagado();
		maquina.setEstado(estado);
		
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	

}
