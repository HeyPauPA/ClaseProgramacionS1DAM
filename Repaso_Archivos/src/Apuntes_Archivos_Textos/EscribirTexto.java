package Apuntes_Archivos_Textos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTexto 
{
	public static void main(String[] args) 
	{
		//----- ESCRITURA DE ARCHIVOS -----
		//Guardar/Escribir texto en un archivo .txt
		
		//creamos el objeto Archivo con su ruta ""		
		File archivo = new File("Apuntes_texto.txt");
		
		//Inicializamos el tipo de stream a usar antes de usarlo
		BufferedWriter stream = null;
		
		try 
		{ 
			//Creamos el stream (para escribir)
			stream = new BufferedWriter (new FileWriter(archivo));
			
			stream.write("Hola");
			stream.newLine();
			stream.write("Buenos Dias");
			
			
		} 
		// --- CAZA DE ERRORES --- 
		catch (IOException e) 
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
		

	}
}
