package com.paulo.threads;

public class Test {

	public static void main(String[] args) {
		
		MinhaThreads thread = new MinhaThreads("Thread #1",1000);
		
		MinhaThreads thread2 = new MinhaThreads("Thread #2",500);
		
		//thread.start();

	}

}
