package Controlador;

import Classes.Funcionario;
import Telas.PrimeiraTela;

public class Main {
	public static void main(String[] args) {
		PrimeiraTela t1 = new PrimeiraTela();
		t1.setVisible(true);

		Funcionario f1 = new Funcionario("carlos");
		Funcionario f2 = new Funcionario("Bete");
		Funcionario f3 = new Funcionario("valdor");
		Funcionario f4 = new Funcionario("hodor", true);
		Funcionario f5 = new Funcionario("wanderley", true);
		Funcionario f6 = new Funcionario("julia");
		Funcionario f7 = new Funcionario("robertinho", true);
		// f7.soCaixa();
		// FuncionarioC f7 = new FuncionarioC("robertinho");
		Funcionario f8 = new Funcionario("sasbrina");
		do {
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		} while (t1.QuantClientes == 0);

		f1.gerar(t1.QuantClientes);
		f2.t2.barraProgreso();
		f3.t2.barraProgreso();
		f4.t2.barraProgreso();
		f5.t2.barraProgreso();
		f6.t2.barraProgreso();

		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
		f6.start();
		f7.start();
		f8.start();

		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("foi interrompida.");
			}
		} while (f1.isAlive() || f2.isAlive() || f3.isAlive() || f4.isAlive() || f5.isAlive() || f6.isAlive()
				|| f7.isAlive() || f8.isAlive());
		Funcionario.rtPronto = true;

		f8.relatorio();
	}

}
