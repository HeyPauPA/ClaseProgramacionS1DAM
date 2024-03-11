package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiPrimeraVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoDeTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//pongo una linea para q la ventana tenga 
					//el aspecto del sistema operativo
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					MiPrimeraVentana frame = new MiPrimeraVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. (Contructor de la ventana) 
	 * 
	 */
	public MiPrimeraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Hola");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				campoDeTexto.setText("Hola");
			}
		});
		
//		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() 
//		{
//			@Override
//			public void mouseDragged(MouseEvent e) 
//			{
//				campoDeTexto.setText("Hola");
//			}
//		});
//		
//		btnNewButton.addMouseListener(new MouseAdapter() 
//		{
//			@Override
//			public void mouseClicked(MouseEvent e) 
//			{
//				campoDeTexto.setText("Hola");
//			}
//		});
		
		btnNewButton.setBounds(62, 158, 112, 23);
		contentPane.add(btnNewButton);
		
		campoDeTexto = new JTextField();
		campoDeTexto.setFont(new Font("Sitka Display", Font.BOLD, 16));
		campoDeTexto.setBounds(77, 104, 300, 43);
		contentPane.add(campoDeTexto);
		campoDeTexto.setColumns(10);
		
		JButton btnAdios = new JButton("Adios");
		btnAdios.setBounds(274, 158, 112, 23);
		contentPane.add(btnAdios);
	}
}
