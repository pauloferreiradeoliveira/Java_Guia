package com.paulo.exececao;

public class DivisaoNaoExata extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Resultado de ");
		sb.append(num);
		sb.append("/");
		sb.append(dem);
		sb.append(" não é um numero inteiro");
		return sb.toString();
	}
	
	
	
	

}
