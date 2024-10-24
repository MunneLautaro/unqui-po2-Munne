package ar.edu.unq.po2.tp9;

public enum Palo {
	CORAZONES("Corazon"), DIAMANTES("Diamante"), TREBOLES("Trebol"), PICAS("Pica");
	
	private final String palo;
	Palo(String palo) {
		this.palo = palo;
	}
	
	public String getPalo() {
		return this.palo;
	}
}

