package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args)
	{
//		Programa que lea 5 números y diga cuántos son múltiplos de 3, cuántos
//		múltiplos de 5 y cuántos no están incluidos en ninguno de los grupos anteriores.

		
		System.out.println("deme 5 numeros y dire si son multiplos de 5 o 3");
		int contadorM3=0;
		int contadorM5=0;
		int otros=0;
		
		int numerDado;
		int suma = 0;
		
		Scanner Teclado = new Scanner(System.in);
		
		 for (int i = 0; i < 5; i++) 
		{
			numerDado= Teclado.nextInt();
			
			if((numerDado % 5) == 0) 
			{
				contadorM5++;
			}	
			if ((numerDado % 3) == 0) 
			{
				contadorM3++;
			}
			if ((numerDado % 3) != 0 || (numerDado % 5) != 0 ) 
			{
				otros++;
			}
		}
		
		System.out.println("Hay " + contadorM5 + " multiplos de 5 y " + contadorM3 + " multiplos de 3 y " + otros +" no eran multiplo de ninguno" );
		
		Teclado.close();	
	}

}
