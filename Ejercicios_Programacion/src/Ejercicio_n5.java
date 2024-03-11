import java.util.Scanner;

public class Ejercicio_n5 {

	public static void main(String[] args) {
		/*Realiza un programa que nos pida cuantos segundos duró un concierto,
		y nos calcule cuantas horas, minutos y segundos son.*/
		//1 min --> 60 seg
		//   1h --> 60 min

		//--- VARIABLES ---
		int segundosDados;
		int minCalculados;
		int horasCalculados;

		int segSobrantes;
		int minSobrantes;

		//Pregunta
		System.out.println("Dime segundos y te dire las h, min y seg de ello");

		//lectura de teclado
		Scanner Teclado = new Scanner(System.in);

		//--------- calculo horas --------
		segundosDados = Teclado.nextInt();

		minCalculados = segundosDados / 60; /* SE PUEDE OPTIMIZAR --> dividiendo los segundos 
											por 3600 en vez de tener una variable extra*/

		horasCalculados = minCalculados / 60;

		//-------- calculo extras ---------
		segSobrantes = segundosDados % 60;

		minSobrantes = minCalculados % 60;

		System.out.println("la duracion es: " + horasCalculados + " h " + minSobrantes + " min " + segSobrantes + " seg ");

		System.out.printf("la duracion es: a %02d: %02d: %02d:", horasCalculados, minSobrantes, segSobrantes); /*%d es poner los datos ahi, %02d significa q el dato q ponemos alli va a 
																											   ser de 2 numeros y en caso de ser de 1 pone un 0 */
		
		Teclado.close();	
	}

}
