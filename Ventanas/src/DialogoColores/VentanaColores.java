package DialogoColores;

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
import java.awt.Color;

public class VentanaColores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelTextoPrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			/* → */UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaColores frame = new VentanaColores();
			/* → */frame.setLocationRelativeTo(null);

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
	public VentanaColores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTextoPrueba = new JLabel("Texto Prueba");
		labelTextoPrueba.setForeground(Color.BLACK);
		labelTextoPrueba.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		labelTextoPrueba.setBounds(131, 72, 175, 43);
		contentPane.add(labelTextoPrueba);
		
		JButton ButtonCambiarColor = new JButton("Cambiar Color");
		ButtonCambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PulsarBotonCambio();
			}

		});
		ButtonCambiarColor.setBounds(155, 136, 125, 23);
		contentPane.add(ButtonCambiarColor);
	}
	
	//evento pulsar boton cambiar color
	private void PulsarBotonCambio() 
	{
		//creamos el dialogo *RECUERDA DESPUES HACER EL THIS Y TRUE
		DialogoColor miDialogo =  new DialogoColor(this,true);
		
		//hacemos q el dialogo este relativo a la ventana
		miDialogo.setLocationRelativeTo(this);
		
		//hacemos q se vea *SET*
		miDialogo.setVisible(true);
	
	}
	
	//evento para buscar el texto simplemente devuelve el objeto texto
	public JLabel getTextoPrueba() 
	{
		return labelTextoPrueba;
	}
	
}
