package Ejercicios_Casa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) 
	{
////		Programa que lea numeros enteros hasta que  se teclee un -l. 
////		Los números van a ir quedando almacenados en un array. Como no sabemos los números que van a
////		teclear, el array va a ir vcambiando de tamaño para adaptar el numero de datos leidos.
//
//		int valor = 1;
//		int[]arrayRellenable =  new int[valor];
//		
//		System.out.println("Deme valores para rellenar el array si das un -1 termina de rellenar");
//		
//		Scanner teclado =  new Scanner(System.in);
//		
//		int dato = 0;
//		
//		while (dato != -1) 
//		{
//			dato = teclado.nextInt();
//			valor++;
//			
//			for (int i = 0; i < arrayRellenable.length; i++) 
//			{
//				arrayRellenable[i] = dato;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arrayRellenable));
		
		/*
		 * Programa que lea números enteros hasta que se escriba el -1. Los números deben
			ir quedando almacenados en un array. Como no sabemos los números que van a
			teclear el array debe ir cambiando de tamaño para irse adaptando al numero de
			datos leídos.
		 */
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int numero;
		System.out.print("Teclea un numero:");
		numero = teclado.nextInt();
		while( numero != -1)
		{
			lista.add(numero);
			System.out.print("Teclea un numero:");
			numero = teclado.nextInt();
		}
		
		System.out.println("Lista de numeros tecleados: " + lista);
	}
	
}


