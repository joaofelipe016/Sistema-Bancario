package Cadastro;

import java.util.Scanner;

import Correntista.CorrentistaFisico;
import Correntista.CorrentistaJuridico;
import Correntista.CorrentistaVip;

public class Cadastro {
	
	public static void Fisico() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Nome: ");
		
		String nome = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Numero telefonico: ");
		
		int numero = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("CPF: ");
		
		int cpf = sc3.nextInt();
		
		CorrentistaFisico fisico = new CorrentistaFisico(nome, numero, cpf);
		
		System.out.println("Codigo: " + fisico.getCodigo() + " Nome: " + fisico.getNome() + " numero telefonico: " + fisico.getNumero());
		
	}
	
	public static void Vip() {
			
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Nome: ");
		
		String nome = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Numero telefonico: ");
		
		int numero = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("CPF: ");
		
		int cpf = sc3.nextInt();
		
		CorrentistaVip vip = new CorrentistaVip(nome, numero, cpf); 
		
		System.out.println("Codigo: " + vip.getCodigoVip() + " Nome: " + vip.getNome() + " numero telefonico: " + vip.getNumero() + " CPF: " + vip.getCpf());
		
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
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.print("CPF: ");
		
		int cpf = sc4.nextInt();
		
		CorrentistaJuridico juridico = new CorrentistaJuridico(nome, numero, nomeEmpresa, cpf); 
		
		System.out.println("Codigo: " + juridico.getCodigoJuridico() + " Nome: " + juridico.getNome() + " numero telefonico: " + juridico.getNumero() + " empresa: " + juridico.getNomeEmpresa());
		
	}
	
}