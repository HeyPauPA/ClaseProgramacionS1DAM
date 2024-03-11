import java.util.Scanner;

public class Ejercicio_n3 {

	public static void main(String[] args) {
		
		/*Programa que permita teclear un número correspondiente a un año y
		calcule y visualice si es bisiesto o no. (Un año es bisiesto si es múltiplo
		de 4 y no es múltiplo de 100 o bien es múltiplo de 400).*/

		//---- VARIABLES ----
		int añoDado;
		
		//indicamos lo q pedimos
		System.out.println("Digame un año y le dire si es biesiesto o no");
		
		//leemos lo dado por teclado
		Scanner InputTeclado = new Scanner(System.in);
		
		//---- CODIGO ----
		añoDado = InputTeclado.nextInt();
		
		if (( ((añoDado % 4) == 0) && ((añoDado % 100) != 0) ) || ((añoDado % 400) == 0)) 
		{
			System.out.println("El año es bisiesto");
		}
		else 
		{
			System.out.println("el año no es bisiesto");	
		}
		
		InputTeclado.close();
		
	}

}
