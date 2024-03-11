import java.util.Scanner;

public class Ejercicio_n2 {

	public static void main(String[] args) {
		/* Diseña un programa que indique si un número pasado por teclado es
		múltiplo de siete o no.*/
		
		//---- VARIABLES ----
		
		int numeroDado;
		
		//Funcion para leer lo escrito por el teclado
		Scanner Teclado = new Scanner(System.in);
		
		//---- CODIGO ----
		//informamos sobre lo q pedimos
		
		System.out.println("Danos un numero y si es multiplo de 7 se te dira");
		
		//leemos el numero
		
		numeroDado = Teclado.nextInt();
		
		if((numeroDado %7) == 0) 
		{
			System.out.println("El numero es multiplo de 7");
		}
		else 
		{
			System.out.println("El numero no es multiplo de 7");
		}
		
			Teclado.close();
	}
}
