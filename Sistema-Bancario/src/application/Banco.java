package application;

import backgroud.Correntista;
import backgroud.CorrentistaVip;
import backgroud.CorrentistaEmpresarial;

public class Banco {

	public static void main(String[] main) {
		
		Correntista myObjt1 = new Correntista("José", 245236646); 
		Correntista myObjt2 = new Correntista("Ana", 144523588); 
		Correntista myObjt3 = new Correntista("Fernanda", 2585562); 
		Correntista myObjt4 = new Correntista("Marcos", 45652562); 
		Correntista myObjt5 = new Correntista("Livia", 45131454); 
		
		CorrentistaVip Vip1 = new CorrentistaVip("José", 91452266); 
		CorrentistaVip Vip2 = new CorrentistaVip("Ana", 452313332); 
		CorrentistaVip Vip3 = new CorrentistaVip("Fernanda", 256154877); 
		CorrentistaVip Vip4 = new CorrentistaVip("Marcos", 98743122); 
		CorrentistaVip Vip5 = new CorrentistaVip("Livia", 482313356);
		
		CorrentistaEmpresarial empresa1 = new CorrentistaEmpresarial("José", 5331312, "Marido de aluguel", "José");
		CorrentistaEmpresarial empresa2 = new CorrentistaEmpresarial("Ana", 5331312, "Padaria é nois", "João");
		CorrentistaEmpresarial empresa3 = new CorrentistaEmpresarial("Fernanda", 5331312, "Boca do morro", "Mariana");
		CorrentistaEmpresarial empresa4 = new CorrentistaEmpresarial("Marcos", 5331312, "Agiotagem", "Paulo");
		CorrentistaEmpresarial empresa5 = new CorrentistaEmpresarial("Livia", 5331312, "Compro ouro", "jorginho canela seca");
		
		System.out.println("Codigo: " + myObjt1.getCodigo() + " Nome: " + myObjt1.getNome() + " Numero telefonico: " + myObjt1.getNumero());
		System.out.println("Codigo: " + myObjt2.getCodigo() + " Nome: " + myObjt2.getNome() + " Numero telefonico: " + myObjt1.getNumero());
		System.out.println("Codigo: " + myObjt3.getCodigo() + " Nome: " + myObjt3.getNome() + " Numero telefonico: " + myObjt1.getNumero());
		System.out.println("Codigo: " + myObjt4.getCodigo() + " Nome: " + myObjt4.getNome() + " Numero telefonico: " + myObjt1.getNumero());
		System.out.println("Codigo: " + myObjt5.getCodigo() + " Nome: " + myObjt5.getNome() + " Numero telefonico: " + myObjt1.getNumero());
	
		System.out.println("  ");
		
		System.out.println("CodigoVip: " + Vip1.getCodigo() + " Nome: " + Vip1.getNome() + " Numero telefonico: " + Vip1.getNumero());
		System.out.println("CodigoVip: " + Vip2.getCodigo() + " Nome: " + Vip2.getNome() + " Numero telefonico: " + Vip2.getNumero());
		System.out.println("CodigoVip: " + Vip3.getCodigo() + " Nome: " + Vip3.getNome() + " Numero telefonico: " + Vip3.getNumero());
		System.out.println("CodigoVip: " + Vip4.getCodigo() + " Nome: " + Vip4.getNome() + " Numero telefonico: " + Vip4.getNumero());
		System.out.println("CodigoVip: " + Vip5.getCodigo() + " Nome: " + Vip5.getNome() + " Numero telefonico: " + Vip5.getNumero());
		
		System.out.println("  ");
	
		System.out.println("CodigoEmpresarial: " + empresa1.getCodigo() + " Nome: " + empresa1.getNome() + " Numero: " + empresa1.getNumero() + " Empresa: " + empresa1.getNomeEmpresa() + "Nome Responsavel: " + empresa1.getNomeResponsavel());
		System.out.println("CodigoEmpresarial: " + empresa2.getCodigo() + " Nome: " + empresa2.getNome() + " Numero: " + empresa2.getNumero() + " Empresa: " + empresa2.getNomeEmpresa() + "Nome Responsavel: " + empresa2.getNomeResponsavel());
		System.out.println("CodigoEmpresarial: " + empresa3.getCodigo() + " Nome: " + empresa3.getNome() + " Numero: " + empresa3.getNumero() + " Empresa: " + empresa3.getNomeEmpresa() + "Nome Responsavel: " + empresa3.getNomeResponsavel());
		System.out.println("CodigoEmpresarial: " + empresa4.getCodigo() + " Nome: " + empresa4.getNome() + " Numero: " + empresa4.getNumero() + " Empresa: " + empresa4.getNomeEmpresa() + "Nome Responsavel: " + empresa4.getNomeResponsavel());
		System.out.println("CodigoEmpresarial: " + empresa5.getCodigo() + " Nome: " + empresa5.getNome() + " Numero: " + empresa5.getNumero() + " Empresa: " + empresa5.getNomeEmpresa() + "Nome Responsavel: " + empresa5.getNomeResponsavel());
	}
	
}
