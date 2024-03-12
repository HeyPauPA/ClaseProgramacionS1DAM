package Ejercicios_5_While;

import java.util.Scanner;

public class SumaSerie {

	public static void main(String[] args) 
	{
		//por teclado pediremos la suma total q quiero conseguir, 
		//nos dira cuando termine y cuantos numeros ha tenido q sumar
		
		//----- VARIABLES ------
		double numAConseguir;
		double suma = 0;
		double contador= 0;

		System.out.println("Dame un numero y sumare 1/1, 1/2... hasta q de el numero q pediste, y te dare las veces q sumé");
		Scanner Teclado = new Scanner(System.in);
		numAConseguir = Teclado.nextDouble();
		
		 
		while (suma < numAConseguir);
		{
			suma =  suma + (1/contador) ;	
			contador++;
		}
		
	
		System.out.println("Sume " + contador + " veces");

		Teclado.close();
	}

}
