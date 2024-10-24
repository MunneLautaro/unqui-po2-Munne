package ar.edu.unq.po2.tpState;

public class EstadoEncendido implements IEstado{
	
	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void presionarInicio(MaquinaDeJuegos maquina) {
		EstadoEsperandoFicha estado = new EstadoEsperandoFicha();
		maquina.setEstado(estado);
		
	}

	@Override
	public void terminarJuego(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		// TODO Auto-generated method stub
		
	}

	
	
}
