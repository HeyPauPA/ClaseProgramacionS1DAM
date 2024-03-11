package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class apuntes_1 {

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
		
		
		Scanner teclado = new Scanner(System.in);
		int a,b;
		
		System.out.println("Teclea el dividendo: ");
		try {
			a = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("No has escrito bien el dato, se pondra por defecto 1");
			a=1;
		}

		System.out.println("Teclea el divisor: ");
		try {
			b = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("No has escrito bien el dato, se pondra por defecto 1");
			b=1;
		}
	

		try {
			System.out.println("la division es: " + a/b);
		} catch (ArithmeticException e) {
			System.out.println("No puedo dividir entre 0");
		}
	}
}
