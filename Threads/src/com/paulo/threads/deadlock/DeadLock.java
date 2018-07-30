package com.paulo.threads.deadlock;

public class DeadLock {

	public static void main(String[] args) {
		final String RECURSO1 = "Recurso #1"; 
		final String RECURSO2 = "Recurso #2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized(RECURSO1) {
					System.out.println("Thread #1: Bloqueou recurso 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}

					System.out.println("Acesso 2");

					synchronized (RECURSO2) {
						System.out.println("Tread #1 : recurso 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(RECURSO2) {
					System.out.println("Thread #2: Bloqueou recurso 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}

					System.out.println("Acesso 1");

					synchronized (RECURSO1) {
						System.out.println("Tread #2 : recurso 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}
}
