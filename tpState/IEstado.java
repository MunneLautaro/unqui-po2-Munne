package ar.edu.unq.po2.tpState;

public interface IEstado {
	public void insertarFicha(MaquinaDeJuegos maquina);
 	public void presionarInicio(MaquinaDeJuegos maquina);
 	public void terminarJuego(MaquinaDeJuegos maquina);
 	public void encender(MaquinaDeJuegos maquina);
}
