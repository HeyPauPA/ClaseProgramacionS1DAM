package EjerciciosCasa_While;

import java.util.Iterator;
import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) 
	{
		//		Programa que solitite un numero n y luego muestre por pantalla la siguiente
		//		figura;

		System.out.println("deme 5 numeros y dire si son multiplos de 5 o 3");

		int numerDado;
		int suma = 0;

		Scanner Teclado = new Scanner(System.in);
		numerDado = Teclado.nextInt();

		for (int i = 1; i < numerDado; i++) 
		{		
			for (int j =1 ; j <= i; j++) 
			{
				System.out.print(j);

			}
			System.out.println("");
		}
		
		Teclado.close();
	}

}
