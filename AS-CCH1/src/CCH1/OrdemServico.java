package CCH1;

public class OrdemServico {
	private OrdServBuilder requestOrdServ;
	
	public OrdemServico(OrdServBuilder requestOrdServ) {
		this.requestOrdServ = requestOrdServ;
	}
	
	public OrdServProduct getOrdServ() {
		return requestOrdServ.getOrdServ();
	}
	
	public void constructOrdServ() {
		requestOrdServ.buildAlimentos();
		requestOrdServ.buildBebidas();
		requestOrdServ.buildEntrega();
	}
}
