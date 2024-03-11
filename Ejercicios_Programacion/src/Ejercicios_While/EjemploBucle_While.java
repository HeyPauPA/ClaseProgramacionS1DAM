package Ejercicios_While;

import java.util.Scanner;

public class EjemploBucle_While {

	public static void main(String[] args) 
	{
		//	---- Bucle mientras -----
		//
		//		while(condicion) 
		//		{	
		//			intruccion/ones a repetir
		//		}
		//
		//	---- Bucle Hacer mientras ----
		//
		//		do 
		//		{
		//			intruccion/ones a repetir;
		//		}
		//
		//		while(condicion)

		//----- VARIABLES ------
		//		int num;
		//		System.out.println("Deme numeros hasta q ponga 0");
		//
		//		Scanner Teclado = new Scanner(System.in);
		//
		//		num = Teclado.nextInt();
		//
		//		while (num !=0) 
		//		{
		//			System.out.println("Deme otro numero");
		//
		//			num = Teclado.nextInt();
		//		}
		//		
		//		System.out.println("-- Terminó el programa --");
		//		
		//		Teclado.close();

		//USANDO UN DO WHILE

		//----- VARIABLES ------
		int num;
		System.out.println("Deme numeros hasta q ponga 0");
		Scanner Teclado = new Scanner(System.in);

		do 
		{
			num = Teclado.nextInt();
		}
		while (num !=0); 

		System.out.println("-- Terminó el programa --");

		Teclado.close();

	}

}
