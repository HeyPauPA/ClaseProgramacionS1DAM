package Package;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) 
	{
		//pediremos un numero del 1-7 y daremos el dia de la semana

		System.out.println("Deme un numero y te dire q dia de la semana es");

		//pedir un numero y saber si es par o impar
		int dia;

		Scanner Teclado = new Scanner(System.in);

		dia = Teclado.nextInt();

		if(dia >= 1 && dia <=7) 
		{

			// ---- Primera forma ----
			
			//el else se encarga de q solo se lea hasta q una sea verdadero, ahorra recursos
			/*if(dia ==1) 
			{
				System.out.println("Lunes");	
			}
			else if (dia ==2) 
			{
				System.out.println("Martes");
			}
			else if (dia ==3) 
			{
				System.out.println("Martes");
			}
			else if (dia ==4) 
			{
				System.out.println("Martes");
			}
			else if (dia ==5) 
			{
				System.out.println("Martes");
			}
			else if (dia ==6) 
			{
				System.out.println("Martes");
			}
			else if (dia ==2) 
			{
				System.out.println("Martes");
			}*/

			// ---- Segunda forma (switch) ----
			
			switch (dia) 
			{
			case 1: System.out.println("Lunes");
			break;

			case 2: System.out.println("Martes");
			break;

			case 3: System.out.println("Miercoles");
			break;

			case 4: System.out.println("Jueves");
			break;

			case 5: System.out.println("Viernes");
			break;

			case 6: System.out.println("Sabado");
			break;

			case 7: System.out.println("Domingo");
			break;

			}
		}
		else
			System.out.println("Numero incorrecto");
		
		Teclado.close();
	}
}
