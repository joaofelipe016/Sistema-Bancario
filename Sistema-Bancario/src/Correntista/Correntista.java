package Correntista;

public class Correntista {

	private String nome;
	private int numero;
	private int cpf;
	
	public Correntista(String nome, int numero, int cpf) {
		
		this.nome = nome;
		this.numero = numero;
		this.cpf = cpf;
		
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
	
	public int getCpf () {
		
		return cpf;
		
	}
	
	public void setCpf(int cpf) {
		
		this.cpf = cpf;
		
	}
	
}
	
