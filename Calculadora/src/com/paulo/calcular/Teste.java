package com.paulo.calcular;

public class Teste {

	public static void main(String[] args) {
		System.out.println(TipoSoma.SOMA.calculo(2, 4));
		System.out.println(TipoSoma.DIVICAO.calculo(2, 4));
		System.out.println(TipoSoma.MUTIPLICACAO.calculo(2, 4));
		System.out.println(TipoSoma.SUBTRACAO.calculo(2, 4));

	}

}
