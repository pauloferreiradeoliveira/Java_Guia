package com.paulo.wrappers;

public class TesteWarp {

	public static void main(String[] args) {
		Short mun7= new Short((short) 1);
		Byte mun8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');

		System.out.println(num10.shortValue());
		
		int num16 = Integer.parseInt("99443");
		num9.equals(num10);
	}

}
