package Package;

import java.util.Scanner;

public class MayorDe3 {

	public static void main(String[] args) 
	{
		System.out.println("deme 3 numeros para comprobar cual es mayor de los 3");

		//pedir un numero y saber si es par o impar
		int numeroDado1;
		int numeroDado2;
		int numeroDado3;

		Scanner Teclado = new Scanner(System.in);

		numeroDado1 = Teclado.nextInt();

		System.out.println("deme otro numero");
		numeroDado2 = Teclado.nextInt();

		System.out.println("deme otro");
		numeroDado3 = Teclado.nextInt();


		if (numeroDado1 > numeroDado2 && numeroDado1 > numeroDado3) 
		{
			System.out.println("el numero "+ numeroDado1 + " es mayor q el numero: " + numeroDado2 + " y al numero: " + numeroDado3);
		} 
		else if (numeroDado2 > numeroDado1 && numeroDado2 > numeroDado3) 
		{
			System.out.println("el numero "+ numeroDado2 + " es mayor q el numero: " + numeroDado1 + " y el numero: " + numeroDado3);
		}
		else if (numeroDado3 > numeroDado1 && numeroDado3 > numeroDado2) 
		{
			System.out.println("el numero "+ numeroDado3 + " es mayor q el numero: " + numeroDado1 + " y el numero: " + numeroDado2);
		}
		else if(numeroDado1==numeroDado2 && numeroDado2 == numeroDado3) 
		{
			System.out.println("los 3 numeros son iguales");	
		}

		Teclado.close();

	}

}
