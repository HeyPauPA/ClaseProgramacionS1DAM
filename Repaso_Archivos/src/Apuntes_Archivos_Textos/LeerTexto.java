package Apuntes_Archivos_Textos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerTexto {

	public static void main(String[] args) 
	{
		//----- LECTURA DE ARCHIVOS -----
		//Leemos el texto del archivo .txt antes creado
		
		//creamos el objeto Archivo con su ruta ""		
		File archivo = new File("Apuntes_texto.txt");
		
		//Inicializamos el stream antes de usarlo
		BufferedReader stream = null;
		
		try 
		{ 
			//Creamos el tipo de stream a usar
			stream = new BufferedReader (new FileReader(archivo));
			
			String linea; //creamos una linea para guardar los datos del archivo
			
			//mientras la linea del archivo no sea null *crea la linea y la lee todo en 1*
			//(aqui usamos el !null y no true para q no cree un bucle infinito)
			while ((linea = stream.readLine()) != null) 
			{
				//escribimos la linea por pantalla
				System.out.println(linea); 
			}
			
		} 
		// -- CAZA DE ERRORES ---
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
		

	}

}
