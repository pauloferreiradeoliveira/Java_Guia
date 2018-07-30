package com.paulo.threads.islive;

import com.paulo.threads.rumable.MilhaThreadRumable;

public class Teste {

	public static void main(String[] args) {
		MilhaThreadRumable t1 = new MilhaThreadRumable("#1 - ", 500);
		MilhaThreadRumable t2 = new MilhaThreadRumable("#2 - ", 500);
		MilhaThreadRumable t3 = new MilhaThreadRumable("#3 - ", 500);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		/*try {
			th1.start();
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Programa Finalizado");
		
	}

}
