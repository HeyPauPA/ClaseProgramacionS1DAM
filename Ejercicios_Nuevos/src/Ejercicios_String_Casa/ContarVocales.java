package Ejercicios_String_Casa;

import java.util.Iterator;
import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) 
	{
		
		String frase ="";
		String vocales ="AaEeIiOoUuÀàÈèÌìÒòÙù";
		int contadorVocales = 0;
		
		System.out.println("Dame una frase y te dire cuantas vocales tiene");
		Scanner teclado = new Scanner(System.in);
		
		frase = teclado.nextLine();
		
//		for (int i = 0; i <= frase.length(); i++) 
//		{
//		    if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' 
//		    		|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u') 
//		    {
//		    	contadorVocales++;
//		    }
//		}
		
		for (int i = 0; i <= frase.length(); i++) 
		{
			//buscamos las veces q aparece una de las letras del string vocal, 
			//en las diferentes letras de la frase (una a una por la i)
		    if(vocales.indexOf(frase.charAt(i)) != -1) 
		    {
		    	contadorVocales++;
		    }
		}	
		
		System.out.println("El numero de vocales es " + contadorVocales);
	}

}
