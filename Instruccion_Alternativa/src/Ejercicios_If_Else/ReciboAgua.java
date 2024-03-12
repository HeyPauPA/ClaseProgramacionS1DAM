package Ejercicios_If_Else;

import java.util.Scanner;

public class ReciboAgua {

	public static void main(String[] args) 
	{
		/*calcular el precio del recibo del agua
		*Pedimos por teclado los metros cúbicos que hemos consumido y calculamos el precio
		*Hasta 10 m3 a 1€ cada uno
		*de 11 a 20 m3 a 4€ cada uno
		*mas de 20 a 10€
		*/
		
		System.out.println("Dime cuanto m3 q has consumido y calculare el precio");
		
		int m3;
		int precio = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		m3 = teclado.nextInt();
		
		if(m3 <= 10) 
		{
			precio = m3;
		}
		else if (m3 > 11 && m3 <= 20)
		{
			precio = ((m3 - 10)* 4) + 10;
		}
		else if (m3 > 20)
		{
			precio = precio + ((m3 - 20)* 10) + 40 + 10;
		}
		
		System.out.println("El precio es: " + precio + "€");
		
		teclado.close();
	}

}
