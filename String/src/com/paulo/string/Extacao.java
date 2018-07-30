package com.paulo.string;

import java.util.Arrays;

public class Extacao {

	public static void main(String[] args) {
		
		String java = "java";
		
		for (int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		char[]  jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		
		//seria o mesmo
		for (int i=0; i<3; i++) {
			jav[i] = java.charAt(i);
		}
		System.out.println(jav);
		
		byte[] javBaates = new byte[3];
		java.getBytes(0, 3,javBaates, 0);
		System.out.println(Arrays.toString(javBaates));
		 
		char[] javaChar = java.toCharArray();
		System.out.println(javaChar);
		

	}

}
