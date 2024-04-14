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
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2 extends JFrame {

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
					Formulario2 frame = new Formulario2();
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
	public Formulario2() {
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
				else if(Integer.parseInt(textFieldEdad.getText()) < 0 || Integer.parseInt(textFieldEdad.getText()) >120 ) {
					JOptionPane.showMessageDialog(this, "Revisa la edad", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					//si todos está bien, guardaré los datos en la BBDD
					JOptionPane.showMessageDialog(this, "Datos guardados", "Correcto", JOptionPane.PLAIN_MESSAGE);
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
			//HACEMOS UN DIALOGO HECHO POR NOSOTROS Q CREAMOS A PARTE

			//lo lanzamos
			DialogoParaElegirEdad miDialogo = new DialogoParaElegirEdad(this, true);//para saber q la ventana no es huerfana y mientras esta esta activa el dialogo no esta activo
			miDialogo.setLocationRelativeTo(this);//para que aparezca en el medio
			
			//de esta manera la ventana es huerfana (pero si en la parte de nex añades el this y true ya esta agrupada al padre)
			miDialogo.setVisible(true);
		}
		
		//genero el get para q el dialogo pueda tocar el campo edad
		public JTextField getTextFieldEdad() 
		{
			return textFieldEdad;
		}

}

