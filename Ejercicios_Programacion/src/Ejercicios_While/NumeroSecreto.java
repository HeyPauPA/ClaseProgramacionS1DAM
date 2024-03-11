package Ejercicios_While;

import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) 
	{

		// Pedir numero hasta q adivinemos el numero secreto
		//----- VARIABLES ------
		int num;
		int numeroSecreto = (int)(Math.random()*10);

		System.out.println("Acierta el numero secreto");
		Scanner Teclado = new Scanner(System.in);

		do 
		{
			num = Teclado.nextInt();
			
			if (num !=numeroSecreto) 
			{
				System.out.println("No has acertado");	
			}
		}
		while (num !=numeroSecreto);
	

		System.out.println("Acertaste, el numero era: " + numeroSecreto);

		Teclado.close();
	}

}
