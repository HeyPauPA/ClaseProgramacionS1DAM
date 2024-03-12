package Ejercicios_Clase;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) 
	{
		/*
		 * Pedir el día, y año de una fecha correcta y mostrar la fecha del dia
		   siguiente. suponiendo que cada mes tiene un número distinto de días (suponer
		   que febrero tiene siempre 28 días).
		 */

		//----- VARIABLES ------
		int dia;
		int mes;
		int año;


		System.out.println("Deme una fecha real y le dire el dia siguiente");

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Deme dia");
		dia = Teclado.nextInt();

		System.out.println("Deme mes");
		mes = Teclado.nextInt();

		System.out.println("Deme año");
		año = Teclado.nextInt();

		if((dia == 31 && mes == 1||dia == 31 && mes == 3||dia == 31 && mes == 5 ||dia == 31 && mes == 7||dia == 31 && mes == 8 ||dia == 31 && mes == 10 ||dia == 31 && mes == 12) 
		|| (dia == 30 && mes == 4||dia == 30 && mes == 6 ||dia == 30 && mes == 9||dia == 30 && mes == 11)
		|| (dia == 28 && mes == 2)) 
		{
			dia=1;
			mes ++;

			if(mes == 13) 
			{
				mes = 1;
				año = año +1;
			}

		}

		else
			dia = dia+1;
		System.out.println("La fecha del dia siguiente es: " +" dia" + dia  +" mes" + mes +" año" + año );
		
		Teclado.close();

	}

}
