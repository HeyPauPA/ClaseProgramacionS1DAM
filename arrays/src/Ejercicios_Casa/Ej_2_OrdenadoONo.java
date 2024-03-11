package Ejercicios_Casa;

import java.util.Arrays;
import java.util.Iterator;

public class Ej_2_OrdenadoONo {

	public static void main(String[] args) 
	{
//		Dado un array de números enteros, realiza un programa que diga si está
//		ordenado o no,

		int ianterior = 0;
		int dato = 0;
		boolean esOrdenado = true;
		
		int array[] = {1,2,5,6,13,14,15,18,20,20};
		
//		for (int i = 0; i < array.length; i++) 
//		{
//			if(array[i] > ianterior) 
//			{
//				esOrdenado = false;
//			}
//			ianterior = array[i];
//		}
		
		int []arraycopia = Arrays.copyOf(array, array.length);
		Arrays.sort(arraycopia);
		
		if(arraycopia.equals(array)) {
			esOrdenado = true;
		}
		else
			esOrdenado = false;
		
		if (esOrdenado == true) {
			System.out.println("Es ordenado");
		}
		else
			System.out.println("No esta ordenado");
	}

}
