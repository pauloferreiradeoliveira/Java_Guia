package com.paulo.exececao;

public class UsandoMinhaExecption {

	public static void main(String[] args) {
		int[] numeros = {4,8,5,16,32,64,128 };
		int[] demon = {2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			try {
				if(numeros[i] %2 != 0) {
					throw new DivisaoNaoExata(numeros[i], demon[i]);
				}
			
				System.out.printf("%02d / %02d = %02d %n", numeros[i],demon[i],(numeros[i]/demon[i]));
			}catch(Exception e) {
				System.out.printf("Erro: %s%n", e.getMessage());
				e.printStackTrace();
			}

	}
	}
	}

