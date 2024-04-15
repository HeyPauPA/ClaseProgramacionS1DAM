package Repaso_Dialogo_Edad;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoEdad extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNumero;

	/**
	 * Create the dialog.
	 */
	public DialogoEdad(JFrame padre, boolean modal) //pasamos al dialogo info de su padre y si es modal
	{
		super(padre, modal);//pasamos la informacion al constructor
		setTitle("Elegir Edad");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNumero = new JLabel("0");
			lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNumero.setBounds(171, 85, 79, 23);
			contentPanel.add(lblNumero);
		}
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				lblNumero.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setBounds(57, 119, 306, 26);
		contentPanel.add(slider);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						
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
						pulsadoCancelar();
					}

				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private void pulsadoCancelar() 
	{
	//hay q cerrar el dialogo
		this.dispose();	
	}
	private void pulsadoOK() 
	{
	//averiguo quien es mi padre
		this.getParent();

	}
	
}
