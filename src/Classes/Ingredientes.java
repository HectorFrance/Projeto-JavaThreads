package Classes;

public class Ingredientes {
	int tempo;
	int num;
	public String nome;
	public int cont;

	Ingredientes(int num, int tempo, String nome) {
		this.num = num;
		this.tempo = tempo;
		this.nome = nome;
	}

	public int usar() {
		this.cont++;
		return this.tempo;
	}

	public String getNome() {
		return this.nome;
	}
}
