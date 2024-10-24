package ar.edu.unq.po2.Composite1;

import java.util.List;

public class PorcionDeCultivoMixta extends PorcionDeTierra{
	
	private List<PorcionDeTierra> subCultivos;
	public PorcionDeCultivoMixta(List<PorcionDeTierra> subCultivos) {
		this.subCultivos = subCultivos;
	}
	
	 public void agregarSubParcela(PorcionDeTierra p) {
	        this.subCultivos.add(p);
	    }
	 public void removerSubParcela(PorcionDeTierra p) {
	        this.subCultivos.remove(p);
	    }
	
	@Override
	public double calcularGananciaDeSoja() {
		
		return subCultivos.stream()
				.mapToDouble(PorcionDeTierra:: calcularGananciaDeSoja)
				.sum();
	}	

	@Override
	public double calcularGananciaDeTrigo() {
		return subCultivos.stream()
				.mapToDouble(PorcionDeTierra:: calcularGananciaDeTrigo)
				.sum();
	}

}
