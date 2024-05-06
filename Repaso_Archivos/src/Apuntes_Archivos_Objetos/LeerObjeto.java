package Apuntes_Archivos_Objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjeto {

	public static void main(String[] args) 
	{
		//LEER UN CONTACTO
		
		//Buscamos el archivo
		File archivo = new File("src\\Apuntes_Archivos_Objetos\\ObjetoContacto.obj");
		
		//Creamos el stream a usar
		ObjectInputStream stream = null;
		
		try 
		{
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//recuperar objeto en uno creado para trabajar con el
			Clase_Contacto c = (Clase_Contacto) stream.readObject();
			
			//trabajamos con el objeto llamando sus funciones como de normal
			System.out.println("Hola soy " + c.getNombre() + " mi telefono es: " + c.getTelefono());
		}
		
		// -- CAZA DE ERRORES ---
		catch (FileNotFoundException e) //Si no se encuentra el objeto
		{
			System.out.println("Objeto no encontrado");
		} 
		catch (IOException e) 
		{
			System.out.println("Error de escritura");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error: El archivo no contiene objetos de la clase mencionada");
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
