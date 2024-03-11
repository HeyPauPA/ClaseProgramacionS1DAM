package Ejercicios_String_Casa;
import java.util.Iterator;
import java.util.Scanner;
public class Ej_9 {

	public static void main(String[] args) 
	{
		
//		9.Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
//		aparece la primera en la segunda.
//		Introduciendo: la
//		"La calle de la plaza"
//		Da como salida: 2
		
		String frase ="";
		String fraseBuscada = "";
		int contadorCoincidencias = 0;
		int posicion;
		
		System.out.println("Dame 2 frases y te dire cuanto se repite la segunda en la primera");

		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();
		
		System.out.println("Segunda frase");
		fraseBuscada = teclado.nextLine();
		
		//convertir a mayusculas
		frase = frase.toUpperCase();
		fraseBuscada = fraseBuscada.toUpperCase();
		
		
		posicion = frase.indexOf(frase, 0);//buscar la primera vez q aparece la palabra
		
		while (posicion !=-1) 
		{
			contadorCoincidencias++;
			posicion = frase.indexOf(frase, posicion+1);
		}
		
		System.out.println(contadorCoincidencias);
	}

}
