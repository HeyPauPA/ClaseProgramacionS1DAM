package Ejercicios_Basicos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej_2 {

	public static void main(String[] args) 
	
	{
		//pido por teclado, el nombre y los apellidos
//		
//		Nombre
//		Apellido
//		Apellido2
//		
//		Si solo ha escrito una palabra o 2 palabras, dara error

		System.out.println("Deme su nombre y apellidos");
		String nombreApellidos = "";

		Scanner teclado = new Scanner(System.in);
		
		nombreApellidos = teclado.nextLine();
		
		StringTokenizer st = new StringTokenizer(nombreApellidos);
		
		if(st.countTokens()< 3) 
		{
			System.out.println("No pusiste nombre y 2 apellidos");
		}
		
		System.out.println("Correcto Tu nombre es: " + nombreApellidos);
	}

}
