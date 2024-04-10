package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TemperaturaMedia {

	public static void main(String[] args) {

		// Programa que calcula la media de temperatura del archivo
		
			File archivo = new File("temperaturas.dat");
			
			//variables
			double dato=0;
			double suma =0;
			double media = 0;
			double contador=0;
			
			//el stream lo inicializamos al inicio
			DataInputStream stream = null;
			try 
			{
				//2 streams en 1 paso
				stream = new DataInputStream(new FileInputStream(archivo));

				while (true) 
				{
					dato = stream.readDouble();	
					
					suma = suma + dato;
					contador ++;
				}

			}
			//Esta excepcion salta ciuando termina el archivo, muchas veces no habra q hacer nada
			catch (EOFException e) 
			{
				//cuando acaba el archivo hace la media
				media = suma/contador;
				System.out.println("la media de la temperaturas es: " + media);
				
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
