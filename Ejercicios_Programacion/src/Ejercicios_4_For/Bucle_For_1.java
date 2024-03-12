package Ejercicios_4_For;

import java.util.Scanner;

public class Bucle_For_1 {

	public static void main(String[] args) 
	{
		//Programa que de 5 numeros por teclado y nos de la suma

		
		//----- VARIABLES ------
		int numero;
		int suma = 0;// a la variable suma se le llama "acumulador"

		System.out.println("Deme 5 numeros y le dare la suma");

		Scanner Teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Deme un numero");
			numero = Teclado.nextInt();
			
			suma = suma + numero; 
			
		}
		Teclado.close();
		System.out.println("El resultado de la suma es: " +  suma);
	}

}
