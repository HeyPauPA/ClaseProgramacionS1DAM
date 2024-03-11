package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) 
	{
		//		Programa que codifique una cadena cambiando cada letra por la siguiente en
		//		el código ASCII.
		//		Introduciendo: "Lunes"
		//		Da como salida: "Mvoft"

		String frase = "" ;
		String fraseAscii = "";
		char letra;

		System.out.println("Dame una frase y te la dare en ascii");

		Scanner teclado = new Scanner(System.in);

		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) 
		{
			//saco una letra
			letra = frase.charAt(i);
			
			//la modifico
			letra++;
			
			//la vuelvo a poner en su lugar
			fraseAscii = fraseAscii + letra;
		}
	}

}
