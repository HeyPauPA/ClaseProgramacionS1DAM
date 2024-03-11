import java.util.Scanner;

public class Ejercicio_n6 {

	public static void main(String[] args) {
		/*Realiza un programa que cuando un cliente de un banco quiere sacar una cantidad de dinero
		  de su cuenta, calcule cuantos billetes tenemos que darle. 
		  Siempre calcularemos la mínima cantidad de billetes.*/

		//--- VARIABLES ---
		int dineroTotal;
		int b500,b200,b100,b50,b20,b10,b5;
		int resto;

		//Pregunta
		System.out.println("Dime cuanto dinero tienes y te dare los billetes necesarios");

		//lectura de teclado
		Scanner Teclado = new Scanner(System.in);

		dineroTotal = Teclado.nextInt();

		// ------ billetes ------

		/*500€*/ 
		b500 = dineroTotal/ 500;
		System.out.println("Billetes de 500€: " + b500 );
		resto = dineroTotal % 500;

		/*200€*/ 
		b200 = resto/ 200;
		System.out.println("Billetes de 200€: " + b200 );
		resto = dineroTotal % 200;

		/*100€*/ 
		b100 = resto/ 100;
		System.out.println("Billetes de 100€: " + b100 );
		resto = dineroTotal % 100;

		/*50€*/  
		b50 = resto/ 50;
		System.out.println("Billetes de 50€: " + b50 );
		resto = dineroTotal % 50;

		/*20€*/  
		b20 = resto/ 20;
		System.out.println("Billetes de 20€: " + b20 );
		resto = dineroTotal % 20;

		/*10€*/  
		b10 = resto/ 10;
		System.out.println("Billetes de 10€: " + b10 );
		resto = dineroTotal % 10;

		/*5€*/   
		b5 = resto/ 5;
		System.out.println("Billetes de 5€: " + b5 );
		resto = dineroTotal % 5;

		Teclado.close();
		
		//---------------------
		
	}

}
