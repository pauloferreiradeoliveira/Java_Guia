
public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for (int i=0; i<10; i++) {
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desilarSemafaro();

	}

}
