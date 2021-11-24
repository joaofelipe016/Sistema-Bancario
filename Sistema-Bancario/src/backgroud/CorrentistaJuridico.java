package backgroud;

public class CorrentistaJuridico extends Correntista {

	private String nomeEmpresa;
	
	public CorrentistaJuridico(String nome,int numero , String nomeEmpresa) { 
		
		super(nome, numero);
		this.nomeEmpresa = nomeEmpresa;
		
	}
	
	public String getNomeEmpresa() {
		
		return nomeEmpresa;
		
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		
		this.nomeEmpresa = nomeEmpresa;
		
	}

}
