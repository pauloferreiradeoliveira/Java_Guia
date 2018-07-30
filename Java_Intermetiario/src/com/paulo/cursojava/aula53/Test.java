package com.paulo.cursojava.aula53;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usandoConstantes();
		usandoEnum();
	}
	
	private static void usandoConstantes() {
		//imprimeDiaSemana(DiaSemanConstantes.DOMINGO);
	}
	
	private static  void imprimeDiaSemana (DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
	
	private static void usandoEnum() {
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(domingo);
	}

}
