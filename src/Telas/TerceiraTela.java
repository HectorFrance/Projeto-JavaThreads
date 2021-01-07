package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Funcionario;

import javax.swing.JLabel;

public class TerceiraTela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerceiraTela frame = new TerceiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TerceiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(Funcionario.i1.nome + " = " + Funcionario.i1.cont);
		lblNewLabel.setBounds(5, 59, 419, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Funcionario.i2.nome + " = " + Funcionario.i2.cont);
		lblNewLabel_1.setBounds(5, 72, 419, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(Funcionario.i3.nome + " = " + Funcionario.i3.cont);
		lblNewLabel_2.setBounds(5, 84, 419, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(Funcionario.i4.nome + " = " + Funcionario.i4.cont);
		lblNewLabel_3.setBounds(5, 97, 419, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(Funcionario.i5.nome + " = " + Funcionario.i5.cont);
		lblNewLabel_4.setBounds(5, 109, 419, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(Funcionario.i6.nome + " = " + Funcionario.i6.cont);
		lblNewLabel_5.setBounds(5, 122, 419, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(Funcionario.i7.nome + " = " + Funcionario.i7.cont);
		lblNewLabel_6.setBounds(5, 134, 429, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(Funcionario.i8.nome + " = " + Funcionario.i8.cont);
		lblNewLabel_7.setBounds(5, 147, 429, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(Funcionario.i9.nome + " = " + Funcionario.i9.cont);
		lblNewLabel_8.setBounds(5, 159, 429, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(Funcionario.i10.nome + " = " + Funcionario.i10.cont);
		lblNewLabel_9.setBounds(5, 172, 429, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(Funcionario.i11.nome + " = " + Funcionario.i11.cont);
		lblNewLabel_10.setBounds(5, 184, 429, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(Funcionario.i12.nome + " = " + Funcionario.i12.cont);
		lblNewLabel_11.setBounds(5, 197, 429, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Caixa 1 atendeu: " + Funcionario.c1.cont + " Clientes");
		lblNewLabel_12.setBounds(5, 247, 429, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_15 = new JLabel("Caixa 2 atendeu: " + Funcionario.c2.cont + " Clientes");
		lblNewLabel_15.setBounds(5, 272, 419, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblIngredientesUsados = new JLabel("Ingredientes Usados");
		lblIngredientesUsados.setBounds(150, 11, 153, 14);
		contentPane.add(lblIngredientesUsados);
	}
}
