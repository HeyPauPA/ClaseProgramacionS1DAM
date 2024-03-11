import java.util.Scanner;

public class Ejercicio_n8 {

	public static void main(String[] args) {
		/*Crea un programa que pida cual es el radio de una circunferencia y nos
		calcule cual es la longitud y el área.*/
		
		// A = PI * r^2
		// L= 2*PI * r
		
		//--- VARIABLES ---
		float PI= 3.14f;
		
		float radio;
		float longitud;
		float area;
							
		//Pregunta
		System.out.println("dame el radio de un circulo y te dare al area y la longitud");
						
		//lectura de teclado
		Scanner Teclado = new Scanner(System.in);
			
		radio = Teclado.nextInt();
		
		area = PI * (radio * radio);
		
		longitud = 2* PI * radio;

		System.out.println("el area es: " + area + "y la longitud: " + longitud);
		
		Teclado.close();
	}

}
