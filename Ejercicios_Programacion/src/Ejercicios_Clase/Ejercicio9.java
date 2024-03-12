package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) 
	{
	/*
	 * Pedir un número entre 0 y 9.999, decir si es capicúa.
	 */
		
		//----- VARIABLES ------
		int numero;
		int numeroPrimero = 0;
		int numeroSegundo = 0;
		int numeroTercero = 0;
		int numeroCuarto = 0;

		System.out.println("Deme un numero y le dire cuantas cifras tiene ");

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Deme el numero");
		numero = Teclado.nextInt();

		if(numero < 10000) 
		{	
			numeroPrimero = numero % 10;
			numero = numero / 10;
			
			numeroSegundo = numero % 10;
			numero = numero / 10;
			
			numeroTercero = numero % 10;
			numero = numero / 10;
			
			numeroCuarto = numero % 10;
			numero = numero / 10;
			
			if(numeroPrimero == numeroCuarto && numeroSegundo == numeroTercero)
				{
				System.out.println("El numero es capicua");
				}
				
		}
		
		if(numero < 1000) 
		{	
			numeroPrimero = numero % 10;
			numero = numero / 10;
			
			numeroSegundo = numero % 10;
			numero = numero / 10;
			
			numeroTercero = numero % 10;
			numero = numero / 10;
			
			
			if(numeroPrimero == numeroTercero ) 
			{
				System.out.println("El numero es capicua");				
			}
		}
		
		if(numero < 100) 
		{	
			numeroPrimero = numero % 10;
			numero = numero / 10;
			
			numeroSegundo = numero % 10;
			numero = numero / 10;			
			
			if(numeroPrimero == numeroSegundo )
				System.out.println("El numero es capicua");
		}
		
		else
			System.out.println("El numero no es capicua");
		Teclado.close();
	}

}
