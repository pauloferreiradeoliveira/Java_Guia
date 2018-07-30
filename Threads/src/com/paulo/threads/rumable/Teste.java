package com.paulo.threads.rumable;

public class Teste {
	
	public static void main(String[] args) {
		MilhaThreadRumable t = new MilhaThreadRumable("#1", 1000);
		//Thread t1 = new Thread(t);
		//t1.start();
		MilhaThreadRumable t1 = new MilhaThreadRumable("#3", 500);
		MilhaThreadRumable t2 = new MilhaThreadRumable("#2", 100);
		
	}
	
}
