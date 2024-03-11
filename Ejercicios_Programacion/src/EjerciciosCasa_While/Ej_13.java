package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_13 {

	public static void main(String[] args) 
	{
		
//		Programa que obtenga el minimo comun multiplo(mcm) de dos numeros-
//		Ejemplo: descomponemos los numeros en sus factores 10 (2 * 5) y 18 (2 * 9)
//		entonces el mcm es (2 * 5 * 9).
//		Introduciendo: 10 18
//		Da como salida: 90
		
		int numDado;
		int numDado2;
		int factor=2;
		int factor2 =2;
		int multiplicacionFactores = 1;
		int multiplicacionFactores2 = 1;

		Scanner Teclado = new Scanner(System.in);

		System.out.println("deme 2 numeros y dare el mcm");

		System.out.println("Primer numero");
		numDado = Teclado.nextInt();

		System.out.println("Segundo numero");
		numDado2 = Teclado.nextInt();
		
		
		while (numDado != 1) 
		{
			if((numDado%factor) == 0) 
			{
				System.out.println(factor + "Primer numero");
				numDado = numDado/factor;
				multiplicacionFactores = multiplicacionFactores * factor;
			}
			else
				factor++;
			
		}
		while (numDado2 != 1) 
		{
			if((numDado2 % factor) == 0) 
			{
				System.out.println(factor + "Segundo numero");
				numDado2 = numDado2/factor;
				multiplicacionFactores2 = multiplicacionFactores2 * factor2;
			}
			else
				factor2++;
		}

		System.out.println("El mcm" + multiplicacionFactores * multiplicacionFactores2);
		Teclado.close();
	}

}
