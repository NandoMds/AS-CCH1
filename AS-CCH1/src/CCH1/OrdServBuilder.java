package CCH1;

public abstract class OrdServBuilder {
	protected OrdServProduct ordemServico;
	
	public OrdServBuilder() {
		this.ordemServico = new OrdServProduct();
	}
	
	public abstract void buildAlimentos();
	
	public abstract void buildBebidas();
	
	public abstract void buildEntrega();
	
	public OrdServProduct getOrdServ() {
		return ordemServico;
	}
}
