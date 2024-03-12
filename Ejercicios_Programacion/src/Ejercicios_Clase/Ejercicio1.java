package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		/*Diseñar un algoritmo para leer las longitudes de los lados de un triángulo (A, B, C)
		 *y determinar qué tipo de triángulo es, de acuerdo a los siguientes casos. 
		 *
		 *Suponiendo que A es el mayor de los lados y que B y C corresponden a los otros dos 
		 *lados entonces:
		 *
		 *Si A >= B+C no se trata de un triángulo
		 *Si A2 = B2+C2 es triángulo rectángulo
		 *Si A2 > B2+C2 triángulo obtusángulo
		 *Si A2 < B2+C2 triángulo acutángulo
		 *
		 */
		
		//----- VARIABLES ------
		int A;
		int B;
		int C;
		
		System.out.println("Deme las longitudes de A, B y C y le dire q tipo de triangulo es");
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Deme A");
		A = Teclado.nextInt();
		
		System.out.println("Deme B");
		B = Teclado.nextInt();
		
		System.out.println("Deme B");
		C = Teclado.nextInt();

		//----- CODIGO -----
		if (A >= (B+C)) 
		{
			System.out.println("no es un triangulo");
		}
		else if ((A * A) == ((B*B)+(C*C))) 
		{
			System.out.println("es  un triángulo rectángulo");
		}
		else if ((A * A) > ((B*B)+(C*C))) 
		{
			System.out.println("es  un triángulo obtusangulo");
		}
		else if ((A * A) < ((B*B)+(C*C))) 
		{
			System.out.println("es  un triángulo acutangulo");
		}
		
		Teclado.close();
	}

}
