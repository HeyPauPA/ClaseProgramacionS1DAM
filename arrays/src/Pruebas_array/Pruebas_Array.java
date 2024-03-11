package Pruebas_array;

import java.util.Arrays;

public class Pruebas_Array {
	public static void main(String[] args) 
	{
	 //ESTRUCTURAS:	
		
		//estaticas: ·no cambia de tamaño
		//			 ·son de tipo unico (solo puedes guardar esos objetos)
		//		     ·son muy rapidas
		//			 ·multidimensional
		
		//dinámicas: ·puede cambia de tamaño
		//			 ·son de multitipo (puedes guardar cualquier objeto)
		//		     ·son mas lentas
		//			 ·unidimensional
		
		//--- Vamos a probar los arrays ---
		
		//declaracion de un avariable individual
		
		int a;
		
		//declaracion de variable array con []
		 
		int[]b,e,f; //pueden hacerse varias variables de una tacada
		//otra manera de declararla
		int c[];	//solo se puede hacer una como array, el resto será int (se puede mezclar)
		
		//dimensionar el array
		
		b= new int[20]; //dimensiono una estructura de tipo entero para 20 datos del 0-19
		
		//se puede hacer todo en la misma linea
		int[] w = new int[10];
		
		//si qiuero cambiar el tamaño
		w= new int[12];
		
		//uso de la estructura, guardar un valor
		w[4]= 83; //guardo el 83, en el hueco 4
		
		System.out.println("El dato en el hueco 4 es: " + w[4]); //el dato en el hueco 4
		System.out.println("El dato en el hueco 5 es: " + w[5]); //el dato en el hueco 5
		System.out.println("El array se en cuentra en: "+ w);	 //donde se encuentra en la memoria la estructura
		
		//para ver todos lo datos del array
		for (int i = 0; i < w.length; i++) 
		{
			System.out.print(" " + w[i]);
		}
		
		//q tipos de array existen
		double[]j;
		boolean[]k;
		String[]l;
		Object[]m;
		int [][]n; //de altura y anchura (2 dimensiones)
		
		//declarar un array ya con los valores dentro 
		int[]o= {1,5,6,8,-4,18};
		
		o[3]++;//dato en la posicion 3 ++
		
		o[2] += o[4];
		
		System.out.print(Arrays.toString(o)); // convierte directamente a string sin usar for
		
		
	}	
}
