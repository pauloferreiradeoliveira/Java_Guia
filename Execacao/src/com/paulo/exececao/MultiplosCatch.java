package com.paulo.exececao;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int[] numeros = {1,2,0,3,45,128,4,64};
		int[] demon = {2,0,4,8,0,9};
		
		for(int i=0; i<numeros.length; i++) {
			
			try {
				System.out.println(numeros[i]+ "/"  + demon[i] + " = " + (numeros[i]+demon[i]));
			}catch (ArithmeticException e) {
				System.out.println("Divido por 0");
			}catch (Throwable e) {
				System.out.println("Possição do array inválida");
			}
		}

	}

}
