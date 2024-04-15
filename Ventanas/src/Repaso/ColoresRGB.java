package Repaso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ColoresRGB extends JFrame {

	private static final long serialVersionUID = 1L;
	//atributos
	private JPanel contentPane;
	private JSlider sliderR;
	private JSlider sliderG;
	private JSlider sliderB;
	private JLabel lblnumberR;
	private JLabel lblnumberG;
	private JLabel lblnumberB;
	private JPanel panelColor;

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
		
		
		panelColor = new JPanel();
		panelColor.setBackground(Color.BLACK);
		panelColor.setBounds(132, 28, 175, 99);
		contentPane.add(panelColor);
		
		
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
		
		lblnumberR = new JLabel("0");
		lblnumberR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberR.setBounds(336, 157, 46, 25);
		contentPane.add(lblnumberR);
		
		lblnumberG = new JLabel("0");
		lblnumberG.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberG.setBounds(336, 193, 46, 24);
		contentPane.add(lblnumberG);
		
		lblnumberB = new JLabel("0");
		lblnumberB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnumberB.setBounds(336, 229, 46, 17);
		contentPane.add(lblnumberB);
		//------------------------
		
		//-------- SLIDERS --------
		
		sliderR = new JSlider(); //tengo q inicializar en el inicio
		sliderG = new JSlider();
		sliderB = new JSlider();
		
		sliderR.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				actualizar(); 
			}
		});
		
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		sliderR.setBounds(118, 156, 200, 26);
		contentPane.add(sliderR);

		
		sliderG.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				actualizar(); 
			}
		});
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(118, 192, 200, 26);
		contentPane.add(sliderG);

		
		sliderB.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e) 
			{
				 actualizar(); 
			}

		});
		sliderB.setMaximum(255);
		sliderB.setValue(0);
		sliderB.setBounds(118, 225, 200, 26);
		contentPane.add(sliderB);
		//------------------------
		
	}

	private void actualizar() 
	{
		//guardamos los datos de los colores
		int valorRojo = sliderR.getValue();
		int valorVerde= sliderG.getValue();
		int valorAzul= sliderB.getValue();
		
		//actualizamos numeros del slider
		lblnumberR.setText(String.valueOf(valorRojo));
		lblnumberG.setText(String.valueOf(valorVerde));
		lblnumberB.setText(String.valueOf(valorAzul));
		
		//usamos todos lo valores para crear un nuevo color q utilizaremos en el panel
		panelColor.setBackground(new Color(valorRojo,valorVerde,valorAzul));
	}
	
}
