package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) 
	{
//		Programa que lea números hasta que se teclee un número negativo y después
//		indique si se ha dado el mismo número dos veces consecutivas:
		
		System.out.println("deme numeros y da numero negativo acabara y dire si hay repetido");
		int numerDado;
		int numerDado1=0;
		boolean hayRepetidos = false;
		int suma = 0;
		
		Scanner Teclado = new Scanner(System.in);
		

		do
		{
			System.out.println("deme numero");
			numerDado= Teclado.nextInt();
			
			if(numerDado == numerDado1 ) 
			{
				hayRepetidos = true;
			}
			numerDado1 = numerDado;
		}
		while(numerDado > 0);
	
		if(hayRepetidos = true) 
		{
			System.out.println("Hay numeros repetidos");
		}
		else System.out.println("No hay repetidos");
		
		Teclado.close();
	}

}
