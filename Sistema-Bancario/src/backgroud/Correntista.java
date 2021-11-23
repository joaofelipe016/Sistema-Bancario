package backgroud;

public class Correntista {

	private static int proximoCodigo = 1;
	private String nome;
	private int codigo;
	
	public int getProximoCodigo() {
		
		return proximoCodigo++;
		
	}
	
	public Correntista(String nome) {
		
		this.nome = nome;
		this.codigo = getProximoCodigo();
		
	}
	
	public int getCodigo() {
		
		return codigo;
		
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
		
	}

	public String getNome() {
		
		return nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
}
