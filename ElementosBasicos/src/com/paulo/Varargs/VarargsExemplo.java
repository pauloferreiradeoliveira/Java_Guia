package com.paulo.Varargs;

public class VarargsExemplo {

	public static void main(String[] args) {
		
		System.out.println(soma(7,8,6,5,4,3));
	}
	
	static int soma(Integer... vetor) {
		int total = 0;
		
		for(int numbero : vetor) {
			total+= numbero;
		}
		
		return total;
	}

}
