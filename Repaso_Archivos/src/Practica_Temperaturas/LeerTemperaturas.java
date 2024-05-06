package Practica_Temperaturas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LeerTemperaturas {

	public static void main(String[] args) 
	{
		//Imprimimos las temperaturas del mes
		
		//----- LECTURA DE ARCHIVOS -----
		//Leemos el texto del archivo .txt antes creado
		
		File archivo = new File(".\\src\\Practica_Temperaturas\\temperaturas.dat");

		//Inicializamos el stream antes de usarlo
		DataInputStream stream = null;

		try 
		{ 
			//Inicializamos el tipo de stream a usar antes de usarlo → este es para leer datos
			stream = new DataInputStream (new FileInputStream(archivo));
			

			String linea; //creamos una linea para guardar los datos del archivo

			
			while (true) 
			{
				//escribimos la linea por pantalla
				System.out.println(stream.readDouble()); 
			}

		} 
		// -- CAZA DE ERRORES ---
		catch (IOException e) //CUANDO SE TERMINA EL ARCHIVO
		{
			//Si hay error leyendo el archivo
			//System.out.println("Error leyendo en el archivo");
			//Mejor no poner nada asi no "da" el error
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


	}

}
