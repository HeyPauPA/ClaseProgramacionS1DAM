package Ejercicios_Casa;

import java.util.Arrays;

public class Ej_4 {

	public static void main(String[] args)
	{
//		Programa que ordene los índices de un array de enteros. A partir del array
//		original debe generar otro donde aparezcan ordenados los índices de mayor a
//		menor.

		int[]array = {34,54,12,85,45};
		int[]arrayResultado = Arrays.copyOf(array, 5);
		
		int numeroAnterior = 0;
	
		for (int i = 0; i < array.length; i++) 
		{
			if(numeroAnterior < array[i])
			{
				arrayResultado[i] = numeroAnterior;
				
			}
		}
	}

}
