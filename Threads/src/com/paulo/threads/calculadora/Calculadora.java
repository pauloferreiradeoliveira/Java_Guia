package com.paulo.threads.calculadora;

public class Calculadora {
	private int soma;
	
	// Somente um Threat por vez
	public synchronized int somaArray(int... array) {
		soma =0 ;
		
		for (int valor : array) {
			soma += valor;
			
			System.out.println("Executando a soma " + Thread.currentThread());
			System.out.println("Soma " + soma);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		return soma;
	}

}
