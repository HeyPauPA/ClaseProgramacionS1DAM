package Practica_Temperaturas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class GuardarVariasTemperaturas {

	public static void main(String[] args) 
	{
		
		// Guardamos en un archivo 30 temperaturas
		//creamos el archivo
		File archivo = new File("temperaturas.dat");
		
		DataOutputStream stream = null;
		try 
		{
			//2 streams en 1 paso
			stream = new DataOutputStream(new FileOutputStream(archivo));
		
			//escribimos 30 temperaturas diferentes aleatorias
			for (int i = 1; i <= 30; i++) 
			{
				stream.writeDouble(Math.random()*20+10);
			}
		
			stream.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("archivo no encontrado");
		}
		 catch (IOException e) 
		{
			System.out.println("Error al guardar");
		}
	}

}
