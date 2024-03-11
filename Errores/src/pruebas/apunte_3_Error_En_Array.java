package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class apunte_3_Error_En_Array {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int []temperaturas = {15,16,13,12,15,14,18};
	
		try 
		{
			System.out.println("¿Que dia quieres consultar(1-7)?: ");

			int dia = teclado.nextInt();

			System.out.println("La temperatura ese dia fue: " + temperaturas[dia-1]);
		} 
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println("Ese dato no sirve");
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Pido un numero");
		}
		catch (Exception e) 
		{
			System.out.println("No se que fallo");
		}
		finally 
		{
			System.out.println("Fin del programa");
			//esto se hace siempre, con errores o sin ellos
		}
	}

}
