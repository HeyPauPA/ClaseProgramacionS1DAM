package Ejercicios_If_Else;
import java.util.Scanner;

public class MayorDel2 {

	public static void main(String[] args) 
	{

		//pedir un numero y saber si es par o impar
		int numeroDado1;
		int numeroDado2;

		Scanner Teclado = new Scanner(System.in);

		numeroDado1 = Teclado.nextInt();
		numeroDado2 = Teclado.nextInt();
		
		if (numeroDado1 < numeroDado2) 
		{
			System.out.println("el numero "+ numeroDado1 + "es menor q el numero " + numeroDado2);

		} else if (numeroDado1 > numeroDado2)
		{
			System.out.println("el numero "+ numeroDado1 + "es mayor q el numero " + numeroDado2);
		}
		else if(numeroDado1 == numeroDado2) 
		{
			System.out.println("Ambos numeros son iguales");	
		}
		Teclado.close();
		
	}

}
