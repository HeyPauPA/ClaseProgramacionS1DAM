package Ejercicios_5_While;

import java.util.Scanner;

public class SumarNumeros_HastaPoner0 {

	public static void main(String[] args) 
	{
		// Pediremos numeros y los sumaremos hasta q tecleemos un 0
		//----- VARIABLES ------
		int num;
		int suma = 0;
		
		System.out.println("Deme numeros hasta q ponga 0 y los sumare");
		Scanner Teclado = new Scanner(System.in);

		do
		{
			System.out.println("Deme otro numero");
			num = Teclado.nextInt();
			
			suma += num;
			//suma = suma + num;
		}
		while (num !=0); 

		System.out.println("La suma es" + suma);

		Teclado.close();
	}

}
