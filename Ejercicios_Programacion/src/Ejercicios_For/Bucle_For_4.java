package Ejercicios_For;

import java.util.Scanner;

public class Bucle_For_4 {

	public static void main(String[] args) {

		//bucle q haga la tabla q eliga el usuario
		//----- VARIABLES ------

		System.out.println("Te dare las tablas del 1-10");

		Scanner Teclado = new Scanner(System.in);

		for (int j = 0; j < 11; j++) 
		{
			System.out.println("Tabla del: " + j);

			for (int i = 0; i < 11; i++) 
			{
				System.out.println( j + " X " + i + " = " + (i*j) );					
			}

		}
		Teclado.close();
	}

}
