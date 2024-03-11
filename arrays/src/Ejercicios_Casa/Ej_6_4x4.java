package Ejercicios_Casa;

import java.util.Arrays;
import java.util.Iterator;

public class Ej_6_4x4 {

	public static void main(String[] args) {
		// Programa que rellene un array de 4x4 de la siguiente manera:
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		int[][]array= new int[4][4];
		
//		for (int i = 0; i < array.length; i++) 
//		{
//			for (int j = 0; j < array[i].length; j++) 
//			{
//				if (i == j) 
//				{
//					array[i][j]= 1;
//				}
//			}
//		}
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i][i] = 1;//en filas y columnas con mismo numero
		}
		
		for (int[] is : array) 
		{
			System.out.println(Arrays.toString(is));
		}

	}

}
