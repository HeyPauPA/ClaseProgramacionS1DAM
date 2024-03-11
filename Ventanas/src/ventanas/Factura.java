package ventanas;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.text.DecimalFormat;

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoCantidad;
	private JTextField textoIVA;
	private JTextField textoTotal;
	private final ButtonGroup GrupoBotonesIVA = new ButtonGroup();
	
	//Si queremos interactuar con algo tenemos q hacer q sea un atributo
	private JRadioButton rButtonIVA_21;
	private JRadioButton rButtonIVA_10;
	private JRadioButton rButtonIVA_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //para poner la ventana con el estilo del SSOO
					Factura frame = new Factura();
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
	public Factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//------- TEXTOS DESC. ---------
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(25, 37, 46, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(25, 119, 46, 14);
		contentPane.add(lblIva);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(25, 217, 46, 14);
		contentPane.add(lblTotal);
		
		//------- CAJA DE TEXTO---------	
		textoCantidad = new JTextField();
		
		//creamos el evento a mano
		textoCantidad.getDocument().addDocumentListener(new DocumentListener() 
		{
			//si borramos algo de la caja de texto actualizamos
			@Override
			public void removeUpdate(DocumentEvent e) 
			{
				actualizar();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) 
			{
				actualizar();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) 
			{
				actualizar();
			}
		});
		
		textoCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		textoCantidad.setBounds(103, 34, 86, 20);
		contentPane.add(textoCantidad);
		textoCantidad.setColumns(10);
		
		textoIVA = new JTextField();
		textoIVA.setEditable(false);
		textoIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		textoIVA.setColumns(10);
		textoIVA.setBounds(103, 116, 86, 20);
		contentPane.add(textoIVA);
		
		textoTotal = new JTextField();
		textoTotal.setEditable(false);
		textoTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textoTotal.setColumns(10);
		textoTotal.setBounds(103, 214, 86, 20);
		contentPane.add(textoTotal);
		
		//------- BOTONES IVA - RADIO  ---------
		
		rButtonIVA_21 = new JRadioButton("21%");
		rButtonIVA_21.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				actualizar();
			}
		});
		GrupoBotonesIVA.add(rButtonIVA_21);
		rButtonIVA_21.setSelected(true);
		rButtonIVA_21.setBounds(103, 72, 109, 23);
		contentPane.add(rButtonIVA_21);
		
		rButtonIVA_10 = new JRadioButton("10%");
		rButtonIVA_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				actualizar();
			}
		});
		GrupoBotonesIVA.add(rButtonIVA_10);
		rButtonIVA_10.setBounds(214, 72, 109, 23);
		contentPane.add(rButtonIVA_10);
		
		rButtonIVA_4 = new JRadioButton("4%");
		rButtonIVA_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				actualizar();
			}
		});
		GrupoBotonesIVA.add(rButtonIVA_4);
		rButtonIVA_4.setBounds(325, 72, 109, 23);
		contentPane.add(rButtonIVA_4);
		
		//------- BOTONES CALCULAR - NORMAL  ---------	
		JButton ButtonCalcular = new JButton("Calcular");
		ButtonCalcular.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				actualizar();
			}
		});
		ButtonCalcular.setBounds(177, 165, 89, 23);
		contentPane.add(ButtonCalcular);
			
	}
	//----- FUNCIONES ------
	public void actualizar() 
	{
		//BUSCAMOS LA CANTIDAD
		double cantidad = Double.parseDouble(textoCantidad.getText());
		
		//BUSCAMOS EL IVA
		double IVA = 0;
		
		if(rButtonIVA_21.isSelected()) 
		{
			IVA = 0.21;
		}
		if(rButtonIVA_10.isSelected()) 
		{
			IVA = 0.10;
		}
		if(rButtonIVA_4.isSelected()) 
		{
			IVA = 0.04;
		}
		//DecimalFormat formato = new DecimalFormat("#,##0.00€")
		
		//PONEMOS EL TEXTO DEL IVA
		textoIVA.setText(String.valueOf(IVA + "%"));
		
		//CALCULAMOS
		double calculo = cantidad * IVA;
		
		//PONEMOS EL CALCULO EN EL TOTAL
		textoTotal.setText(String.valueOf(calculo + "€"));
				
	}
}
