package ar.edu.unq.po2.tpState;

public class EstadoApagado implements IEstado{

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		EstadoEncendido estado = new EstadoEncendido();
		maquina.setEstado(estado);
	}

	
	

}
