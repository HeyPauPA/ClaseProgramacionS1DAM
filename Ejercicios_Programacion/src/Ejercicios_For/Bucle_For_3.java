package Ejercicios_For;

import java.util.Scanner;

public class Bucle_For_3 {

	public static void main(String[] args) {

		//bucle q haga la tabla q eliga el usuario
		//----- VARIABLES ------
		int numTabla;
		System.out.println("Deme un numero y te dare su tabla");

		Scanner Teclado = new Scanner(System.in);

		numTabla = Teclado.nextInt();

		System.out.println("Tabla del" + numTabla);

		for (int i = 0; i < 11; i++) 
		{
			System.out.println( numTabla + " X " + i + " = " + (i*numTabla) );					
		}
		Teclado.close();
	}

}
