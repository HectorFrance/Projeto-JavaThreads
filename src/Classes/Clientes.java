package Classes;

import java.util.Random;

public class Clientes {
	int[] pedido = new int[3];
	int tipo;
	int numCliente;
	Random gerador = new Random();

	Clientes() {
		for (int i = 0; i < 3; i++) {
			pedido[i] = gerador.nextInt(12) + 1;
		}
		tipo = gerador.nextInt(3) + 1;
	}
}
