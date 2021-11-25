package application;

import java.util.Scanner;
import Correntista.CorrentistaFisico;
import Correntista.CorrentistaVip;
import Correntista.CorrentistaJuridico;

public class Banco {

	
	public static void Fisico() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Nome: ");
		
		String nome = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Numero telefonico: ");
		
		int numero = sc2.nextInt();
		
		CorrentistaFisico fisico = new CorrentistaFisico(nome, numero);
		
		System.out.println("Codigo: " + fisico.getCodigo() + " Nome: " + fisico.getNome() + " numero telefonico: " + fisico.getNumero());
		
	}
	
	public static void Vip() {
			
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Nome: ");
		
		String nome = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Numero telefonico: ");
		
		int numero = sc2.nextInt();
		
		CorrentistaVip vip = new CorrentistaVip(nome, numero); 
		
		System.out.println("Codigo: " + vip.getCodigo() + " Nome: " + vip.getNome() + " numero telefonico: " + vip.getNumero());
		
	}
	
	public static void Juridico() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Nome: ");
		
		String nome = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Numero telefonico: ");
		
		int numero = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("Nome da empresa: ");
		
		String nomeEmpresa = sc3.next();
		
		CorrentistaJuridico juridico = new CorrentistaJuridico(nome, numero, nomeEmpresa); 
		
		System.out.println("Codigo: " + juridico.getCodigo() + " Nome: " + juridico.getNome() + " numero telefonico: " + juridico.getNumero() + " empresa: " + juridico.getNomeEmpresa());
		
	}
	
	
	public static void main(String[] main) {
	
	boolean x = true;
		
	while ( x == true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a conta de sua preferencia: ");	
		
		String resp = sc.next();
		
		switch (resp) {
		
		case "F": 
			
			Fisico();
			x = false;
			break;
		
		case "V":
		
			Vip();
			x = false;
			break;
			
		case "J":
		
			Juridico();
			x = false;
			break;
		
		default:
		
			System.out.println("ERRO. Tipo de conta inexistente, tente novamente");
			
			break;
		
			}
		}
	}
}