package Ejercicios_String_Casa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class eJ_2B {

	public static void main(String[] args) {
		String frase = "" ;
		int contadorespaciospuntoscomas = 0;

		System.out.println("Dame una frase y te dire cuantas palabras tiene");

		Scanner teclado = new Scanner(System.in);

		frase = teclado.nextLine();

		//VERSION 2

		StringTokenizer fraseToken =new StringTokenizer(frase, " .,:;"); //buscamos detro de la frase espacio punto...


		System.out.println("El numero de cambios para " + frase + "es " + fraseToken.countTokens() );

	}

}
