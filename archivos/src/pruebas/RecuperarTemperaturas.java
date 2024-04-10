package pruebas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecuperarTemperaturas {

	public static void main(String[] args) 
	{
		File archivo = new File("temperaturas.dat");

		//el stream lo inicializamos al inicio
		DataInputStream stream = null;
		try 
		{
			//2 streams en 1 paso
			stream = new DataInputStream(new FileInputStream(archivo));

		
			while (true) 
			{
				System.out.println(stream.readDouble());	
			}

			
		} 
		//Esta excepcion salta ciuando termina el archivo, muchas veces no habra q hacer nada
		catch (EOFException e) 
		{
			
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
