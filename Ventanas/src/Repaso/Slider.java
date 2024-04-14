package Repaso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Slider extends JFrame {

	//Atributos
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					//aqui añado codigo para q la ventana se vea como en el SSOO
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					Slider frame = new Slider();
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
	 * Constructor
	 */
	public Slider() 
	{
		setTitle("Slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTextoSlider = new JLabel("0");
		lblTextoSlider.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTextoSlider.setBounds(183, 57, 71, 54);
		contentPane.add(lblTextoSlider);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				lblTextoSlider.setText(String.valueOf(slider.getValue()));
			}
		});

		slider.setValue(0);
		slider.setBounds(79, 139, 270, 34);
		contentPane.add(slider);
	}
}
