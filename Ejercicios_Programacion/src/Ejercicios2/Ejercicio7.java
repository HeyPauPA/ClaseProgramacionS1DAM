package Ejercicios2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
		*/
		//----- VARIABLES ------
				int numero;
				int contadorVueltas = 0;

				System.out.println("Deme un numero y le dire cuantas cifras tiene ");

				Scanner Teclado = new Scanner(System.in);

				System.out.println("Deme el numero");
				numero = Teclado.nextInt();

				while (numero != 0) 
				{
					numero = numero / 10;
					contadorVueltas++;
				}
				
				System.out.println("El numero de cifras de ese numero es: " + contadorVueltas);
				Teclado.close();
	}

}
