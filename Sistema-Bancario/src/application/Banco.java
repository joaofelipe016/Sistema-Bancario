package application;

import backgroud.Correntista;

public class Banco { // nova linha

	public static void main(String[] main) {
		
		Correntista myObjt1 = new Correntista("José"); 
		Correntista myObjt2 = new Correntista("Ana"); 
		Correntista myObjt3 = new Correntista("Fernanda"); 
		Correntista myObjt4 = new Correntista("Marcos"); 
		Correntista myObjt5 = new Correntista("Livia"); 
	
		System.out.println("Codigo: " + myObjt1.getCodigo() + " Nome: " + myObjt1.getNome());
		System.out.println("Codigo: " + myObjt2.getCodigo() + " Nome: " + myObjt2.getNome());
		System.out.println("Codigo: " + myObjt3.getCodigo() + " Nome: " + myObjt3.getNome());
		System.out.println("Codigo: " + myObjt4.getCodigo() + " Nome: " + myObjt4.getNome());
		System.out.println("Codigo: " + myObjt5.getCodigo() + " Nome: " + myObjt5.getNome());
	}
	
}
