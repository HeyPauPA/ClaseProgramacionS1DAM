package EjerciciosCasa_While;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class Ej_6 {

	public static void main(String[] args) 
	{
//		Realizar un programa que calcule la potencia de un numero an . La potencia se
//		hará por medio de multiplicaciones, está prohibido usar Math.pow().
//		si n es mayor que cero se hará una potencia normal
//		1
//		si n es menor que cero se hará a n
//		y si n cero la solución será 1
		
		int base;
		int exponente;
		int multiplicacion = 1;
		int acumuladorM = 1;
		

		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme un la base, el exponente y calculare la potencia");
		
		System.out.println("Base");
		base = Teclado.nextInt();
		
		System.out.println("Exponente");
		exponente = Teclado.nextInt();
		
		if(exponente > 0) 
		{
			for (int i = 0; i < exponente; i++) 
			{
				multiplicacion = multiplicacion * base;
			}
		}
		else if(exponente < 0) 
		{
			for (int i = exponente; i < 0; i++) 
			{
				acumuladorM = acumuladorM * base;
				multiplicacion = 1/acumuladorM;
			}
		}
		else if(exponente == 0) 
		{
			multiplicacion = 1;
		}
		
		System.out.println("La solucion es " + multiplicacion );
	
		Teclado.close();

	}

}
