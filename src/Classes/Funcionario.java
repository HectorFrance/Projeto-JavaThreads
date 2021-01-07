package Classes;

public class Funcionario extends Thread {
	String nome;
	String acao;
	Clientes c;
	public static boolean rtPronto = false;
	static Fila clientes = new Fila();
	static Fila filaCaixa = new Fila();
	int quantC;
	public static BarraP t2 = new BarraP();
	boolean caixa = false;
	boolean soCAixa = false;
	boolean vbarras;

	public static Ingredientes i1 = new Ingredientes(1, 100, "Pão normal");
	public static Ingredientes i2 = new Ingredientes(2, 1200, "Pão integral");
	public static Ingredientes i3 = new Ingredientes(3, 700, "Pão 3 queijo");
	public static Ingredientes i4 = new Ingredientes(4, 650, "atum");
	public static Ingredientes i5 = new Ingredientes(5, 50, "bife");
	public static Ingredientes i6 = new Ingredientes(6, 150, "peito de frango");
	public static Ingredientes i7 = new Ingredientes(7, 900, "queijo cheddar");
	public static Ingredientes i8 = new Ingredientes(8, 750, "queijo mozarela");
	public static Ingredientes i9 = new Ingredientes(9, 1500, "queijo coalho");
	public static Ingredientes i10 = new Ingredientes(10, 2000, "molho barbecue");
	public static Ingredientes i11 = new Ingredientes(11, 1700, "molho parmesão");
	public static Ingredientes i12 = new Ingredientes(12, 1010, "molho chipotle");

	public static Caixa c1 = new Caixa(1, 700);
	public static Caixa c2 = new Caixa(2, 300);

	public void run() {
		if (clientes.tamanho() > 0) {
			do {
				if (clientes.tamanho() > 0) {
					c = clientes.proximo();
					try {
						do {
							sleep(100);
							vbarras = t2.barrasV();
						} while (vbarras == true);
						int tempo = (usarIng(c.pedido[0]));
						BarraP.preencherbarras(tempo, nome, acao);
						sleep(tempo);
						do {
							sleep(100);
							vbarras = t2.barrasV();
						} while (vbarras == true);
						tempo = (usarIng(c.pedido[1]));
						BarraP.preencherbarras(tempo, nome, acao);
						sleep(tempo);
						do {
							sleep(100);
							vbarras = t2.barrasV();
						} while (vbarras == true);
						tempo = (usarIng(c.pedido[2]));
						sleep(tempo);
						;
						BarraP.preencherbarra2(tempo, nome, acao);
					} catch (Exception e) {
						System.out.println("deu erro");
						e.printStackTrace();
					}

					try {
						do {
							sleep(100);
						} while (c1.ocupado == true && c2.ocupado == true);
						if (c1.ocupado == false) {
							acao = "Passando no caixa 1";
							do {
								sleep(100);
								vbarras = t2.barrasV();
							} while (vbarras == true);
							BarraP.preencherbarra3(c1.tempo, nome, acao);
							c1.atender();
							sleep(c1.tempo);
							c1.terminar();
						} else {
							acao = "Passando no caixa 2";
							do {
								sleep(100);
								vbarras = t2.barrasV();
							} while (vbarras == true);
							BarraP.preencherbarra4(c2.tempo, nome, acao);
							c2.atender();
							sleep(c2.tempo);
							c2.terminar();
						}
					} catch (Exception e2) {
						System.out.println("deu erro");
						e2.printStackTrace();
					}
				}

			} while (clientes.tamanho() > 0);
		}
	}

	synchronized public int usarIng(int ing) {
		switch (ing) {
		case 1:
			acao = "colocando " + i1.getNome();
			return i1.usar();
		case 2:
			acao = "colocando " + i2.getNome();
			return i2.usar();
		case 3:
			acao = "colocando " + i3.getNome();
			return i3.usar();
		case 4:
			acao = "colocando " + i4.getNome();
			return i4.usar();
		case 5:
			acao = "colocando " + i5.getNome();
			return i5.usar();
		case 6:
			acao = "colocando " + i6.getNome();
			return i6.usar();
		case 7:
			acao = "colocando " + i7.getNome();
			return i7.usar();
		case 8:
			acao = "colocando " + i8.getNome();
			return i8.usar();
		case 9:
			acao = "colocando " + i9.getNome();
			return i9.usar();
		case 10:
			acao = "colocando " + i10.getNome();
			return i10.usar();
		case 11:
			acao = "colocando " + i11.getNome();
			return i11.usar();
		case 12:
			acao = "colocando " + i12.getNome();
			return i12.usar();
		default:
			break;
		}
		return 0;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, boolean caixa) {
		this.nome = nome;
		this.caixa = caixa;
	}

	public void soCaixa() {
		this.soCAixa = true;
	}

	public void gerar(int q) {
		this.quantC = q;
		for (int i = 0; i < q; i++) {
			Clientes c = new Clientes();
			c.numCliente = i;
			clientes.adcinar(c);
		}
	}

	static public void relatorio() {
		System.out.println(i1.nome + " = " + i1.cont);
		System.out.println(i2.nome + " = " + i2.cont);
		System.out.println(i3.nome + " = " + i3.cont);
		System.out.println(i4.nome + " = " + i4.cont);
		System.out.println(i5.nome + " = " + i5.cont);
		System.out.println(i6.nome + " = " + i6.cont);
		System.out.println(i7.nome + " = " + i7.cont);
		System.out.println(i8.nome + " = " + i8.cont);
		System.out.println(i9.nome + " = " + i9.cont);
		System.out.println(i10.nome + " = " + i10.cont);
		System.out.println(i11.nome + " = " + i11.cont);
		System.out.println(i12.nome + " = " + i12.cont);
		System.out.println();
		System.out.println("Caixa 1 atendeu: " + c1.cont + " Clientes");
		System.out.println("Caixa 2 atendeu: " + c2.cont + " Clientes");
	}

	/*
	 * synchronized static public void barraProgreso() { t2.setVisible(true); }
	 * 
	 * synchronized public void preencherbarras(int i) { if (b1 == false) {
	 * preencherbarra1(i); } if (b2 == false) { preencherbarra2(i); } if (b3 ==
	 * false) { preencherbarra3(i); } if (b4 == false) { preencherbarra4(i); }
	 * 
	 * }
	 * 
	 * synchronized public void preencherbarra1(int i) { b1 = true;
	 * t2.lblNewLabel_1D.setText("Func :" + this.nome);
	 * t2.lblNewLabel_1E.setText(acao); do { t2.barra1.setValue(carg); carg++; }
	 * while (carg < i); carg = i; b1 = false; }
	 * 
	 * synchronized public void preencherbarra2(int i) { b2 = true; do {
	 * t2.lblNewLabel_2D.setText("Func :" + nome); t2.lblNewLabel_2E.setText(acao);
	 * t2.barra2.setValue(carg); carg += 10; } while (carg <= i); carg = i; b2 =
	 * false; }
	 * 
	 * synchronized public void preencherbarra3(int i) { b3 = true; do {
	 * t2.lblNewLabel_3D.setText("Func :" + this.nome);
	 * t2.lblNewLabel_3E.setText(acao); t2.barra3.setValue(carg); carg += 10; }
	 * while (carg <= i); carg = i; b3 = false; }
	 * 
	 * synchronized public void preencherbarra4(int i) { b4 = true; do {
	 * t2.lblNewLabel_4D.setText("Func :" + nome); t2.lblNewLabel_4E.setText(acao);
	 * t2.barra4.setValue(carg); carg += 10; } while (carg <= i); carg = i; b4 =
	 * false; }
	 */
}
