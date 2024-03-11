package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) 
	{
//		4. Programa que rote una cadena tantas veces como se le diga.
//		Introduciendo: "Lunes"
//		Rotaciones: 3
//		Da como salida: "nesLu"

		String frase = "" ;
		int numeroVueltas;
		char letra;

		System.out.println("Dame una frase y te la rotare las veces indicadas");

		Scanner teclado = new Scanner(System.in);

		frase = teclado.nextLine();
		
		System.out.println("Deme el numero de vueltas");
		
		numeroVueltas = teclado.nextInt();
		
		StringBuilder sb = new StringBuilder(frase);

		for (int i = 1; i <= numeroVueltas; i++) 
		{
			//guardar la ultima letra
			letra = sb.charAt(sb.length()-1);
			
			//elimino una letra
			sb.deleteCharAt(sb.length()-1);
			
			//la pongo al inicio
			sb.insert(0, letra);
		}
		
		System.out.println(sb);
	}

}
