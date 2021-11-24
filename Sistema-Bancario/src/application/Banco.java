package application;

import java.util.Scanner;
import backgroud.Correntista;
import backgroud.CorrentistaVip;
import backgroud.CorrentistaJuridico;

public class Banco {

	public static void Fisico() {
		
		Correntista fisico = new Correntista("josé", 544551513);
		
		System.out.println("Codigo: " + fisico.getCodigo() + " Nome: " + fisico.getNome() + " numero telefonico: " + fisico.getNumero());
	
	}
	
	public static void Vip() {
		
		CorrentistaVip vip = new CorrentistaVip("José", 91452266); 
		
		System.out.println("Codigo: " + vip.getCodigo() + " Nome: " + vip.getNome() + " numero telefonico: " + vip.getNumero());
		
	}
	
	public static void Juridico() {
		
		CorrentistaJuridico juridico = new CorrentistaJuridico("José", 91452266, "Marido de aluguel"); 
		
		System.out.println("Codigo: " + juridico.getCodigo() + " Nome: " + juridico.getNome() + " numero telefonico: " + juridico.getNumero() + " empresa: " + juridico.getNomeEmpresa());
		
	}
	
	
	public static void main(String[] main) {
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Escolha a conta de sua preferencia: ");	
		
		String resp = sc.next();
		
		switch (resp) {
		
		case "F": 
			
			Fisico();
		
		case "V":
		
			Vip();
			
		case "J":
		
			Juridico();
		
		}
	}
}
