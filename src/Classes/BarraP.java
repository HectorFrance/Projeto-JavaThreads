package Classes;

import Telas.SegundaTela;

public class BarraP {
	static SegundaTela tb = new SegundaTela();
	static boolean b1 = false;
	static boolean b2 = false;
	static boolean b3 = false;
	static boolean b4 = false;

	synchronized static public void barraProgreso() {
		tb.setVisible(true);
	}

	synchronized public boolean barrasV() {

		if (b1 == true && b2 == true && b3 == true && b4 == true) {
			return true;
		} else {
			return false;
		}
	}

	synchronized public static void preencherbarras(int i, String nome, String acao) {
		if (b1 == false) {
			preencherbarra1(i, nome, acao);
		} else if (b2 == false) {
			preencherbarra2(i, nome, acao);
		} else if (b3 == false) {
			preencherbarra3(i, nome, acao);
		} else {
			preencherbarra4(i, nome, acao);
		}

	}

	synchronized static public void preencherbarra1(int i, String nome, String acao) {
		b1 = true;
		long tempoFrames = 1000 / 30;
		float progresso = 0.0f;
		long tempoInicial = System.currentTimeMillis();
		long tempoAtual = 0;
		while (true) {
			tempoAtual = System.currentTimeMillis();
			if (progresso >= 100.0f)
				break;
			if ((tempoAtual - tempoInicial) >= tempoFrames) {
				tempoInicial = tempoAtual;
				tb.lblNewLabel_1D.setText(nome);
				tb.lblNewLabel_1E.setText("Func: " + acao);

				progresso += 100.0f / (i * ((float) tempoFrames / 1000));
				tb.barra1.setValue((int) progresso);
			}
		}
		b1 = false;
	}

	synchronized static public void preencherbarra2(int i, String nome, String acao) {
		b2 = true;
		long tempoFrames = 1000 / 30;
		float progresso = 0.0f;
		long tempoInicial = System.currentTimeMillis();
		long tempoAtual = 0;
		while (true) {
			tempoAtual = System.currentTimeMillis();
			if (progresso >= 100.0f)
				break;
			if ((tempoAtual - tempoInicial) >= tempoFrames) {
				tempoInicial = tempoAtual;
				tb.lblNewLabel_2D.setText(nome);
				tb.lblNewLabel_2E.setText("Func: " + acao);

				progresso += 100.0f / (i * ((float) tempoFrames / 1000));
				tb.barra2.setValue((int) progresso);
			}
		}
		b2 = false;
	}

	synchronized static public void preencherbarra3(int i, String nome, String acao) {
		b3 = true;
		long tempoFrames = 1000 / 30;
		float progresso = 0.0f;
		long tempoInicial = System.currentTimeMillis();
		long tempoAtual = 0;
		while (true) {
			tempoAtual = System.currentTimeMillis();
			if (progresso >= 100.0f)
				break;
			if ((tempoAtual - tempoInicial) >= tempoFrames) {
				tempoInicial = tempoAtual;
				tb.lblNewLabel_3D.setText(nome);
				tb.lblNewLabel_3E.setText("Func: " + acao);

				progresso += 100.0f / (i * ((float) tempoFrames / 1000));
				tb.barra3.setValue((int) progresso);
			}
		}
		b3 = false;
	}

	synchronized static public void preencherbarra4(int i, String nome, String acao) {

		b4 = true;
		long tempoFrames = 1000 / 30;
		float progresso = 0.0f;
		long tempoInicial = System.currentTimeMillis();
		long tempoAtual = 0;
		while (true) {
			tempoAtual = System.currentTimeMillis();
			if (progresso >= 100.0f)
				break;
			if ((tempoAtual - tempoInicial) >= tempoFrames) {
				tempoInicial = tempoAtual;
				tb.lblNewLabel_4D.setText(nome);
				tb.lblNewLabel_4E.setText("Func: " + acao);

				progresso += 100.0f / (i * ((float) tempoFrames / 1000));
				tb.barra4.setValue((int) progresso);
			}
		}

		b4 = false;

	}
}
