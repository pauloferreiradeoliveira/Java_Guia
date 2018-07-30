package com.paulo.threads.calculadora;

public class MinhaTreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaTreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(this.nome + " Inciada");		
		int soma = calc.somaArray(this.nums);
		System.out.println("O resultado da soma: " + soma);
	}

}
