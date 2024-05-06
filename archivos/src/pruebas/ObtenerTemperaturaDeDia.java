package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ObtenerTemperaturaDeDia {

	public static void main(String[] args) 
	{
		// Pedimos por teclado el dia que quiere consultar
		// y recuperamos esa temperatura concreta
		
		//pedir por teclado el dia
		double dia;
		System.out.println("Deme un dia y le dare su temperatura");

		Scanner Teclado = new Scanner(System.in);
		
		dia = Teclado.nextDouble();
		// ----------------------
		
		double contador = 0;
		
		File archivo = new File("temperaturas.dat");

		//el stream lo inicializamos al inicio
		DataInputStream stream = null;
		try 
		{
			//2 streams en 1 paso
			stream = new DataInputStream(new FileInputStream(archivo));
		
			for (int i = 0; i < dia; i++) 
			{
				stream.readDouble();	
			}
			System.out.println("Dia " + dia + stream.readDouble());
		} 
		//Esta excepcion salta ciuando termina el archivo, muchas veces no habra q hacer nada
		catch (EOFException e) 
		{
			System.out.println("No encontre nada");
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("archivo no encontrado");
		}
		catch (IOException e) 
		{
			System.out.println("Error leyendo temperaturas");
		}
		finally 
		{
			try 
			{	
				stream.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Error cerrando string");
			}
		}

	}

}
