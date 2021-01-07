package Classes;

public class Caixa {
	int num;
	int tempo;
	public int cont;
	boolean ocupado;

	Caixa(int num, int tempo) {
		this.num = num;
		this.tempo = tempo;
		this.ocupado = false;
	}

	synchronized public int atender() {
		this.cont++;
		this.ocupado = true;
		return this.tempo;
	}

	synchronized public void terminar() {
		this.ocupado = false;
	}
}
