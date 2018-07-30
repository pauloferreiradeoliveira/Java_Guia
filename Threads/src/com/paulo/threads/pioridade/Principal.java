package com.paulo.threads.pioridade;

import com.paulo.threads.rumable.MilhaThreadRumable;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MilhaThreadRumable mt1 = new MilhaThreadRumable("#1 - ", 500);
		MilhaThreadRumable mt2 = new MilhaThreadRumable("#2 - ", 500);
		MilhaThreadRumable mt3 = new MilhaThreadRumable("#3 - ", 500);
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t3.start();
		t2.start();

	}

}
