package Ejercicios_5_While;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) 
	{
		//comprobar si un  numero es primo
		//----- VARIABLES ------
		int num;
		int contador0s = 0;
		int contadorVueltas = 1;

		System.out.println("Dame un numero y te dire si es primo");
		Scanner Teclado = new Scanner(System.in);
		
		num = Teclado.nextInt();
				
		while (contador0s < 2) 
		{
			if((num % contadorVueltas) == 0) 
			{
				contador0s++;
			}
			
			contadorVueltas++;
		}
		
		System.out.println("El numero es primo");
	}

}
