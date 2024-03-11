package Ejercicios_While;

import java.util.Scanner;

public class NumeroSecreto_Caliente_Frio {

	public static void main(String[] args) 
	{

		// Pedir numero hasta q adivinemos el numero secreto
		//----- VARIABLES ------
		int num;
		int contador= 0;
		int numeroSecreto = (int)(Math.random()*10);

		System.out.println("Acierta el numero secreto");
		Scanner Teclado = new Scanner(System.in);

		do 
		{
			num = Teclado.nextInt();
			contador++;

			
			if(num == numeroSecreto) 
			{
				System.out.println("Has acertado el numero era: " + numeroSecreto + ", el numero de intentos fue "+ contador + "/10");
			}
			else if (num < numeroSecreto) 
			{
				System.out.println("Mas alto");	
			}
			else if (num > numeroSecreto) 
			{	System.out.println("Mas bajo");}
			
			if (contador ==10) 
			{
				System.out.println("Gastaste tus 10 oportunidades");
			}

		}
		while (num != numeroSecreto && contador < 10);
	

		Teclado.close();
	}

}
