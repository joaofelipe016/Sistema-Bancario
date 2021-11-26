package application;

import java.util.Scanner;

import Cadastro.Cadastro;

public class Banco {

	static Cadastro cd = new Cadastro();
	
	public static void main(String[] main) {
		
		while(true) {
			
			boolean x = true;
				
			while ( x == true) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Escolha a conta de sua preferencia: ");	
				
				String resp = sc.next();
				
				switch (resp) {
				
				case "F": 
					
					Cadastro.Fisico();
					x = false;
					break;
				
				case "V":
				
					Cadastro.Vip();
					x = false;
					break;
					
				case "J":
				
					Cadastro.Juridico();
					x = false;
					break;
				
				default:
				
					System.out.println("ERRO. Tipo de conta inexistente, tente novamente");
					
					break;
				}
			}
		}
	}
}