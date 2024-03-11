package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) 
	{
		//Programa que lea números hasta que se den cinco ceros y escriba después la
		//suma de los números leídos.

		int numeroCeros= 0;
		int numerDado;
		int suma = 0;
		
		Scanner Teclado = new Scanner(System.in);
		
		do
		{
			numerDado = Teclado.nextInt();
			suma = numerDado + suma;
			
			if(numerDado == 0) 
			{
				numeroCeros++;
			}
		}
		while(numeroCeros < 5); 
		
		System.out.println("La suma es: " + suma);
		
		Teclado.close();
	}
	

}
