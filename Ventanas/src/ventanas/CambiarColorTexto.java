package ventanas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class CambiarColorTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTextoPrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarColorTexto frame = new CambiarColorTexto();
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
	public CambiarColorTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				lblTextoPrueba.setForeground(Color.BLUE); 
			}
		});
		btnAzul.setBounds(51, 208, 89, 23);
		contentPane.add(btnAzul);
		
		lblTextoPrueba = new JLabel("Texto Prueba");
		lblTextoPrueba.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTextoPrueba.setBounds(142, 97, 165, 61);
		contentPane.add(lblTextoPrueba);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				lblTextoPrueba.setForeground(Color.RED); 
			}
		});
		btnRojo.setBounds(175, 208, 89, 23);
		contentPane.add(btnRojo);
		
		JButton btnNewButton = new JButton("Verde");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lblTextoPrueba.setForeground(Color.GREEN); 
			}
		});
		btnNewButton.setBounds(304, 208, 89, 23);
		contentPane.add(btnNewButton);
	}
}
