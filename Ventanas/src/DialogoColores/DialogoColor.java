package DialogoColores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class DialogoColor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup BotonesColores = new ButtonGroup();
	
	private JRadioButton radioButtonNegro;
	private JRadioButton radioButtonAzul;
	private JRadioButton radioButtonRojo;
	private JRadioButton radioButtonVerde;
	private JRadioButton radioButtonAmarillo;

	/**
	 * Create the dialog.
	 */
	public DialogoColor(JFrame padre, boolean modal) 
	{
		super(padre,modal);
		setBounds(100, 100, 229, 233);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		radioButtonNegro = new JRadioButton("Negro");
		radioButtonNegro.setSelected(true);
		BotonesColores.add(radioButtonNegro);
		radioButtonNegro.setBounds(18, 17, 109, 23);
		contentPanel.add(radioButtonNegro);
		
		radioButtonAzul = new JRadioButton("Azul");
		BotonesColores.add(radioButtonAzul);
		radioButtonAzul.setBounds(18, 43, 109, 23);
		contentPanel.add(radioButtonAzul);
		
		radioButtonRojo = new JRadioButton("Rojo");
		BotonesColores.add(radioButtonRojo);
		radioButtonRojo.setBounds(18, 69, 109, 23);
		contentPanel.add(radioButtonRojo);
		
		radioButtonVerde = new JRadioButton("Verde");
		BotonesColores.add(radioButtonVerde);
		radioButtonVerde.setBounds(18, 95, 109, 23);
		contentPanel.add(radioButtonVerde);
		
		radioButtonAmarillo = new JRadioButton("Amarillo");
		BotonesColores.add(radioButtonAmarillo);
		radioButtonAmarillo.setBounds(18, 121, 109, 23);
		contentPanel.add(radioButtonAmarillo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						accionPulsarOK();
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						accionPulsarCancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
		}

	}
	//FUNCIONES DEL OK Y EL CANCEL (para dialogos siempre hacerlos)
	private void accionPulsarOK() 
	{
		//averiguar el color elegido
		Color colorElegido = Color.BLACK;
		
		if (radioButtonNegro.isSelected()) 
		{
			colorElegido = Color.BLACK;
		}
		else if (radioButtonAzul.isSelected()) 
		{
			colorElegido = Color.BLUE;
		}
		else if (radioButtonRojo.isSelected()) 
		{
			colorElegido = Color.RED;
		}
		else if (radioButtonVerde.isSelected()) 
		{
			colorElegido = Color.GREEN;
		}
		else if (radioButtonAmarillo.isSelected()) 
		{
			colorElegido = Color.YELLOW;
		}
		
		//hablar con el padre para cambiar el color del texto
		((VentanaColores)this.getParent()).getTextoPrueba().setForeground(colorElegido);
		
		//borrar ventana
		this.dispose();
	}
	private void accionPulsarCancel() 
	{
		this.dispose();
	}
	
	private void seleccionarColorAdecuado() 
	{
		//hablar con la ventana Principal y preguntar el color de la etiqueta
		//Color colorElegido = ((VentanaColores)this.getParent()).getTextoPrueba().setForeground(colorElegido);
		//seleccionar boton adecuado
	}
}
