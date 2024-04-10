package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarNumeroEnArchivo {

	public static void main(String[] args) 
	{
		//Guardamos un numero entero en un archivo
		int valor = 123456;

		//Tengo q crear el objeto file
		File archivo = new File("numero.dat");
		
		try 
		{
			//necesito llevar un numero a un archivo
			//necesitamos un stream 
			FileOutputStream stream = new FileOutputStream(archivo); //le marco el objeto con el q me voy a comunicar
			
			//↑
			
			//mejorar el stream para que me permita enviar los datos mas comodo
			DataOutputStream streamMejorado = new DataOutputStream(stream);//→ mejora el stream anterior(necesita haber uno normal previo)
			
			//enviar el dato al archivo
			streamMejorado.writeInt(valor);
			
			//hay q cerrar el stream (cerrando el ultimo, se cierran todos)
			streamMejorado.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("El archivo no existe");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
