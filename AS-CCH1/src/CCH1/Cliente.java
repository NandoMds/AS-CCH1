package CCH1;

public class Cliente {
	
	public static void main(String[] args) {
		OrdemServico ordemServico = new OrdemServico(new PrimeiroServico());
		ordemServico.constructOrdServ();
		
		OrdServProduct productOrdServ = ordemServico.getOrdServ();
		System.out.println(productOrdServ);
		
		ordemServico = new OrdemServico(new SegundoServico());
		ordemServico.constructOrdServ();
		productOrdServ = ordemServico.getOrdServ();
		System.out.println(productOrdServ);
	}
}
