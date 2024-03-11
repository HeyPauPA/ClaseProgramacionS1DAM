package Ejercicios_String_Casa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej_9B {

	public static void main(String[] args) {
		
//		9.Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
//		aparece la primera en la segunda.
//		Introduciendo: la
//		"La calle de la plaza"
//		Da como salida: 2
		
		String frase ="";
		String fraseBuscada = "";
		String trozo = "";
		int contadorCoincidencias = 0;
		
		System.out.println("Dame 2 frases y te dire cuanto se repite la segunda en la primera");

		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();
		
		System.out.println("Segunda frase");
		fraseBuscada = teclado.nextLine();
		
		StringTokenizer st = new StringTokenizer(frase);//aprobechamos q corta por palabras
		
		
		//bucle para ir pidiendo trozos
		while (st.hasMoreTokens()) 
		{
			trozo = st.nextToken();
			
			if(trozo.equalsIgnoreCase(fraseBuscada)) {
				contadorCoincidencias++;
			}
			
		}
		System.out.println(contadorCoincidencias);
	}

}
