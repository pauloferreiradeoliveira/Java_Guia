package com.paulo.anotacao;

public @interface InformacaoAula {
 
	String autor();
	
	int aulaNumero();
	
	String blog() default "Paulo ferreira";
	
	String site() default "Paulofereira.com";
}
