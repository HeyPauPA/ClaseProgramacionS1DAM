package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ColoresRGB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //para poner la ventana con el estilo del SSOO
					ColoresRGB frame = new ColoresRGB();
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
	public ColoresRGB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//-------- PANEL ---------
		JPanel PanelColor = new JPanel();
		PanelColor.setBackground(Color.BLACK);
		PanelColor.setBounds(132, 28, 175, 99);
		contentPane.add(PanelColor);
		
		
		//------ TEXTOS RGB ------
		JLabel TextR = new JLabel("R");
		TextR.setForeground(Color.RED);
		TextR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextR.setBounds(72, 162, 46, 14);
		contentPane.add(TextR);
		
		JLabel TextG = new JLabel("G");
		TextG.setForeground(new Color(0, 128, 0));
		TextG.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextG.setBounds(72, 189, 46, 25);
		contentPane.add(TextG);
		
		JLabel TextB = new JLabel("B");
		TextB.setForeground(Color.BLUE);
		TextB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextB.setBounds(72, 225, 46, 25);
		contentPane.add(TextB);
		//-----------------------
		
		//------ NUMEROS ------
		JLabel lblnumberR = new JLabel("0");
		lblnumberR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberR.setBounds(336, 157, 46, 25);
		contentPane.add(lblnumberR);
		
		JLabel lblnumberG = new JLabel("0");
		lblnumberG.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberG.setBounds(336, 193, 46, 24);
		contentPane.add(lblnumberG);
		
		JLabel lblnumberB = new JLabel("0");
		lblnumberB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberB.setBounds(336, 229, 46, 17);
		contentPane.add(lblnumberB);
		//------------------------
		
		//-------- SLIDERS --------
		
		//-------- R --------
		JSlider sliderR = new JSlider();
		sliderR.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				lblnumberR.setText(String.valueOf(sliderR.getValue()) );	//cojemos el texto del numero y le damos el valor 
																			//de string del valor del slider
			}
		});
		
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		sliderR.setBounds(118, 156, 200, 26);
		contentPane.add(sliderR);

		//-------- G --------
		JSlider sliderG = new JSlider();
		sliderG.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				lblnumberG.setText(String.valueOf(sliderG.getValue()));
			}
		});
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(118, 192, 200, 26);
		contentPane.add(sliderG);

		//-------- B --------
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				lblnumberB.setText(String.valueOf(sliderB.getValue()));
			}
		});
		sliderB.setMaximum(255);
		sliderB.setValue(0);
		sliderB.setBounds(118, 225, 200, 26);
		contentPane.add(sliderB);
		//------------------------
		
	}
}
