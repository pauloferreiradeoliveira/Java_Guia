package com.paulo.cursojava.aula55;

import com.paulo.cursojava.aula54.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		DiaSemana diaSemana = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		System.out.println(diaSemana);
	}

}
