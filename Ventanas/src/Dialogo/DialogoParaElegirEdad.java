package Dialogo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoParaElegirEdad extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblValor;
	private JSlider slider;

	
	/*
	
	
		↑ BORRAMOS LA PARTE DE LAUNCH (METODO MAIN) ↓


	*/
	
	/**
	 * Create the dialog.
	 */
	
	//anadimos al constructor quien es su padre 
	//(esto solo se hace si el dialogo se tiene q comunicar con su padre
	//hacemos q le pasa quien es la ventana padre ↓
	public DialogoParaElegirEdad        (JFrame padre, boolean modal) 
	{
		//lanzo la superclase
		super(padre, modal);
		setTitle("Selecciona La Edad");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			slider = new JSlider();
			slider.setMaximum(120);
			slider.setValue(0);
			slider.setBounds(90, 105, 241, 88);
			contentPanel.add(slider);
		}
		{
			lblValor = new JLabel("0");
			lblValor.setFont(new Font("Tahoma", Font.PLAIN, 22));
			lblValor.setBounds(181, 67, 56, 27);
			contentPanel.add(lblValor);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						pulsandoOK();
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
						 pulsandoCancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		slider.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				actualizar();
			}
		});
	}
	private void actualizar() 
	{
		lblValor.setText(String.valueOf(slider.getValue()));
		
	}
	private void pulsandoCancel() 
	{
		//el dialogo debe desaparecer
		//this.setVisible(false); //esto hace q se deje de ver
		
		this.dispose(); //esto lo elimina	
	}
	
	private void pulsandoOK() 
	{
		((Formulario2)this.getParent()).getTextFieldEdad().setText(lblValor.getText());
		//aquí termina mi trabajo
		this.dispose();
		
	}

}
