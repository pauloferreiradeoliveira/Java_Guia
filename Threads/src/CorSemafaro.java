
public enum CorSemafaro {
	VERDE(500) ,VERMELHO(1000), AMARELO(200);
	
	private int tempoEspera;
	
	private CorSemafaro(int tempo) {
		this.tempoEspera = tempo;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	
	
	
}
