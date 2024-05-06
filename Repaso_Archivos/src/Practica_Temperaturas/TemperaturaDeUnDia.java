package Practica_Temperaturas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TemperaturaDeUnDia {

	public static void main(String[] args) 
	{
		// Pedimos por teclado el dia que quiere consultar
		// y recuperamos esa temperatura concreta
		
		System.out.println("De q dia quieres saber la temperatura");
		
		Scanner Teclado = new Scanner(System.in);

		int dia = Teclado.nextInt();
		
		
		//Buscamos archivo de temperaturas
		File archivo = new File(".\\src\\Practica_Temperaturas\\temperaturas.dat"); 
		
		//inicializamos el stream a usar
		DataInputStream  stream = null;

		try 
		{ 
			//Creamos el tipo de stream a usar 
			stream = new DataInputStream (new FileInputStream(archivo));

			for (int i = 0; i < dia; i++) 
			{
				stream.readDouble(); //lee cada linea hasta la q queremos
			}

			//Imprimimos solo la q necesitamos
			System.out.println(stream.readDouble());
			
//			double linea; //creamos una linea para guardar los datos del archivo
//			
//			for (int i = 0; i < dia; i++) 
//			{
//			    linea = stream.readDouble();
//			    if (i == dia - 1) 
//			    {
//			        System.out.println(linea);
//			    }
//			}

			
		} 
		// --- CAZA DE ERRORES ---
		catch (IOException e) //CUANDO SE TERMINA EL ARCHIVO
		{
			//Si hay error leyendo el archivo
			System.out.println("Error leyendo en el archivo");
		}

		finally 
		{  //Si el stream falla
			try 
			{
				if(stream != null) 
				{ //cerrarlo	
					stream.close();
				}

			} 
			catch (IOException e) 
			{ //Si no dar error
				System.out.println("Error cerrando el archivo");
			}
		}

		//dentro del try lo creamos
	}

}
