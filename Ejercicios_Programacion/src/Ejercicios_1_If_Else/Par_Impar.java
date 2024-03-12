package Ejercicios_1_If_Else;
import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) 
	{
		//pedir un numero y saber si es par o impar
		int numeroDado;

		Scanner Teclado = new Scanner(System.in);

		numeroDado = Teclado.nextInt();

		if ((numeroDado % 2) == 0) 
		{
			System.out.println("el numero"+ numeroDado + "es par");
			
		} else 
		{
		    System.out.println("El numero"+ numeroDado + "es impar");
		}
		Teclado.close();
	}

}
