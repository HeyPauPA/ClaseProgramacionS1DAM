package Ejercicios_Break_Continue;

import java.util.Scanner;

public class Prueba_Continue {

	public static void main(String[] args) 
	{

		//	Cuando se ejecuta un continue, se deja de ejecutar el resto del bloque de
		//sentencias de la estructura iterativa para volver al inicio de ésta.

		//----- VARIABLES ------
		int num;
		int suma=0;
		System.out.println("Deme numeros hasta q ponga 0 y los vamos sumando, solo sumamos los positivos");
		Scanner Teclado = new Scanner(System.in);

		do 
		{
			num = Teclado.nextInt();
			if(num < 0) 
			{
				continue;// salta y vuelve al inicio		
			}
			suma = num +suma;	
		}
		while (num !=0); 

		System.out.println("-- Terminó el programa --");

		Teclado.close();
	}
}
