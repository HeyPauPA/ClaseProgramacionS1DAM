package Apuntes_Arrays;

import java.util.Arrays;

public class Apuntes_Arrays {

	public static void main(String[] args) 
	{
		
		//ESTRUCTURAS:	
		
				//Estaticas: ·no cambia de tamaño
				//			 ·son de tipo unico (solo puedes guardar esos objetos)
				//		     ·son muy rapidas
				//			 ·multidimensional
				
				//Dinámicas: ·puede cambia de tamaño
				//			 ·son de multitipo (puedes guardar cualquier objeto)
				//		     ·son mas lentas
				//			 ·unidimensional
				
		
		// --- ESTÁTICAS ---
		//--- Vamos a probar los arrays ---
				
		// ·Declaracion de un array
		
		//↓DE Q ES + [] + NOMBRE
		
		int []a;     //← Recuerda q se pueden realizar varias de una tajada (aunq solo sera array la primera)
		
		//·Crear un array de un tamaño definido
		
		a = new int[20];   //20 huecos  *de esta manera puedes cambiar el tamaño designado a ese array anteriormente
		// o
		int[] b = new int[15];
		
		//  *si quiero cambiar su tamaño (borro el tamaño anterior)
		a = new int[25];
		
		//guardar un dato en un hueco del array
		
		a[5] = 18; //guardo el dato 18 en el hueco 5 ⚠RECUERDA Q EMPIEZA EN EL 0⚠
		
		//VER DATOS DEL ARRAY
		System.out.println("Para ver el dato en el hueco nº 3 " + a[3]);
		System.out.println("Para ver el dato en el hueco nº 15 " + a[15]);
		
		System.out.println("Donde se encuentra el array en la memoria del ordenador (su direccion de memoria) " + a);
		
		//para leer todos los datos del array
		
		//1ºA FORMA
		
		System.out.print("Primera forma: ");
		for (int i = 0; i < a.length; i++) //⚠ al hacer control + espacio pondra el ultimo array creado ⚠
		{
			System.out.print(" " +a[i]);
		}
		System.out.println("");
		
		//2ºA FORMA
		System.out.println("Segunda forma: " +  Arrays.toString(a));
	
		//TIPOS DE ARRAY
		int [] c;
		double[] d;
		String[]e;
		Object[]f;
		int [][]g; //de altura y anchura (2 dimensiones)
		
		//Declarar un array con datos ya dentro (el mas usado)
		
		int[]h = {1,5,6,8,9,44};
		
		//ECUACIONES DE ARRAYS
		
		a[5]++;
		System.out.println("Para ver un dato en el hueco  nº 5 + 1 a ese dato " + a[5]);
		
		a[15] = 20;
		a[15] += a[5]; //⚠RECUERDA EL DATO SE GUARDA EN EL PRIMERO⚠
		System.out.println(a[15]);
		
	}

}
