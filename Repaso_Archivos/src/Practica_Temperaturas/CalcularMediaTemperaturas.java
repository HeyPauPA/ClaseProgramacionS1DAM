package Practica_Temperaturas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CalcularMediaTemperaturas {

	public static void main(String[] args) 
	{
		// Programa que calcula la media de temperatura del archivo antes dado
		
		//Buscamos archivo a usar
		File archivo = new File(".\\src\\Practica_Temperaturas\\temperaturas.dat");
				
		//inicializamos el stream a usar
		DataInputStream  stream = null;
		
		double suma =0;
		double media=0;
		double numeroArchivos = 0;
		
		try 
		{ 
			//Creamos el tipo de stream a usar
			stream = new DataInputStream (new FileInputStream(archivo));
			
			//mientras hayan datos
			while (true) 
			{
				suma= suma + stream.readDouble();
				numeroArchivos++;
			}
			
		} 
		// -- CAZA DE ERRORES ---
		catch (IOException e) //CUANDO SE TERMINA EL ARCHIVO
		{
			System.out.println("no");
			//no pongo nada para q no se vea ningun mensaje
		}
		
		finally 
		{  //Si el stream falla
			try 
			{
				if(stream != null) 
				{ 
					media = suma/numeroArchivos;
					System.out.println("La media es: " + media);
					
					//cerrarlo	
					stream.close();
				}
				
			} 
			catch (IOException e) 
			{ //Si no dar error
				System.out.println("Error cerrando el archivo");
			}
		}
	
	}

}
