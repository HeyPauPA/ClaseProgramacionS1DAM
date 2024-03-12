package Ejercicios_5_While;

import java.util.Scanner;

public class MediaNumeros {

	public static void main(String[] args) 
	{

		// Pediremos numeros y los sumaremos hasta q tecleemos un 0
		//----- VARIABLES ------
		int nota;
		int suma = 0;
		int contadorVueltas = 0;

		System.out.println("Deme sus notas y le hare la media");
		Scanner Teclado = new Scanner(System.in);

		do
		{
			System.out.println("Deme otra nota");
			nota = Teclado.nextInt();
			suma += nota;

			contadorVueltas++;
		}
		while (nota !=0); 

		System.out.println("La media es" + suma/(contadorVueltas-1));

		Teclado.close();
	}

}
