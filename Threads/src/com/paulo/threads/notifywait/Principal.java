package com.paulo.threads.notifywait;

public class Principal {

	public static void main(String[] args) {
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		try {
		tique.t.join();
		taque.t.join();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
