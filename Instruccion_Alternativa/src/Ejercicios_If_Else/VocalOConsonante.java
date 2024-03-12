package Ejercicios_If_Else;

import java.util.Scanner;

public class VocalOConsonante {

	public static void main(String[] args) 
	{
		System.out.println("Dame una letra para comprobar si es vocal o consonante");

		char letra; 

		Scanner Teclado = new Scanner(System.in);

		letra = Teclado.nextLine().charAt(0);

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E'|| letra == 'i'
				|| letra == 'I'|| letra == 'o'|| letra == 'O'|| letra == 'u'|| letra == 'U') 
		{
			System.out.println("Es una vocal");
		}
		else 
			System.out.println("Es una consonante");
		
		Teclado.close();
	}

}
