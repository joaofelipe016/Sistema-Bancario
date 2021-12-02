package Correntista;

public class CorrentistaFisico extends Correntista{

	private static int proximoCodigo = 1001;
	private int codigo;

	public int getProximoCodigo() {

		return proximoCodigo++;

	}

	public CorrentistaFisico(String nome, int numero, int cpf) {

		super(nome, numero, cpf);
		this.codigo = getProximoCodigo();

	}

	public int getCodigo() {

		return codigo;

	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;

	}

}