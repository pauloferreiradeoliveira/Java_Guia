package com.paulo.string;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		String[] letras = {"B","C","D","E","F"};
		
		String alfabeto = "";
		
		// Threat SAFE
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();
		
		System.out.println(alfabeto);
		System.out.println(sb.reverse());
		
		// Not threat SAFE
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		
		System.out.println(sb_);

	}

}
