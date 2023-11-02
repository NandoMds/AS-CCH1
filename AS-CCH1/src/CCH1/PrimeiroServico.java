package CCH1;

public class PrimeiroServico extends OrdServBuilder{
	
	@Override
	public void buildAlimentos() {
		ordemServico.setAlimentos("Dogao triplo");
	}
	
	@Override
	public void buildBebidas() {
		ordemServico.setBebidas("Coca Cola Zero lata");
	}
	
	@Override
	public void buildEntrega() {
		ordemServico.setEntrega("Bairro zona norte");
	}
}
