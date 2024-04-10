package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class GuardarVariasTemperaturas {

	public static void main(String[] args) {
		
		// Guardamos en un archivo 30 temperaturas
		
		File archivo = new File("temperaturas.dat");
		
		try 
		{
			//2 streams en 1 paso
			DataOutputStream stream = new DataOutputStream(new FileOutputStream(archivo));
		
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
