package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_5 
{
	//	Programa que escriba los n primeros numeros de la sucesion de Fibonacci. El
	//	primer numero de la serie es O, el segundo es 1 y cada uno de los siguientes es la
	//	suma de los dos anteriores a el.
	//	
	//	Introduciendo: 1O
	//	Da comosalida:0 1 1 2 3 5 8
	//	13 21 34

	public static void main(String[] args) 
	{
		int numerDado;
		int primerNumero=0;
		int sgundoNumero=0;

		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme un numero y hare las sucesion "
				+ "de fibbonacci con ese nº de resultados");
		
		numerDado = Teclado.nextInt();
	
		for (int i = 0; i < numerDado; i++) 
		{
			
			
			//System.out.println(numerDado1);
		}
		
		Teclado.close();
	}
}
