package Dialogo;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEdad;
	private JTextField textFieldNombre;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //para poner la ventana con el estilo del SSOO
					Formulario frame = new Formulario();
					frame.setLocationRelativeTo(null);//para centrar la ventana

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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(29, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(29, 88, 46, 14);
		contentPane.add(lblEdad);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(85, 34, 195, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(85, 85, 46, 20);
		contentPane.add(textFieldEdad);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				guardar();
			}
		});
		btnNewButton.setBounds(172, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnTresPuntos = new JButton("...");
		btnTresPuntos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pulsadoTresPuntos();
			}
		});
		btnTresPuntos.setBounds(156, 84, 56, 23);
		contentPane.add(btnTresPuntos);

	}
		private void guardar()
		{
			//revisar que Ios datos están bien, sino tendré que avisar
			try {
				
				if( textFieldNombre.getText().isBlank()) 
				{
					JOptionPane.showMessageDialog(this,  "No relleno el nombre", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(textFieldEdad.getText().isBlank())
				{
					JOptionPane.showMessageDialog(this,  "No relleno la edad", "Error", JOptionPane.WARNING_MESSAGE);
				}
			} 
			catch (HeadlessException e) 
			{
				JOptionPane.showMessageDialog(this,  "No relleno el nombre", "Error", JOptionPane.WARNING_MESSAGE);
			}
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(this, "Edad incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
			}
		
			// si todos está bien, guardaré los datos en la BBDD
		}

		private void pulsadoTresPuntos() 
		{
			//lanzar un dialogo para que tecleen la edad
			//guardamos eso en una variable string para acceder al dato ( te devuelve el string no pasa nada9
			String resultado = JOptionPane.showInputDialog(this, "Teclea tu edad", "Edad", JOptionPane.PLAIN_MESSAGE);

			textFieldEdad.setText(resultado);
			
		}
}
