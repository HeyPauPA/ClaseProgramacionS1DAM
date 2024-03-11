package Ejercicios_Casa;

import java.util.Scanner;

public class Ej_1_nºDeVecesEnArray {

	public static void main(String[] args) 
	{
//		En un array de 20 elementos hay almacenados números enteros. Haz un
//		programa que pida un número y diga cuantas veces aparece el número dentro del
//		array.

		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,20};
		int numeroDado = 0;
		int contador = 0;
		
		System.out.println("Deme un numero y vere si esta y cuantas veces");
		
		Scanner teclado = new Scanner(System.in);
		numeroDado = teclado.nextInt();
		
//		for (int i = 0; i < array.length; i++) 
//		{
//			if(array[i] == numeroDado) 
//			{
//				contador++;
//			}
//		}
		
		//bucle foreach
		//       ↓ variable para guardar un dato del array (como en el for la i) por cada vuelta
		for (int i : array) 
		{
			if(i == numeroDado) {
				contador++;
			}
		}
		
		System.out.println("El numero de veces q aparece el numero " + numeroDado + " es: " + contador);
		
		teclado.close();
		
	}

}
