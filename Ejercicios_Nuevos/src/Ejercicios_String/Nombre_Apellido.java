package Ejercicios_String;

import java.util.Scanner;

public class Nombre_Apellido {

	public static void main(String[] args) 
	{
		//pido por teclado, el nombre y los apellidos
//		
//		Nombre
//		Apellido
//		Apellido2
//		
//		Si solo ha escrito una palabra o 2 palabras, dara error
		
		String nombreApellidos = "" ;
		
		Scanner teclado = new Scanner(System.in);
		
		nombreApellidos = teclado.nextLine();
		
		int nEspacioPrimero = nombreApellidos.indexOf(" ");
		int nEspacioSegundo = nombreApellidos.lastIndexOf(" ");
		int longitudPalabra = nombreApellidos.length();
		
		String nombre = "";
		String apellido1 = "";
		String apellido2 = "";
		
		
		if(nombreApellidos.isEmpty() == true || nombreApellidos.isBlank() == true) 
		{
		System.out.println("No se ha escrito ninguna palabra");	
		}
		else if( nEspacioPrimero == -1) 
		{
		System.out.println("No se ha escrito correctamente");	
		}
		else if( nEspacioPrimero == nEspacioSegundo) 
		{
		System.out.println("No se han escrito nombre y 2 apellidos");	
		}
		
		else 
		{	
			nombre = nombreApellidos.substring(0,nEspacioPrimero);
			apellido1 = nombreApellidos.substring((nEspacioPrimero+1),nEspacioSegundo);
			apellido2 = nombreApellidos.substring((nEspacioSegundo+1)/*hasta el infinito*/);
					
			System.out.println("Todo correcto el nombre es :"  + nombre + "el primer apellido es: " + apellido1 + "el segundo apellido es: " + apellido2 );
		}
		
		
	}

}
