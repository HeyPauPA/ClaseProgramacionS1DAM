package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		
//		Programa que pase un String a mayúsculas y diga cuantas letras han
//		cambiado.
//		Introduciendo: "Hola a Todos"
//		Da como salida: "HOLA A TODOS" 8 cambios

		String frase = "" ;
		String fraseMayusc = "" ;
		int contadorLetraCambio = 0;

		System.out.println("Dame una frase y te dire cuantas vecescambio la "
				+ "frase para q todo sea mayuscula");
		
		Scanner teclado = new Scanner(System.in);

		frase = teclado.nextLine();

		fraseMayusc = frase.toUpperCase();
		
		for (int i = 0; i < frase.length(); i++) 
		{
			if(frase.charAt(i) != fraseMayusc.charAt(i))
				contadorLetraCambio++;
		}
		
		System.out.println("El numero de cambios para " + frase + "a " + fraseMayusc + "es igual a " + contadorLetraCambio);
		
	}

}
