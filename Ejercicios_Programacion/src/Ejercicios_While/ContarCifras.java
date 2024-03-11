package Ejercicios_While;

import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) 
	{
		//	pedimos un numero entero y calculamos cuantas cifras tiene
		//		
		//	repetir la division de 10
		//----- VARIABLES ------
		int numeroDado;
		int contador = 0;

		System.out.println("Deme un numero y le dire cuantas cifras tiene");
		Scanner Teclado = new Scanner(System.in);
		numeroDado = Teclado.nextInt();

		while (numeroDado != 0 )
		{	
			numeroDado = (numeroDado/10);
			
			contador++;
		}
				
		System.out.println("El numero de cifras de ese numero es " + contador);

		Teclado.close();

	}

}
