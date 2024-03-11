import java.util.Scanner;

public class Ejercicio_n9 {

	public static void main(String[] args) {
		/*Prepara un programa que pide por teclado un número entero entre 0 y 99999, y lo escribe del revés.
							Teclea un número: 65741
							Del revés es: 14756                       */
		//--- VARIABLES ---
		int numeroDado;
		int resto;
		int inverso = 0;

		//Pregunta
		System.out.println("Dame un numero y lo escribire del reves");

		//lectura de teclado
		Scanner Teclado = new Scanner(System.in);

		numeroDado = Teclado.nextInt();

		while(numeroDado > 0) 
		{
			resto = numeroDado % 10;			//para cojer el ultimo digito ej:673 --> 3     
			numeroDado = numeroDado / 10;      //para cojer los numeros siguientes ej:673 --> 67
			inverso = inverso *10 + resto;     //para sumar los digitos
		}
		System.out.println("El inverso es: " + inverso);
		Teclado.close();	
	}

}
