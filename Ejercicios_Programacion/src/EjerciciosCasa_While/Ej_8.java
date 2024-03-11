package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_8 {

	public static void main(String[] args) 
	{
//		Programa que descomponga un número en sus factores primos.
//		Introduciendo: 75
//		Da como salida: 3 5 5
		
		int numDado;
		int factor=2;

		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme un numeroy lo descompondre en factores primos");

		System.out.println("Primer numero");
		numDado = Teclado.nextInt();

		while (numDado != 1) 
		{
			if((numDado%factor) == 0) 
			{
				System.out.println(factor);
				numDado = numDado/factor;
			}
			else
				factor++;
		}

		Teclado.close();
		
	}

}
