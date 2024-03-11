package Ejercicios2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		/*Realizar un programa que dada una medida de tiempo expresada en horas,
		 *minutos y segundos con valores arbitrarios, elabore un programa que
		 *transforme dicha medida en una expresión correcta.
		 */
		//----- VARIABLES ------
		int h;
		int min;
		int seg;

		System.out.println("Deme h, min y seg y le dare las h min y seg ajustados");

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Deme h");
		h = Teclado.nextInt();

		System.out.println("Deme min");
		min = Teclado.nextInt();

		System.out.println("Deme seg");
		seg = Teclado.nextInt();

		if(seg >= 60) //si tenemos mas de 60 seg
		{
			min = ((seg / 60)+ min);	//sacamos los segundos de 60 en 60 como minutos		
			seg = seg % 60;				//obtenemos los segundos sobrantes

		}

		if (min >= 60) //si tenemos mas de 60 min
		{
			h= ((min / 60)+ h);//sumamos a las horas los minutos q pasen de 60
			min = min % 60;	   //y obtenemos los minutos sobrantes
		}
		
		System.out.println("Son: " + h + "h, " + min + " min "+ seg + " seg");

		Teclado.close();
	}

}
