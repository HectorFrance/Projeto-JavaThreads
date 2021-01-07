package Telas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Funcionario;

import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SegundaTela extends JFrame {

	private JPanel contentPane;
	static public JProgressBar barra1 = new JProgressBar();
	static public JProgressBar barra2 = new JProgressBar();
	static public JProgressBar barra3 = new JProgressBar();
	static public JProgressBar barra4 = new JProgressBar();
	public JLabel lblNewLabel_1D = new JLabel();
	public JLabel lblNewLabel_2D = new JLabel();
	public JLabel lblNewLabel_3D = new JLabel();
	public JLabel lblNewLabel_4D = new JLabel();
	public JLabel lblNewLabel_1E = new JLabel();
	public JLabel lblNewLabel_2E = new JLabel();
	public JLabel lblNewLabel_3E = new JLabel();
	public JLabel lblNewLabel_4E = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaTela frame = new SegundaTela();
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
	public SegundaTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		barra4.setBounds(129, 135, 146, 23);
		contentPane.add(barra4);
		barra4.setForeground(new Color(50, 200, 50));
		barra4.setStringPainted(true);

		barra3.setBounds(129, 101, 146, 23);
		contentPane.add(barra3);
		barra3.setForeground(new Color(50, 200, 50));
		barra3.setStringPainted(true);

		barra2.setBounds(129, 67, 146, 23);
		contentPane.add(barra2);
		barra2.setForeground(new Color(50, 200, 50));
		barra2.setStringPainted(true);

		barra1.setBounds(129, 33, 146, 23);
		contentPane.add(barra1);
		barra1.setForeground(new Color(50, 200, 50));
		barra1.setStringPainted(true);

		JButton btnPronto = new JButton("Pronto");
		btnPronto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (Funcionario.rtPronto == false);
				new TerceiraTela().setVisible(true);
				// Funcionario.relatorio();
				dispose();
			}
		});
		btnPronto.setBounds(154, 192, 89, 23);
		contentPane.add(btnPronto);

		lblNewLabel_1D.setBounds(10, 33, 109, 14);
		contentPane.add(lblNewLabel_1D);
		lblNewLabel_2D.setBounds(10, 67, 109, 14);

		contentPane.add(lblNewLabel_2D);
		lblNewLabel_3D.setBounds(10, 101, 109, 14);

		contentPane.add(lblNewLabel_3D);
		lblNewLabel_4D.setBounds(10, 135, 109, 14);

		contentPane.add(lblNewLabel_4D);
		lblNewLabel_1E.setBounds(285, 33, 181, 14);

		contentPane.add(lblNewLabel_1E);
		lblNewLabel_2E.setBounds(285, 67, 181, 14);

		contentPane.add(lblNewLabel_2E);
		lblNewLabel_3E.setBounds(285, 101, 181, 14);

		contentPane.add(lblNewLabel_3E);
		lblNewLabel_4E.setBounds(285, 135, 181, 14);

		contentPane.add(lblNewLabel_4E);
	}
}
