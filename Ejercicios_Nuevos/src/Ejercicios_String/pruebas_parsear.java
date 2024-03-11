package Ejercicios_String;

import java.util.Scanner;

public class pruebas_parsear {

	public static void main(String[] args) 
	{

		//numero de 4 cifras lo divido en 2 trozos y lo sumo

		System.out.println("Dame un numero de 4 cifras y te sumare los "
				+ "2 primeros digitos y los 2 segundos");
		int num = 0 ;

		int numPP;
		int numSP;
		int suma;

		Scanner teclado = new Scanner(System.in);

		num = teclado.nextInt();
		String numeroLetras = "";
		String numeroLetrasPrimeraParte = "";
		String numeroLetrasSegundaParte = "";

		numeroLetras = String.valueOf(num);

		numeroLetrasPrimeraParte = numeroLetras.substring(0,2);
		numeroLetrasSegundaParte = numeroLetras.substring(2); //hasta el infinito)

		numPP = Integer.parseInt(numeroLetrasPrimeraParte);
		numSP = Integer.parseInt(numeroLetrasSegundaParte);
		
		suma =numPP+ numSP;
		
		System.out.println("La suma de los 2 primeros digitos y los 2 segundos es: " + suma);



	}

}
