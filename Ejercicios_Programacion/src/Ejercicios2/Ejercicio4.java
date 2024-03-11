package Ejercicios2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		/*
		 * Programa que nos diga si un numero ha conseguido o no el reintegro en el
		   sorteo de la ONCE. un número de cinco cifras consigue el reintegro si su
		   primera o última cifra coincide con la primera o última cifra del número
		   agraciado en el sorteo.
		 * 
		 */

		// -------- FORMA 1 ---------
		/*int numeroDado;
		int numeroPremiado = 29348;


		System.out.println("Deme su numero Loteria y dire si tiene reintegro");

		Scanner Teclado = new Scanner(System.in);

		numeroDado = Teclado.nextInt();

		if(((numeroDado / 10000) == (numeroPremiado /10000))||((numeroDado % 10)== (numeroPremiado %10))) 
		{
			System.out.println("Tiene reintegro");
		}
		else
			System.out.println("No tiene reintegro");

		Teclado.close();*/


		//----------- FORMA 2 ( CON UN MATH RANDOM)-------------
		/* int numeroDado ;//el math random siempre dara un numero menor a 1
		   int numeroPremiado = (int) (Math.random() *100000);


		System.out.println("Ingrese su numero de loteria y le dire si ha ganado");

		Scanner Teclado = new Scanner(System.in);

		numeroDado = Teclado.nextInt();

		System.out.println("El numero ganador es"+ numeroPremiado);

		if(((numeroDado / 10000) == (numeroPremiado /10000))||((numeroDado % 10)== (numeroPremiado %10))) 
		{
			System.out.println("Tiene reintegro");
		}
		else
			System.out.println("No tiene reintegro");

		}
		Teclado.close();
		 */

		//--------------- FORMA 3 (CON UN OBJETO) -----------------
		int numeroDado ;//el math random siempre dara un numero menor a 1
		int numeroPremiado ;
		
		Random generador = new Random();
		
		numeroPremiado = generador.nextInt(10000); //FORMA DE HACER EL RANDOM CON UN OBJETO

		System.out.println("Ingrese su numero de loteria y le dire si ha ganado");

		Scanner Teclado = new Scanner(System.in);

		numeroDado = Teclado.nextInt();

		System.out.println("El numero ganador es"+ numeroPremiado);

		if(((numeroDado / 10000) == (numeroPremiado /10000))||((numeroDado % 10)== (numeroPremiado %10))) 
		{
			System.out.println("Tiene reintegro");
		}
		else
			System.out.println("No tiene reintegro");
		}
	
	}
