package pruebasTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTexto {

	public static void main(String[] args) 
	{
		//Guardamos varias lineas de texto
		
		//objeto File
		File archivo = new File("texto.txt");
		
		
		/*FileWriter usamos una + elaborada*/ BufferedWriter stream = null;
		
		try 
		{
			//Creamos el stream
			stream = new BufferedWriter(new FileWriter(archivo));//un filewriter dobre el archivo
			//la ventaja de este es la rapidez, no que tenga mas metodos
			stream.write("Hola\n");
			stream.write("Buenos Dias\n");
			stream.write("Adios");
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
		catch (IOException e) {
			System.out.println("Error cerrando el archivo");
		}

	}

}
