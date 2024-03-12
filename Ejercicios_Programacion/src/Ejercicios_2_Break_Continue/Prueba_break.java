package Ejercicios_2_Break_Continue;

import java.util.Scanner;

public class Prueba_break {

	public static void main(String[] args) 
	{

		//	Break es una estructura de control utilizada para acabar el bucle en cuestion aunq tenga q continuar

		//----- VARIABLES ------
		int num;
		System.out.println("Deme numeros hasta q ponga 0");
		Scanner Teclado = new Scanner(System.in);

		do 
		{
			num = Teclado.nextInt();

			if(num == 5) 
			{
				System.out.println("Este numero no se puede :P");
				break;	
			}
		}
		while (num !=0); 

		System.out.println("-- Terminó el programa --");

		Teclado.close();
	}

}
