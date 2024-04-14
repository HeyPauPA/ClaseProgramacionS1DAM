package Repaso;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaColores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTextoColores; //→acaba declarada aqui como atributo

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					//aqui añado codigo para q la ventana se vea como en el SSOO
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					VentanaColores frame = new VentanaColores();
					frame.setVisible(true);	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaColores() {
		//crear pantalla
		setTitle("Ventana de colores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTextoColores = new JLabel("Texto Colores");
															  //fuera de este por lo tanto lo convertimos atributo de la clase
		lblTextoColores.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 33));
		lblTextoColores.setBounds(143, 54, 213, 70);
		contentPane.add(lblTextoColores);
		
		//BOTON AZUL
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				actualizar((Color.BLUE));	
			}
		});
		btnAzul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAzul.setBounds(26, 197, 96, 29);
		contentPane.add(btnAzul);
		
		//BOTON ROJO
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				actualizar((Color.RED));
			}
		});
		btnRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRojo.setBounds(143, 197, 96, 29);
		contentPane.add(btnRojo);
		
		//BOTON VERDE
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				actualizar((Color.GREEN));
			}
		});
		btnVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerde.setBounds(256, 197, 96, 29);
		contentPane.add(btnVerde);
		
		//BOTON AMARILLO
		JButton btnAmarillo = new JButton("Amarillo");
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				actualizar((Color.YELLOW));
			}
		});
		btnAmarillo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAmarillo.setBounds(373, 197, 96, 29);
		contentPane.add(btnAmarillo);
		
	}
	
	private void actualizar(Color color) 
	{
		lblTextoColores.setForeground(color);
	}
}
