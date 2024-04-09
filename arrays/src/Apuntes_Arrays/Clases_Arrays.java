package Apuntes_Arrays;

import java.util.Arrays;

public class Clases_Arrays {

	public static void main(String[] args) 
	{
		
		
//		Probamos una clase array, que es una clase especia
//		que nos ayuda con el manejo de arrays
		
		int[]numeros = {4,7,12,27,25,26,49,51};
		
		//Imprimir un array en pantalla
		System.out.println(Arrays.toString(numeros));
		
		//Buscar un valos en un array (tiene q estar ordenado)
		System.out.println("Busqueda: " + Arrays.binarySearch(numeros, 80)); //si el numero q te da es negativo, 
																			 //te da la posicion donde deberia estar
		//Insertar un numero en una posicion
		numeros[3]= 58;
		
		//Para ordenar los numeros
		System.out.println(Arrays.toString(numeros)); //antes del orden
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));//despues del orden
		
		//Copiar trozo de un array hasta donde digamos
		int[] numeros2 = Arrays.copyOf(numeros, 4); //copia un cacho del array q queramos desde el punto q le des
		System.out.println( Arrays. toString(numeros2));
		
		//Copiar un trozo, indicando el inicio y final
		int[]numeros3 = Arrays.copyOfRange(numeros, 2,6); //pero el ultimo dato es restrictivo osea q el 6 no entra
		System.out.println("Array copia de un rango" + Arrays.toString(numeros3));
		
		//Comparar si 2 arrays son iguales (sus datos)
		System.out.println("El array 1 y 2 son iguales?: "+ Arrays.equals(numeros2, numeros3) );
		
		//Rellena un array con un solo valor (cambia todos los anteriores)
		Arrays.fill(numeros3, 7);
		System.out.println( Arrays.toString(numeros3));
		
		//clonar un array ya creado
		int[]numeros4 = numeros.clone();
		System.out.println(numeros4);
		
		
	}

}
