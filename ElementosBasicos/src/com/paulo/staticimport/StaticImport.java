package com.paulo.staticimport;

import static java.lang.Math.pow;
//import static java.lang.Math.*;

public class StaticImport {
	
	public static void main(String[] args) {
		double a,b,c;
		a=2;
		b=3;
		c=4;
		
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(pow(b,c));
		
	}

}
