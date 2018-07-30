package com.paulo.cursojava.aula56;

public class test {

	public static void main(String[] args) {
				
		Pessoa pessoa = new Pessoa();
		pessoa.setTipoDocumento(TipoDocumento.CPF);
		pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTeste());
		
		System.out.println(pessoa);

	}

}
