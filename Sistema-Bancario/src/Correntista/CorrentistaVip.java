package Correntista;

public class CorrentistaVip extends CorrentistaFisico {

	private static int proximoCodigoVip = 3001;
	private int codigoVip;
	
	public int getProximoCodigoVip() {
		
		return proximoCodigoVip++;
		
	}
	
	public CorrentistaVip(String nome, int numero,int cpf) {
		
		super(nome, numero, cpf);
		this.codigoVip = getProximoCodigoVip();
		
	}

	public int getCodigoVip() {
		
		return codigoVip;
		
	}
	
}
