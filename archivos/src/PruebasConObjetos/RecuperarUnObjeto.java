package PruebasConObjetos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class RecuperarUnObjeto {

	public static void main(String[] args) 
	{

		File archivo = new File("contacto.obj");


		ObjectInputStream stream = null;

		try 
		{
			stream = new ObjectInputStream(new FileInputStream(archivo));

			//recuperar el objeto
			Contacto c = (Contacto) stream.readObject();

		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Archivo no encontrado");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Error de escritura");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("Error: el archivo no contiene objetos");
		} 
		finally 
		{
			try 
			{
				if (stream != null) 
				{
					stream.close();					
				}
			} catch (IOException e) 
			{
				System.out.println("Error cerrando el stream");
			}
		}

		
		

	}

}
