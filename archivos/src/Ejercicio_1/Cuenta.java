package Ejercicio_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Cuenta {

	public static void main(String[] args)
	{
//		Crear una clase Cuenta con un método llamado “cuentaPalabras()” que cuente las
//		palabras existentes en un archivo de texto pasado como parámetro.
//		El método recibirá como parámetro un objeto File y retornará la cantidad de palabras que
//		componen el texto.
		
//		El proceso será ir leyendo líneas del archivo y contar cuantas palabras hay en cada una.
//		Recordad que esto lo hicimos con un StringTokenizer.
		
		
		//creamos el objeto file
		
		File archivo = new File(".\\src\\Ejercicio_1\\quijote.txt"); //le pasamos el nombre pillara el archivo
	
		System.out.println(cuentaPalabras(archivo) + " palabras");
	}

	public static int cuentaPalabras(File archivo) 
	{
	/*FileWriter usamos una + elaborada*/ BufferedReader stream = null;
			int contadorPalabras=0;
			try 
			{
				//Creamos el stream
				stream = new BufferedReader(new FileReader(archivo));//un filewriter dobre el archivo
				
				
				String linea;
				while ((linea = stream.readLine()) != null) //crea la linea y la lee todo en 1
				{
					StringTokenizer st = new StringTokenizer(linea);
					contadorPalabras += st.countTokens();
				}

			} 
			catch (IOException e) 
			{
				System.out.println("Error escribiendo el archivo");
			} 
			try 
			{
				if(stream != null) 
				{
					stream.close();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Error cerrando el archivo");
			}
			return contadorPalabras;
	}
}
