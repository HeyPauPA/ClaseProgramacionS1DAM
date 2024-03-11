package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class apuntes_2 {

	public static void main(String[] args) 
	{ //probar las posibles excepciones que se producen en euna division
		
		/*
		 * Bloque try/catch
		 * 
		 * try{
		 * //aqui ponemos las intrucciones que querremos probar
		 * }catch (Excepcion e){
		 * //aqui la solucion a la excepcion en aso de q se produzca
		 * }
		 * 
		 * se puede llamar con clickderecho + surround by → try/catch
		 */
		
		
		try {
			Scanner teclado = new Scanner(System.in);
			int a,b;

			System.out.println("Teclea el dividendo: ");
			a = teclado.nextInt();

			System.out.println("Teclea el divisor: ");
			b = teclado.nextInt();

			System.out.println("la division es: " + a/b);
			}  
				catch (InputMismatchException e) 
				{
					System.out.println("No has escrito bien el dato");
				}  
				catch (ArithmeticException e) 
				{
					System.out.println("No puedo dividir entre 0");
				}
				  catch (Exception e) //aqui cubro todas las posibles excepciones
				{ 
					System.out.println("No se que ha pasado");
				}

		

	}
}
