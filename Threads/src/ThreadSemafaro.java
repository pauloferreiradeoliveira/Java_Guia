
public class ThreadSemafaro implements Runnable {
	
	private CorSemafaro cor;
	private boolean parar;
	private boolean cormudou;
	
	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO;
		this.parar = false;
		
		new Thread(this).start();
	}

	@Override
	public void run() {
		
		while(!parar) {
			try {
				Thread.sleep(this.cor.getTempoEspera());
				mudarCor();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			break;
		case AMARELO:
			this.cor = CorSemafaro.VERMELHO;
			break;
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			break;
		}
		this.cormudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		while (!this.cormudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.cormudou = false;
	}

	public CorSemafaro getCor() {
		return cor;
	}
	
	public synchronized void desilarSemafaro() {
		this.parar = true;
	}
}
