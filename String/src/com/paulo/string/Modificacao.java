package com.paulo.string;

public class Modificacao {

	public static void main(String[] args) {
		
		String teste = "isso é um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10,15));
		
		String ola = "olá";
		String mundo = " mundo";
		String  olaMundo = ola.concat(mundo);
		
		String espaco = "i s p a ç o";
		String semEspaco = espaco.replace('i', 'e');
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		String nome = " meu nome e: ";
		System.out.println(nome);
		System.out.println(nome.trim());
	}

}
