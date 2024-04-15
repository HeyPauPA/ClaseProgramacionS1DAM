package Repaso_Dialogo_Edad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;

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
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //para poner la ventana con el estilo del SSOO
					Formulario frame = new Formulario();
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
	public Formulario() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ELEMENTOS DE LA VENTANA
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNombre.setBounds(34, 41, 81, 36);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEdad.setBounds(34, 104, 58, 36);
		contentPane.add(lblEdad);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNombre.setBounds(123, 41, 173, 32);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(123, 104, 81, 32);
		contentPane.add(textFieldEdad);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pulsarEnviar();
			}

		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(198, 210, 98, 42);
		contentPane.add(btnNewButton);
		
		JButton btn3Puntos = new JButton("...");
		btn3Puntos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				pulsar3puntos();
			}

		});
		btn3Puntos.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn3Puntos.setBounds(214, 104, 47, 33);
		contentPane.add(btn3Puntos);
			
	}

	private void pulsarEnviar()
	{
		//comprobamos si no ha enviado nada
		if (textFieldNombre.getText().isEmpty()) 
		{
										// quien mando el mensaje,  mensaje,   titulo,  tipo de mensaje
			JOptionPane.showMessageDialog(this, "El campo nombre esta vacio", "Error Nombre", JOptionPane.ERROR_MESSAGE);
		}
		else if (textFieldEdad.getText().isEmpty()) 
		{
										// quien mando el mensaje,  mensaje,   titulo,  tipo de mensaje
			JOptionPane.showMessageDialog(this, "El campo edad esta vacio", "Error Edad", JOptionPane.ERROR_MESSAGE);
		}
		//o los datos estan mal
		else if (Integer.parseInt(textFieldEdad.getText()) < 0)
		{
			JOptionPane.showMessageDialog(this, "No se dio una edad correcta", "Error edad", JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(this, "Datos enviados", "Enviado", JOptionPane.PLAIN_MESSAGE);
		}
	}
	

	private void pulsar3puntos() 
	{
		//lanzar un dialogo para pedir la edad como devuelve un string lo guardamos en una variable
		String edad = JOptionPane.showInputDialog(this, "Teclea tu edad", "Introducir Edad", JOptionPane.QUESTION_MESSAGE);
		
		//guardamos la edad en el textfield
		textFieldEdad.setText(edad);
	}
}
