package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		//funcion para saber de q tipo es tu nota
		//----- VARIABLES ------
		int nota;

		System.out.println("Deme su nota y le dire q calificacion tiene ");

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Deme su nota");
		nota = Teclado.nextInt();

		switch (nota) {
		case 0,1,2,3,4: System.out.println("Suspenso");
			break;
		case 5: System.out.println("Suficiente");
		break;
		
		case 6: System.out.println("Bien");
		break;
		
		case 7,8: System.out.println("Notable");
		break;
		
		case 9,10: System.out.println("Sobresaliente");
		break;
		
		default: System.out.println("No es una nota real");
			break;
		}
		
		Teclado.close();

	}

}
