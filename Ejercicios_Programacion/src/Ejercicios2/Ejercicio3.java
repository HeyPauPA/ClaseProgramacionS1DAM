package Ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		/*
		 * Programa que obtenga la letra del DNI a partir del número. Para ello debe
		 * dividir el número entre 23(división entera), luego multiplicarlo por 23 y restar el
	     * resultado del valor original. La letra asociada al número vendrá dada este
	     * resto en función de la siguiente tabla:
		*/
			
		//----- VARIABLES ------
		int numEcuacionDNI;
		int numeroDNI;

		System.out.println("Deme su numero de DNI y le dire su letra");

		Scanner Teclado = new Scanner(System.in);

		numeroDNI = Teclado.nextInt();
		
		numEcuacionDNI = numeroDNI % 23;
	
		switch (numEcuacionDNI) {
		
		case 0: System.out.println("T");
		break;
		
		case 1: System.out.println("R");
		break;

		case 2: System.out.println("W");
		break;
		
		case 3: System.out.println("A");
		break;

		case 4: System.out.println("G");
		break;
		
		case 5: System.out.println("M");
		break;
		
		case 6: System.out.println("Y");
		break;
		
		case 7: System.out.println("F");
		break;
		
		case 8: System.out.println("P");
		break;
		
		case 9: System.out.println("D");
		break;
		
		case 10: System.out.println("X");
		break;
		
		case 11: System.out.println("B");
		break;
		
		case 12: System.out.println("N");
		break;
		
		case 13: System.out.println("J");
		break;
		
		case 14: System.out.println("Z");
		break;
		
		case 15: System.out.println("S");
		break;
		
		case 16: System.out.println("Q");
		break;
		
		case 17: System.out.println("V");
		break;
		
		case 18: System.out.println("H");
		break;
		
		case 19: System.out.println("L");
		break;
		
		case 20: System.out.println("C");
		break;
		
		case 21: System.out.println("K");
		break;
		
		case 22: System.out.println("E");
		break;

		default: System.out.println("No es un numero valido");
			break;
		}
		
		Teclado.close();
	}

}
