package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_7 {

	public static void main(String[] args) 
	{
		//		Programa que sume todas las cifras de los números que aparecen en una
		//		cadena de caracteres.
		//		Introduciendo: "15 de Noviembre de 2022"
		//		Da como salida: 12	

		String frase = "" ;
		String textoNumero;
		char letra ;
		int numero;
		int suma = 0 ;
		int valor = 0;

		System.out.println("Dame una frase y te sumare los numeros que aparecen");

		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) 
		{
			//ver si una letra es igual a un numero
			if(Character.isDigit(frase.charAt(i)))
			{
				
				//convertir la letra a string 
				textoNumero = String.valueOf(frase.charAt(i));
				
				//y de string a entero
			    valor = Integer.parseInt(textoNumero);
			    
			    //sumamos los diferentes valores de cada numero
			    suma = valor + suma;
			}
		}
		System.out.println("La suma es " + suma);

	}

}
