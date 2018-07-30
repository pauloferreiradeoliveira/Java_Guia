package com.paulo.cursojava.aula56;

import com.paulo.cursojava.utilitarios.GeraCpfCnpj;

public enum TipoDocumento {
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
	
}