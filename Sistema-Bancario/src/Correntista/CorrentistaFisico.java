package Correntista;

public class CorrentistaFisico {

	private static int proximoCodigo = 1;
	private String nome;
	private int codigo;
	private int numero;
	
	public int getProximoCodigo() {
		
		return proximoCodigo++;
		
	}
	
	public CorrentistaFisico(String nome, int numero) {
		
		this.nome = nome;
		this.codigo = getProximoCodigo();
		this.numero = numero;
		
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
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
}
