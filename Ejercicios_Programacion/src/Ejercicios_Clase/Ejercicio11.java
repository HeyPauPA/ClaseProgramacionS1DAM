package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) 
	{
		/*Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
		cincuenta y seis.*/

		//----- VARIABLES ------
		int num;
		int primerNumero;
		int segundoNumero;

		System.out.println("Deme un numero y le escribire ");

		Scanner Teclado = new Scanner(System.in);

		num = Teclado.nextInt();
		
		primerNumero = num /10;
		segundoNumero = num%10;
		
		/*if(num <100) {

			switch ((num)) {

			case 11:System.out.println("once");
			break;
			case 12:System.out.println("doce");
			break;
			case 13:System.out.println("trece");
			break;
			case 14:System.out.println("catorce");
			break;
			case 5:System.out.println("quince");
			break;
			case 6:System.out.println("dieciseis");
			break;
			case 7:System.out.println("diecisiete");
			break;
			case 8:System.out.println("dieciocho");
			break;
			case 9:System.out.println("diecinueve");
			break;
			
			
			if(num/10 == 2)
				System.out.println("Veinte ");
			switch ((num%10)) {

			case 1:System.out.println("y uno");
			break;
			case 2:System.out.println("y dos");
			break;
			case 3:System.out.println("y tres");
			break;
			case 4:System.out.println("y cuatro");
			break;
			case 5:System.out.println("y cinco");
			break;
			case 6:System.out.println("y seis");
			break;
			case 7:System.out.println("y siete");
			break;
			case 8:System.out.println("y ocho");
			break;
			case 9:System.out.println("y nueve");
			break;

			default:
				break;
			}
			*/
		if(num == 11 || num == 12 || num == 13|| num == 14|| num == 15|| num == 16|| num == 17|| num == 18|| num == 19 ) 
		{
			switch ((num)) {

			case 11:System.out.println("once");
			break;
			case 12:System.out.println("doce");
			break;
			case 13:System.out.println("trece");
			break;
			case 14:System.out.println("catorce");
			break;
			case 15:System.out.println("quince");
			break;
			case 16:System.out.println("dieciseis");
			break;
			case 17:System.out.println("diecisiete");
			break;
			case 18:System.out.println("dieciocho");
			break;
			case 19:System.out.println("diecinueve");
			break;
		}	
		if(num <10) {

			switch (num) {

			case 1:System.out.println("uno");
			break;
			case 2:System.out.println("dos");
			break;
			case 3:System.out.println("tres");
			break;
			case 4:System.out.println("cuatro");
			break;
			case 5:System.out.println("cinco");
			break;
			case 6:System.out.println("seis");
			break;
			case 7:System.out.println("siete");
			break;
			case 8:System.out.println("ocho");
			break;
			case 9:System.out.println("nueve");
			break;

			default:
				break;
			}
		}

		}
		

	}

}
