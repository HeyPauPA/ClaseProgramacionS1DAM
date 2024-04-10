package pruebas;

import java.io.File;
import java.text.DateFormat;

public class PruebaObjetoFile {

	public static void main(String[] args) 
	{
		//Probar como funciona la clase file
		File archivo = new File("C:\\Windows\\notepad.exe");
		
		//si el archivo existe
		if(archivo.exists())
		{
			System.out.println("El archivo es real, existe");
			
			//·me da la ruta del archivo
			System.out.println(archivo.getAbsolutePath());
			
			//·tamaño del archivo
			System.out.println("Su tamaño es " + archivo.length());
			
			//·fecha de modificacion del archivo												↓ funcion fecha pero la da en segundos desde el 1/01/1970
			System.out.println("Su fecha de modificacion es " + DateFormat.getInstance().format(archivo.lastModified()) );
		
			//·Ver si tiene permiso de lectura
			System.out.println("Permiso de lectura: " + archivo.canRead());

			//·Ver si tiene permiso de escritura
			System.out.println("Permiso de escritura: " + archivo.canWrite());
		}
		else
			System.out.println("El archivo no existe");
	}

}
