package Ejercicios_String_Casa;

import java.util.Scanner;

public class ContarLetra {

	public static void main(String[] args) {

		//pedimos una letra y una frase y q en esa frase encontremos 
		//el numero de veces q la letra aparece
		char letra ;
		String frase ;
		int contadorLetra = 0;

		System.out.println("Dame una frase una letra y te dire cuantas veces aparece esa letra");
		Scanner teclado = new Scanner(System.in);

		System.out.println("deme la frase");
		frase = teclado.nextLine();

		System.out.println("Deme la letra");
		letra = teclado.nextLine().charAt(0);

		for (int i = 0; i < frase.length(); i++) 
		{
			if(frase.charAt(i) == letra)
			{
				contadorLetra++;
			}	
		}

		System.out.println("El numero de letras son" + (contadorLetra));


	}
}
