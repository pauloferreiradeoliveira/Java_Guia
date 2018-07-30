package com.paulo.threads;

public class MinhaThreads extends Thread {

	private String nome;
	private int tempo;

	public MinhaThreads(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0 ; i < 6 ; i++) {
				System.out.println(nome + " Contador " + i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
