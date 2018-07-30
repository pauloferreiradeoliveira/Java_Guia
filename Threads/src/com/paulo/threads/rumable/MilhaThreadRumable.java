package com.paulo.threads.rumable;

public class MilhaThreadRumable implements Runnable{
	
	private String nome;
	private int tempo;
	
	public MilhaThreadRumable(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		//Thread thread = new Thread(this);
		//thread.start();
	}

	@Override
	public void run() {
		try {
		for (int i=0 ; i< 6; i ++) {
			System.out.println(nome + " Contador " + i);
			Thread.sleep(tempo);
		}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
