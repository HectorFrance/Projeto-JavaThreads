package Classes;

import java.util.LinkedList;

public class Fila {
	LinkedList<Clientes> fila = new LinkedList<Clientes>();
	static int contClientes;

	public void ordenar() {

		for (int i = 0; i < fila.size(); i++) {

			if (fila.get(i).tipo == 2) {
				Clientes aux = fila.get(i);
				fila.remove(i);
				fila.addFirst(aux);
			}
		}

		for (int i = 0; i < fila.size(); i++) {

			if (fila.get(i).tipo == 1) {
				Clientes aux = fila.get(i);
				fila.remove(i);
				fila.addFirst(aux);
			}
		}
	}

	public int tamanho() {
		return fila.size();
	}

	public void imprimir() {
		for (int i = 0; i < fila.size(); i++) {
			System.out.println(fila.get(i).tipo);
		}
	}

	public void adcinar(Clientes c) {
		fila.add(c);
		contClientes++;
		ordenar();
	}

	synchronized public Clientes proximo() {
		Clientes p;
		p = fila.get(0);
		fila.remove(0);
		ordenar();
		return p;

	}
}
