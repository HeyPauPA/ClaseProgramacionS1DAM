package Pruebas_array;

import java.util.Arrays;
import java.util.Scanner;

public class Pruebas_Mias {

	public static void main(String[] args) 
	{
		//Para rellenar con datos el array
		System.out.println("Dame datos para rellenar 8 huecos");
		int[] array = new int [8];
		
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) 
		{
			array[i] = teclado.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
	}

}
