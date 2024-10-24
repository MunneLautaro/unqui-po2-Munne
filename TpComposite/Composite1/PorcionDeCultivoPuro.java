package ar.edu.unq.po2.Composite1;

public class PorcionDeCultivoPuro extends PorcionDeTierra{
	private String cultivo;
	public PorcionDeCultivoPuro(String cultivo){
		this.cultivo = cultivo;
	}
	
	@Override
	public double calcularGananciaDeSoja() {
        return cultivo.equals("soja") ? 500 : 0;
    }
		

	@Override
	public double calcularGananciaDeTrigo() {
		return cultivo.equals("trigo") ? 300 : 0;
	}
	
	public String getCultivo() {
		return this.cultivo;
	}
}
