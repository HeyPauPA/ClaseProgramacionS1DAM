package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		/*
		 * Programa que calcule las soluciones de una ecuación de segundo grado. La
		 * ecuación es ax2 + bX + c = O. Y la solución se calcula como:
		 */
		
		//----- VARIABLES ------
		int a;
		int b;
		int c;
		
		double solucion = 0;
		
		System.out.println("Deme A, B y C y te dare la solucion");
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Deme a");
		a = Teclado.nextInt();
		
		System.out.println("Deme b");
		b = Teclado.nextInt();
		
		System.out.println("Deme c");
		c = Teclado.nextInt();
		
		double discriminante = ((Math.pow(b, 2))+(-4*(a*c)));
		
		if( discriminante > 0) 
		{
			solucion =((-b +(Math.sqrt( (b*b) + (-4*(a*c)))))
					                  /(2*a));
			System.out.println("La solucion es " + solucion);
			
			solucion =((-b -(Math.sqrt ( (b*b) + (-4*(a*c)))))
	                                  /(2*a));
			System.out.println("La solucion es " + solucion);

		}
		else if( discriminante < 0) 
		{
			System.out.println("No existe solucion real");
		}
		else if( discriminante == 0) 
		{
			solucion= ((-b)/(2*a));
			System.out.println("La solucion es " + solucion);
		}
		
		Teclado.close();
	}

}
