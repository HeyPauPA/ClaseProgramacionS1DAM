package Ejercicios_1_If_Else;

import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) 
	{
		//dame su dia y mes y te dire q signo tienes
		int dia;
		int mes;
		
		System.out.println("Dime tu mes y dia y te dire tu signo");
		
		Scanner Teclado = new Scanner(System.in);
		
		dia = Teclado.nextInt();
		mes = Teclado.nextInt();
		
		//ARIES
		if ((dia >= 21 || dia <= 19) && (mes == 3 || mes == 4)) 
		{
			System.out.println("Eres Aries");
		}
		
		//TAURO
		else if ((dia >= 20 || dia <= 20) && (mes == 4 || mes == 5)) 
		{
			System.out.println("Eres Tauro");
		}
		
		//GEMINIS
		else if ((dia >= 21 || dia <= 20) && (mes == 5 || mes == 6)) 
		{
			System.out.println("Eres Geminis");
		}
		
		//CANCER
		else if ((dia >= 21 || dia <= 22) && (mes == 6 || mes == 7)) 
		{
			System.out.println("Eres Cancer");
		}
		
		//LEO
		else if ((dia >= 23 || dia <= 22) && (mes == 7 || mes == 8)) 
		{
			System.out.println("Eres Leo");
		}
		
		//VIRGO
		else if ((dia >= 23 || dia <= 22) && (mes == 8 || mes == 9)) 
		{
			System.out.println("Eres Virgo");
		}
		
		//LIBRA
		else if ((dia >= 23 || dia <= 22) && (mes == 9 || mes == 10)) 
		{
			System.out.println("Eres Libra");
		}
		
		//ESCORPIO
		else if ((dia >= 23 || dia <= 21) && (mes == 11 || mes == 12)) 
		{
			System.out.println("Eres Escorpio");
		}
		
		//SAGITARIO
		else if ((dia >= 22 || dia <= 21) && (mes == 12 || mes == 1)) 
		{
			System.out.println("Eres Sagitario");
		}
		
		//CAPRICORNIO
		else if ((dia >= 22 || dia <= 19) && (mes == 1 || mes == 2)) 
		{
			System.out.println("Eres Capricornio");
		}
		
		//ACUARIO
		else if ((dia >= 20 || dia <= 18) && (mes == 2 || mes == 3)) 
		{
			System.out.println("Eres Acuario");
		}
		
		//PISCIS
		else if ((dia >= 19 || dia <= 20) && (mes == 3 || mes == 4)) 
		{
			System.out.println("Eres Piscis");
		}
		
		else
			System.out.println("FECHA INCORRECTA");
		

		Teclado.close();
	}

}
