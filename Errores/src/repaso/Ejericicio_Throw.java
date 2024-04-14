package repaso;

import java.io.IOException;

public class Ejericicio_Throw {

	public static void main(String[] args) 
	{
		
		try //→ tocara hacer un try catch mas adelante para solucionar el exception, solo lo lanzas hacia atras
		{
			prueba();
		} 
		catch (Exception e) 
		{
			System.out.println("Prueba1");
		}
		
		try //aqui igual
		{
			prueba2();
		} 
		catch (Exception e) 
		{
			System.out.println("Prueba2");
		}
	}
	
	//EN 2 PASOS
	private static void prueba() throws Exception // ← Añade el throws Exception(pueden salir mas de 1) 
												  //y puedes poner el padre q sirve igual
	{
		IOException error = new IOException(); //exception normal → clase exception
		throw error; 														   //luego lo lanzamos y sale un error 
																			   //q nos crea en la funcion el exception
	}

	//EN 2 PASOS
	private static void prueba2() throws Exception 
	{
		throw new Exception();
	  //Throw + (todo despues del igual) → A.K.: new + Exception  
	}
}
