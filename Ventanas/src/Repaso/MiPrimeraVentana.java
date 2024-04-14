package Repaso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiPrimeraVentana extends JFrame 
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campodetexto;

	//Launch the application.
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try //crea el objeto ventana
				{
					//aqui añado codigo para q la ventana se vea como en el SSOO
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					MiPrimeraVentana frame = new MiPrimeraVentana();
					frame.setVisible(true);
					
				} 
				catch (Exception e) // si hay algun error lo atrapa
				{
					e.printStackTrace();
				}
			}
		});
	}

	//  Create the frame.
	public MiPrimeraVentana() 
	{
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //funcion x defecto para q al pulsar x se cierre
		setBounds(100, 100, 450, 300);//tamaño de la ventana
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CREACION DE OBJETOS
		JButton ButtonBuenosDias = new JButton("Buenos Días");
		ButtonBuenosDias.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				campodetexto.setText("Buenos Dias");
			}
		});
		ButtonBuenosDias.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ButtonBuenosDias.setBounds(55, 179, 134, 47);
		contentPane.add(ButtonBuenosDias);
		
		JButton ButtonBuenasNoches = new JButton("Buenas Noches");
		ButtonBuenasNoches.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				campodetexto.setText("Buenas Noches");
			}
		});
		ButtonBuenasNoches.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ButtonBuenasNoches.setBounds(233, 179, 134, 47);
		contentPane.add(ButtonBuenasNoches);
		
		campodetexto = new JTextField();
		campodetexto.setBounds(89, 85, 250, 31);
		contentPane.add(campodetexto);
		campodetexto.setColumns(10);
	}
}
