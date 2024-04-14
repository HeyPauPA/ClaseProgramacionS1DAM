package agendaGrafica;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipalAgenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	//UNIMOS LA CLASE AGENDA
	private Agenda agenda;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					VentanaPrincipalAgenda frame = new VentanaPrincipalAgenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. CONSTRUCTOR
	 */
	public VentanaPrincipalAgenda() {
		
		//cargar la agenda
		cargarAgenda();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir Contacto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				anadirContacto();
			}

		});
		btnNewButton.setBounds(78, 195, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminarContacto = new JButton("Eliminar Contacto");
		btnEliminarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				eliminarContacto();
			}
		});
		btnEliminarContacto.setBounds(223, 195, 148, 23);
		contentPane.add(btnEliminarContacto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 21, 293, 163);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel
		(
			new Object[][] //DATOS
			{ 
				{null, null},
				{null, null},
			},
			new String[] //HEADER
			{ 
				"Nombre", "Telefono"
			}
		) {
			//CARACTERISTICAS
			Class[] columnTypes = new Class[] {
				String.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(93);
		table.getColumnModel().getColumn(1).setPreferredWidth(196);
		scrollPane.setViewportView(table);
		
		//antes de acabar el construnctor cargo la tabla
		cargarTabla();
	}

	private void cargarAgenda() //como la clase prueba
	{
		//Aquí es donde conectaré con una BBDD o conectaré con un archivo
		//donde estará guardada la agenda
		
		//como no tenemos ni idea, vamos a crear una agenda en blanco y le añadimos
		//algún contacto para que parezca que funciona
		this.agenda = new Agenda();
		this.agenda.add(new Contacto("Laura" ,14816513));
		this.agenda.add(new Contacto("Pepe" , 84248887));
		this.agenda.add(new Contacto("Manolo",87433953));
		this.agenda.add(new Contacto("Maria" ,41283935));
		
	}
	private void cargarTabla() 
	{
		// Este método sirve para cargar todos los contactos de la agenda en la tabla
		//Primer paso: Tengo que crear un array para preparar los datos
		Object[][] datos = new Object[this.agenda.lenght()][2];
		
		//obtener la lista de contactos
		ArrayList<Contacto> lista = this.agenda.getListaContactos();
		
		//relleno el array con los datos
		for (int i = 0; i < datos.length; i++) 
		{
		datos[i][0]= lista.get(i).getNombre(); //EL PRIMER DATO CON NOMBRES
		datos[i][1]= lista.get(i).getTelefono(); //EL SEGUNDO CON TELEFONOS
		}
		
		//COPIAMOS EL CONSTRUCTOR DE LA TABLA
		table.setModel(new DefaultTableModel
			(
				datos,    				   //DATOS
				
				new String[] 
				{
					"Nombre", "Telefono"  //HEADERS
				}
			) {
			//CARACTERISTICAS
				Class[] columnTypes = new Class[] {
					String.class, Long.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(93);
			table.getColumnModel().getColumn(1).setPreferredWidth(196);
		
	}
	private void anadirContacto() 
	{
		//en la ventana principal
		//1. creamos el objeto de la ventana para llamarlo
		DialogoNuevoContacto nuevoContanco = new DialogoNuevoContacto(this,true);
		
		//recargo la tabla porq hubo cambios
		cargarTabla();
		
	}
	private void eliminarContacto() 
	{
		//obtener la fila seleccionada por el usuario en la tabla 
		int filaSeleccionada = table.getSelectedRow();
		
		if (filaSeleccionada == -1) 
		{
			JOptionPane.showInternalMessageDialog(this, "No hay fila seleccionada", "Error", JOptionPane.ERROR_MESSAGE );
		}
		else 
		{
			//pregunto por si acaso no estas seguro
			//												  esto ,  nombre mensaje,                       nombre ventana,tipo mensaje
			int opcionElegida = JOptionPane.showConfirmDialog(this,"Realmente quieres borrar ese contacto", "Confirmacion",JOptionPane.YES_NO_OPTION);
			
			if (opcionElegida == JOptionPane.YES_OPTION) 
			{
				
				this.agenda.delete(agenda.get(filaSeleccionada) ); //pilla el contacto en la fila seleccionada
			}
			
			//recargo la tabla porq hubo cambios
			cargarTabla();
									
		}
		
	}
}
