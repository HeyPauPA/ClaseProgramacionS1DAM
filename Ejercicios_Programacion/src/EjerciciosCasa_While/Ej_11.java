package EjerciciosCasa_While;

public class Ej_11 {

	public static void main(String[] args) 
	{
//		Programa que visualice en la pantalla la siguiente figura:
		
//		      *
//			* * *
//		  * * * * * 
//	    * * * * * * *
//		  * * * * *
//		    * * *
//		      *
		
		//repetimos por 5 filas
		for (int j = 1; j < 5; j++) 
		{
			//impresion de espacios
			for (int i = j; i < 6; i++) 
			{
				System.out.print(" ");	
			}
			
			//impresion de asteriscos
			for (int i = 0; i < j ; i++) 
			{
				System.out.print(" *");	
			}
			//cambio de linea
			System.out.println("");
		}
		
		for (int j = 1; j < 6; j++) 
		{
			//impresion de espacios ( )
			for (int i = 0; i < j ; i++) 
			{
				System.out.print(" ");	
			}
			
			//impresion de asteriscos (*)
			for (int i = j; i < 6; i++) 
			{
				System.out.print(" *");	
			}
			//cambio de linea (INTRO)
			System.out.println("");
			
		}
	}

}
