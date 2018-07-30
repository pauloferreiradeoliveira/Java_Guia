package com.paulo.cursojava.aula55;

import com.paulo.cursojava.aula54.DiaSemana;

public class TestEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		for(DiaSemana dia : dias) {
			System.out.println(dia);
		}

	}

}
