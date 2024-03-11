package Ejercicios_Apuntes;

import java.util.Arrays;

public class Arrays_Estaticos_En_1_2_Y_3D {

	public static void main(String[] args) 
	{
		// ------ UNA DIMENSION ------
		
		int[] UnaDimension = {1,5,7,99,84,61,4};
		
		// Como leerlo 
		//con un for normal que leera con el dato i la fila (hay que identificar la i
		//													 con una columna lo veremos ahora)
		
		System.out.println("Array 1D: ");
		for (int i = 0; i < UnaDimension.length; i++) 
		{
			System.out.print(" " + UnaDimension[i]) ;
		}
		
		System.out.println("");
		
		// ------- DOS DIMENSIONES --------
		
		int[][] DosDimensiones = {
								  {1,4,8,4,3,5,8,7},
								  {1,5,7,9,8,6,4,1}
								 };
		
		// Como leerlo
		//1º FORMA
		
		System.out.println("Array 2D: ");
		for (int i = 0; i < DosDimensiones.length; i++) //La i representa las columnas
		{
			System.out.print("{");
			for (int j = 0; j < DosDimensiones[i].length; j++) //la j las filas
			{
				System.out.print(DosDimensiones[i][j] + " ");
			}
			System.out.print("}");
			System.out.println(" ");
		}
		
		//2º FORMA
		for (int[] is : DosDimensiones) 
		{
			System.out.println(Arrays.toString(is));
		}
		
		// ------- TRES DIMENSIONES --------
		
				int[][][] tresDimensiones = {
											  {{18,70,94},{40,64,82}},
											  {{46,86,45},{75,15,98}}	 
										    };
				
		for (int i = 0; i < tresDimensiones.length; i++) //→ la i se encarga de pasar por las columnas
		{
			for (int j = 0; j < tresDimensiones[i].length; j++)  //→ la j se encarga de pasar por las filas
			{
				System.out.print("{");
				for (int k = 0; k < tresDimensiones[i][j].length; k++)  //→ la i se encarga de pasar por la profuncidad
				{
					System.out.print(tresDimensiones[i][j][k] + " ");
				}
				System.out.print("}");
				System.out.println(" ");
			}
		}
		
	}

}
