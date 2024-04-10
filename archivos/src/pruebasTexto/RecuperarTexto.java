package pruebasTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RecuperarTexto {

	public static void main(String[] args) 
	{
		//Guardamos varias lineas de texto
		
		//objeto File
		File archivo = new File("texto.txt");
		
		
		/*FileWriter usamos una + elaborada*/ BufferedReader stream = null;
		
		try 
		{
			//Creamos el stream
			stream = new BufferedReader(new FileReader(archivo));//un filewriter dobre el archivo
			//la ventaja de este es la rapidez, no que tenga mas metodos
			
			//forma unida
			String linea;
			while ((linea = stream.readLine()) != null) //crea la linea y la lee todo en 1
			{
				System.out.println(linea);
			}
			
//			String linea = stream.readLine(); // pido una primera linea
//			
			//en el reader no sirve el while true se genera un bucle infinito
//			while (linea != null) //mientras no sea null  
//			{	
//				stream.readLine(); //la imprimo
//				linea = stream.readLine(); // sigo pidiendo lineas
//			} 
			

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
