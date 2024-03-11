package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_7 {

	public static void main(String[] args) 
	{
		int numDado;
		int num2;
		int contadorRepetidos = 0;
		int numeroMayor = 0;
		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme numeros y vere cual es el mas grande y las veces q se repite");

		System.out.println("Primer numero");
		numDado = Teclado.nextInt();

		do
		{
			num2 = numDado;

			System.out.println("Otro numero");
			numDado = Teclado.nextInt();
			
			if(numDado > num2) 
			{
				numeroMayor = numDado;
				contadorRepetidos = 1;
			}
			else if (numDado == num2) 
			{
				contadorRepetidos++;
			}
		}
		while (numDado != 0); 

		System.out.println("El numero mayor es el "+ numeroMayor +" y se repite " + contadorRepetidos +" veces");
		Teclado.close();

	}

}
