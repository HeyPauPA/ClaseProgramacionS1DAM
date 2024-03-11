package Ejercicios_Casa;

import java.util.Arrays;
import java.util.Iterator;

public class Ej_5_Array_n_q_no_aparecen {

	public static void main(String[] args) {
//		Dado un array de 50 números entre 1 y 100, Escribir una lista ordenada con los
//		valores que no aparecen en el array.

		//creamos un array de 100 datos aleatorios
		int[]arrayAleatorio = new int [100];
		int[]arrayNoAparece = new int[100] ;
		
		boolean NoAparece= false;
		
		for (int i = 0; i < arrayAleatorio.length; i++) 
		{
			arrayAleatorio[i] = (int) (Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arrayAleatorio));
		
		Arrays.sort(arrayAleatorio);
		
		System.out.println(Arrays.toString(arrayAleatorio));
		
		for (int valor = 0; valor < arrayAleatorio.length; valor++) 
		{
			if(arrayAleatorio[valor] != valor) 
			{
				arrayNoAparece[valor] = valor;
			}
		}
		
		System.out.println(Arrays.toString(arrayNoAparece));	
	}

}
