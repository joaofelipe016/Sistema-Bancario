package Correntista;

public class CorrentistaJuridico extends Correntista {
	
	private static int proximoCodigoJuridico = 2001;
	private String nomeEmpresa;
	private int codigoJuridico;
	
	public int getProximoCodigoJuridico() {
		
		return proximoCodigoJuridico++;
		
	}
	
	public CorrentistaJuridico(String nome, int numero, String nomeEmpresa, int cpf) { 
		
		super(nome, numero, cpf);
		this.nomeEmpresa = nomeEmpresa;
		this.codigoJuridico = getProximoCodigoJuridico();
		
	}
	
	public int getCodigoJuridico() {
		
		return codigoJuridico;
		
	}
	
	public String getNomeEmpresa() {
		
		return nomeEmpresa;
		
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		
		this.nomeEmpresa = nomeEmpresa;
		
	}

}
