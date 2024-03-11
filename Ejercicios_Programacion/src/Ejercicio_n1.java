import java.util.Scanner;

public class Ejercicio_n1 {

	public static void main(String[] args) 
	{
		/*Realiza un programa que nos pregunte la edad y nos diga si somos
		mayores de edad o no. El programa debe escribir en pantalla el
		resultado true o false.*/

		//--- VARIABLES ---
		int edadMayoria = 18;
		int edadDada;

		//Funcion para leer lo escrito por el teclado
		Scanner Teclado = new Scanner(System.in);

		//informamos sobre lo q pedimos

		System.out.println("Danos tu edad y te diremos si eres mayor de edad o no");

		//leemos nuestra edad		
		edadDada = Teclado.nextInt();
		
		if (edadDada >= edadMayoria) 
		{
			System.out.println("Eres mayor de edad");
		}
		else 
		{
			System.out.println("No eres mayor de edad");
		}

		Teclado.close();

	}

}
