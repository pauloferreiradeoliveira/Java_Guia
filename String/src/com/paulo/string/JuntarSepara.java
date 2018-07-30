package com.paulo.string;

public class JuntarSepara {

	public static void main(String[] args) {
		
		String alfabeto = String.join(",", "a","b","c","d");
		System.out.println(alfabeto);

		String[] letras = alfabeto.split(",");
		for(String l : letras) {
			System.out.println(l);
		}
	}

}
