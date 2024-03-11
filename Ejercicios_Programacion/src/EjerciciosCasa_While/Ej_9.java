package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_9 {

	public static void main(String[] args) 
	{

		//		Programa que lea un número entero positivo y lo transforme a su representación
		//		binaria.
		//		Introduciendo: 18
		//		Da como salida: 10010

		int numDado;
		String resultado = "";

		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme un numeroy lo descompondre en factores primos");

		System.out.println("Primer numero");
		numDado = Teclado.nextInt();

		while (numDado != 0) 
		{
			resultado = numDado%2 + resultado;
			numDado = numDado/2;	
		}

		System.out.println(resultado);
	}

}
