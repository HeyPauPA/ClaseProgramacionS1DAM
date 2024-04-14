package Repaso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Pantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Pantalla = new JTextField();
		Pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		Pantalla.setFont(new Font("Tahoma", Font.BOLD, 26));
		Pantalla.setText("0");
		Pantalla.setBounds(48, 44, 360, 46);
		contentPane.add(Pantalla);
		Pantalla.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(48, 112, 64, 64);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(122, 112, 64, 64);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(196, 112, 64, 64);
		contentPane.add(btn9);
		
		JButton btnCe = new JButton("CE");
		btnCe.setForeground(new Color(255, 0, 0));
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCe.setBounds(270, 112, 138, 64);
		contentPane.add(btnCe);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(48, 186, 64, 64);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(122, 186, 64, 64);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(196, 186, 64, 64);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(48, 260, 64, 64);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(122, 260, 64, 64);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(196, 260, 64, 64);
		contentPane.add(btn3);
		
		JButton btnMasMenos = new JButton("+/-");
		btnMasMenos.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMasMenos.setBounds(48, 334, 64, 64);
		contentPane.add(btnMasMenos);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBounds(122, 334, 64, 64);
		contentPane.add(btn0);
		
		JButton btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPunto.setBounds(196, 334, 64, 64);
		contentPane.add(btnPunto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setForeground(Color.RED);
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnIgual.setBounds(270, 334, 138, 64);
		contentPane.add(btnIgual);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDivision.setBounds(344, 186, 64, 64);
		contentPane.add(btnDivision);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMultiplicacion.setBounds(270, 186, 64, 64);
		contentPane.add(btnMultiplicacion);
		
		JButton btnResta = new JButton("-");
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnResta.setBounds(344, 260, 64, 64);
		contentPane.add(btnResta);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSuma.setBounds(270, 260, 64, 64);
		contentPane.add(btnSuma);
	}
}
