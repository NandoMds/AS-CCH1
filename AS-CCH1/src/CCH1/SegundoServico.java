package CCH1;

public class SegundoServico extends OrdServBuilder{
	
	@Override
	public void buildAlimentos() {
		ordemServico.setAlimentos("Pizza média de calabresa");
	}
	
	@Override
	public void buildBebidas() {
		ordemServico.setBebidas("Guaraná 2litro");
	}
	
	@Override
	public void buildEntrega() {
		ordemServico.setEntrega("Centro");
	}
}