package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) 
	{
		//		Introduciendo: 6
		//		Da como salida:
		//			  1
		//	   		1 2 1
		//	   	  1 2 3 2 1
		//	    1 2 3 4 3 2 1
		// 	  1 2 3 4 5 4 3 2 1
		//  1 2 3 4 5 6 5 4 3 2 1
		
		
		int numerDado;
		Scanner Teclado = new Scanner(System.in);
		
		numerDado = Teclado.nextInt();
		
		for (int j = 0; j <= numerDado ; j++) 
		{
			
			for (int i = j; i <= numerDado; i++) 
			{
				System.out.print(" ");	
			}
			
			for (int i = 1; i < j ; i++) 
			{
				System.out.print(i);
			}
			
			for (int i = j-1 ; i >= j ; i--) 
			{
				System.out.print(i);
			}
		
			System.out.println("");
		}
		Teclado.close();

	}

}
