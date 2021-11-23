package backgroud;

public class CorrentistaEmpresarial extends Correntista {

	private String nomeEmpresa;
	private String nomeResponsavel;
	
	public CorrentistaEmpresarial(String nome,int numero , String nomeEmpresa, String nomeResponsavel) { 
		
		super(nome, numero);
		this.nomeEmpresa = nomeEmpresa;
		this.nomeResponsavel = nomeResponsavel;
		
	}
	
	public String getNomeEmpresa() {
		
		return nomeEmpresa;
		
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		
		this.nomeEmpresa = nomeEmpresa;
		
	}
	
	public String getNomeResponsavel() {
		
		return nomeResponsavel;
		
	}
	
	public void setNomeResponsavel(String nomeResponsavel) {
		
		this.nomeResponsavel = nomeResponsavel;
		
	}
	
}
