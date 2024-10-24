package ar.edu.unq.po2.tpStrategy;

public class EncriptadorNaive{
	private IEncriptarStrategy estrategia;
	
	public void setEstrategia(IEncriptarStrategy estrategia) {
		this.estrategia= estrategia;
	}
	public String encriptar(String texto) {
		if (estrategia == null) {
            throw new IllegalStateException("No se ha establecido una estrategia de encriptación.");
        }
        return estrategia.encriptar(texto);
    }
	public String desencriptar(String texto) {
        if (estrategia == null) {
            throw new IllegalStateException("No se ha establecido una estrategia de encriptación.");
        }
        return estrategia.desencriptar(texto);
    }
}
