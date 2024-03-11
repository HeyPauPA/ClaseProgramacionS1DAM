package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_3B {

	public static void main(String[] args) 
	{
		//		Programa que codifique una cadena cambiando cada letra por la siguiente en
		//		el código ASCII.
		//		Introduciendo: "Lunes"
		//		Da como salida: "Mvoft"

		String frase = "" ;
		String fraseAscii = "";
		char letra;

		
		System.out.println("Dame una frase y te ñla dare en ascii");

		Scanner teclado = new Scanner(System.in);

		StringBuilder sb = new StringBuilder(frase);
		
		frase = teclado.nextLine();

		for (int i = 0; i < sb.length(); i++) 
		{
			letra = sb.charAt(i);
			letra++;
			
			sb.setCharAt(i, letra);
		}

	}

}
