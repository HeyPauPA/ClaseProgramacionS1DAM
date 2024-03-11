package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) 
	{
		String frase = "" ;
		int contadorespaciospuntoscomas = 0;

		System.out.println("Dame una frase y te dire cuantas palabras tiene");

		Scanner teclado = new Scanner(System.in);

		frase = teclado.nextLine();

		//VERSION 1
				
				for (int i = 0; i < frase.length(); i++) 
				{
					if(frase.charAt(i) ==  frase.indexOf(" ") 
		             || frase.charAt(i) ==  frase.indexOf(".")|| frase.charAt(i) ==  frase.indexOf(","))
						contadorespaciospuntoscomas++;
				}



		System.out.println("El numero de cambios para " + frase + "es " + contadorespaciospuntoscomas + 1 );
	}

}
