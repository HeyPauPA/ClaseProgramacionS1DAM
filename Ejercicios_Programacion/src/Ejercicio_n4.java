import java.util.Scanner;

public class Ejercicio_n4 {

	public static void main(String[] args) {
		/*Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
		pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
		gravedad en de 9.8, mientras que en la Luna es de 1.62 */
		
		//---- VARIABLES ----
					
		final float GTIERRA = 9.8f;
		final float GLUNA = 1.62f;
		
		float pesoDado;
		float masa;
		float pesoLuna;
		
		//Funcion para leer lo escrito por el teclado
		Scanner Teclado = new Scanner(System.in);
				
		//---- CODIGO ----
		//informamos sobre lo q pedimos
				
		System.out.println("Danos tu peso y te diremos cuanto pesarias en la luna");
				
		//leemos el peso
				
		pesoDado = Teclado.nextFloat();
		
		masa = pesoDado / GTIERRA;

		pesoLuna = masa * GLUNA;

		System.out.println("Tu peso en la luna seria: " + pesoLuna + " kg");

		Teclado.close();
	}

}
