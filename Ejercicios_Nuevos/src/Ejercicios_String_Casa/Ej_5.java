package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_5 {

	public static void main(String[] args) 
	{
		
//		Programa que lea un numero double, lo convierta a una cadena y le añada las
//		comas separadoras de los miles.
//		Introduciendo: 2388432.34
//		Da corno salida:
		

		String frase = "" ;
		double numero;
		int posicioncero;
		int lugarcoma = 0;
		char letra;

		System.out.println("Dame una frase y te la rotare las veces indicadas");

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Deme el numero");
		
		numero= teclado.nextDouble();
		
		frase = String.valueOf(numero);
				
		//convertir el string en stringBuilder
		StringBuilder sb = new StringBuilder(frase);
		
		//buscamos el punto
		posicioncero = sb.indexOf("."); //la variable stringbuilder solo busca string

		//buscamos el resto de comas de 3 en tres a partir de 3
//		for (int i = 0; i < sb.length(); i = i+3) 
//		{
//			
//			//contamos desde el . tres a la izquierda
//			lugarcoma = posicioncero-i;
//					
//			sb.insert(lugarcoma , ",");
//			
//		}
		lugarcoma = posicioncero -3;
		
		while (lugarcoma > 0) 
		{
			//contamos desde el . tres a la izquierda
			sb.insert(lugarcoma , ",");
			lugarcoma = lugarcoma -3;	
		}
		
		System.out.println(sb);
	}

}
