package com.paulo.string;

public class Concatenacao {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java = "Java";
		
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		String resultado2com2 = "Resultado de 2 + 2=" + (2+2);
		System.out.println(resultado2com2);

		String resultado2com2_ = "Resultado de 2 + 2=" + 2+2;
		System.out.println(resultado2com2_);
		
		String um = String.valueOf(1);
		System.out.println(um);
		
		//Forma errada
		String cont = "1";
		cont += "2";
		cont += "3";
		cont += "4";
		cont += "5";
		cont += "6";
		cont += "7";
		
		System.out.println(cont);
		
	}

}
