package Ejercicio_2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ejercicio {
//	En el vivero “La Plant
//	a feliz”, disponen de un archivo donde está guardada toda la
//	información de las plantas que tienen a la venta. Este fichero se llama “Plantas.venta”, y
//	contiene objetos de la clase Planta.
	
//	Ante la inminente llegada del verano, el vivero ha decidido hacer una campaña de
//	rebajas, haciendo descuentos del 20, 30 y hasta el 40%.
//	Realiza un programa que se encargue hacer la modificación de cada uno de los
//	objetos planta aplicando los descuentos en el precio de cada planta, sabiendo que los
//	descuentos se aplican así:
//	- 20% para las plantas con una cantidad inferior a 10
//	- 30% para las plantas con una cantidad entre 10 y 50
//	- 40% para las plantas cuya cantidad supere los 50
//
//	La clase Planta contiene los siguientes atributos:
//	private int codigo;
//	private String nombreVulgar;
//	private String nombreCientifico;
//	private double precio;
//	private int cantidad;
//	En la carpeta encontrarás la clase Planta y un pequeño programa para generar de
//	forma automática el archivo “Plantas.venta”.

	private static File archivo = new File (".\\src\\Ejercicio_2\\Plantas.venta");
	
	public static void main(String[] args) 
	{
		// obtener los objetos plantas
		ArrayList<Planta> listaPlantas = getPlantas();
		System.out.println(listaPlantas);
		
		// actualizar el precio de las plantas
		actualizarPrecio(listaPlantas);
		System.out.println(listaPlantas);
		
//		//guardar las plantas en el archivo
//		setPlantas(listaPlantas);
	}

	private static ArrayList<Planta> getPlantas() 
	{
		ObjectInputStream stream = null;
		ArrayList<Planta> listaPlantas = new ArrayList<Planta>();

		try 
		{
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) 
			{
			//recuperar el objeto
			Planta p = (Planta) stream.readObject();
			listaPlantas.add(p);
			}

		} 
		catch (EOFException e) 
		{
			//Cuando salte este error es porq el archivo se ha acabado
			System.out.println("Archivo terminado");
			return listaPlantas;
			
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Archivo no encontrado");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Error de escritura");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("Error: el archivo no contiene objetos");
		} 
		finally 
		{
			try 
			{
				if (stream != null) 
				{
					stream.close();					
				}
			} catch (IOException e) 
			{
				System.out.println("Error cerrando el stream");
			}
		}
		return null;
	}
	
	private static void actualizarPrecio(ArrayList<Planta> listaPlantas) 
	{
		for (Planta planta : listaPlantas) 
		{
			if (planta.getCantidad() < 10) 
			{
				planta.setPrecio((planta.getPrecio() * (0.8)));;
			}
			else if (planta.getCantidad() <= 50) 
			{
				planta.setPrecio((planta.getPrecio() * (0.7)));;
			}
			else 
			{
				planta.setPrecio((planta.getPrecio() * (0.6)));;
			}
		}
	}

	private static void setPlantas(ArrayList<Planta> listaPlantas) 
	{

	}
}
