package Repaso_Ejercicios_Clase;

import java.util.Arrays;

public class Apuntes_Clases_arrays {

	public static void main(String[] args) 
	{
		//Probamos la clase Arrays, que es una clase especial
		//que nos ayuda con el manejo de los arrays.
		
		int[] numeros = {4, 7, 12, 27, 35, 36, 49, 51};

		//imprimir un array en pantalla
		System.out.println("Array: " + Arrays.toString(numeros));
		
		//buscar un valor en un array (tiene que estar ordenado, con Arrays.sort)
		System.out.println("Busco el numero 36, esta en la posicion: " + Arrays.binarySearch(numeros, 36));
		
		//ordenar un array
		int[] numerosDesordenados = {51, 12, 7, 49, 35, 36, 27,4 };
		
		System.out.println("Ordeno el array → " + Arrays.toString(numerosDesordenados));
		Arrays.sort(numerosDesordenados);
		System.out.println("a numeros ordenados → " + Arrays.toString(numerosDesordenados));
		
		//copiar trozos de un array
		//desde un punto
		int[] numeros2 = Arrays.copyOf(numerosDesordenados, 5);
		//un trozo en concreto
		int[] numeros3 = Arrays.copyOfRange(numeros, 5, 7);
		
		System.out.println("1º" + Arrays.toString(numeros2) + "2º" + Arrays.toString(numeros3));
		
		//clonar un array
		int[] numero4 = numeros.clone();
		
		//Comparar si dos arrays son iguales (sus datos)
		System.out.println(Arrays.equals(numeros, numero4)); 
	}
}
