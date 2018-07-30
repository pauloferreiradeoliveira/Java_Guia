package com.paulo.exececao;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter com um número decimal");
		try {
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
