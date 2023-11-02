package CCH1;

public class OrdServProduct {
	
	private String alimentos;
	private String bebidas;
	private String entrega;
	
	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}
	
	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}
	
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	
	@Override
	public String toString() {
		return "\n\n*Ordem de Serviço de Entrega*" + "\nTipo de alimento: " + alimentos + "\nBebida: " + bebidas + "\nLocal de entrega: " + entrega;
	}
}
