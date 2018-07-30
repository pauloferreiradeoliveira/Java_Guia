package com.paulo.cursojava.aula56;

public class Pessoa {
	
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}
	
	
}
