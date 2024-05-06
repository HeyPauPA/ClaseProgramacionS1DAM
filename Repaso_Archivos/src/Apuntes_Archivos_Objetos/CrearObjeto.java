package Apuntes_Archivos_Objetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearObjeto {

	public static void main(String[] args) 
	{
		//CREAR UN OBJETO
		
		//Primero necesitamos la clase de ese objeto
		Clase_Contacto c = new Clase_Contacto("Pedro", 991548761);
		
		//Necesitamos el objeto File 
		File archivo =  new File("ObjetoContacto.obj");
		
		//Creamos el stream q vamos a usar y lo inicalizamos a null para usarlo + adelante
		ObjectOutputStream stream = null;
		
		try 
		{
			stream = new ObjectOutputStream(new FileOutputStream(archivo));
			
			stream.writeObject(c);
		}
			
		// -- CAZA DE ERRORES ---
		catch (FileNotFoundException e) 
		{
			System.out.println("Archivo no encontrado");
		} 
		catch (IOException e) 
		{
			System.out.println("Error de escritura");
		} 
		finally 
		{
			try 
			{
				if(stream != null) 
				{
					stream.close();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Error cerrando el stream");
			}
		}
	}

}
