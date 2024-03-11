package EjerciciosCasa_While;

import java.util.Scanner;

public class Ej_10 {

	public static void main(String[] args) 
	{
		//		Calcular todos los números de tres cifras tales que la suma de los cubos de las
		//		cifras es igual al valor del número. (Dado el 153 entonces 13+53+33=153).
		//		Da como salida: 153 370 371 407

		int primerDigito;
		int segundoDigito;
		int tercerDigito;

		for (int i = 100; i < 999; i++) 
		{
			primerDigito = i / 100;
			segundoDigito = i / 10 - (primerDigito * 10);
			tercerDigito = i % 10;

			if( ( (Math.pow(primerDigito, 3)) + (Math.pow(segundoDigito, 3)) + (Math.pow(tercerDigito, 3)) ) == i)
			{
				System.out.println("El numero " + i +" es perfecto");
			}
		}
		
		
	}

}
