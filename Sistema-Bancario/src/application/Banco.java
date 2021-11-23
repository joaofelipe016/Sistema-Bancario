package application;

import java.util.Scanner;
import backgroud.Correntista;
import backgroud.CorrentistaVip;
import backgroud.CorrentistaEmpresarial;

public class Banco {

	public static void Fisico() {
		
		Correntista fisico = new Correntista("josé", 544551513);
		
		System.out.println("Codigo: " + fisico.getCodigo() + " Nome: " + fisico.getNome() + " numero telefonico: " + fisico.getNumero());
	
	}
	
	public static void Vip() {
		
		CorrentistaVip vip = new CorrentistaVip("José", 91452266); 
		
		System.out.println("Codigo: " + vip.getCodigo() + " Nome: " + vip.getNome() + " numero telefonico: " + vip.getNumero());
		
	}
	
	public static void Empresa() {
		
		CorrentistaEmpresarial empresa = new CorrentistaEmpresarial("José", 91452266, "Marido de aluguel", "José"); 
		
		System.out.println("Codigo: " + empresa.getCodigo() + " Nome: " + empresa.getNome() + " numero telefonico: " + empresa.getNumero() + " empresa: " + empresa.getNomeEmpresa() + " Nome Responsavel: " + empresa.getNomeResponsavel());
		
	}
	
	
	public static void main(String[] main) {

		Fisico();
		Fisico();
		Vip();
		Empresa();
		
	}
}
