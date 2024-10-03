package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements IAgencia {
	private List<Factura> facturas;
	public AgenciaRecaudadora() {
		this.facturas = new ArrayList();
	}
    @Override
    public void registrarPago(Factura factura) {
      factura.montoAPagar();
      facturas.add(factura);
    }
}
