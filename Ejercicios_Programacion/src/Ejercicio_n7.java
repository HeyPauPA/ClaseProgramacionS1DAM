import java.util.Scanner;

public class Ejercicio_n7 {

	public static void main(String[] args) {
		/*Prepara un programa que pide por teclado tres números y nos dice si
		están ordenados o no.*/
		
		//--- VARIABLES ---
		int numeroDado1;
		int numeroDado2;
		int numeroDado3;
					
		//Pregunta
		System.out.println("Dime 3 numeros y te dire si estan en orden o no");
				
		//lectura de teclado
		Scanner Teclado = new Scanner(System.in);
		
		numeroDado1 = Teclado.nextInt();
		numeroDado2 = Teclado.nextInt();
		numeroDado3 = Teclado.nextInt();
		
		if((numeroDado1 <= numeroDado2) && (numeroDado2 <= numeroDado3)) //solo para crecientes
		{
			System.out.println("los numeros estan ordenados");
		}
		else 
		{
			System.out.println("los numeros no estan en orden");
		}
		
		Teclado.close();
	}

}
