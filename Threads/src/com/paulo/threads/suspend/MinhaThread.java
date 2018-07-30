package com.paulo.threads.suspend;

public class MinhaThread implements Runnable {
	
	private String nome;
	boolean estaSupensa,estaTerminada;
	
	

	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSupensa = false;
		new Thread(this,nome).start();;
	}



	@Override
	public void run() {
		System.out.println("Executando " + this.nome);
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + nome + " , " + i);
				Thread.sleep(300);
				synchronized (this) {
					while (estaSupensa) {
						wait();
					}
					if(this.estaTerminada) {
						return;
					}
					
				}
				
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	void suspend() {
		this.estaSupensa = true;
	}
	
	synchronized void resume() {
		this.estaSupensa = false;
		notify();
	}
	
	synchronized void stop() {
		this.estaTerminada = true;
		notify();
	}

}
