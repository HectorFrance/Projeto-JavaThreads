package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraTela extends JFrame {

	private JPanel contentPane;
	public JTextField txtQuantC;
	public int QuantClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDigiteAQuantidade = new JLabel("Digite a Quantidade de Clientes");
		lblDigiteAQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDigiteAQuantidade.setBounds(111, 53, 207, 25);
		contentPane.add(lblDigiteAQuantidade);

		txtQuantC = new JTextField();
		txtQuantC.setBounds(164, 110, 86, 20);
		contentPane.add(txtQuantC);
		txtQuantC.setColumns(10);

		JButton btnPronto = new JButton("Pronto");
		btnPronto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null, "Num : " + txtQuantC.getText());

				try {
					QuantClientes = Integer.parseInt(txtQuantC.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Numero invalido");
				}

				dispose();
			}
		});
		btnPronto.setBounds(141, 161, 133, 36);
		contentPane.add(btnPronto);
	}
}
