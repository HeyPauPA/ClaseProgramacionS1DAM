package Ejercicios_Casa;

import java.util.Scanner;

public class Ej_3_ConsultarNombresYDirecciones {

	public static void main(String[] args) 
	{	
//		Crea una agenda para almacenar nombres y direcciones de N personas. Después
//		haz un programa que permita ir consultando el nombre y la dirección de las
//		personas almacenadas.
		
		String[][]datos= {
				          {"maria", "calle madrid, 5"},
				          {"marcos", "calle malaga, 8"}
				         };
		
		Scanner teclado = new Scanner(System. in);
		System.out.print("¿A quien buscas? : " ) ;
		String nombreABuscar = teclado.nextLine();
		
		boolean EstaElNombre= false;
		
		for (int i = 0; i < datos.length; i++) 
		{
				if(nombreABuscar.equalsIgnoreCase(datos[i][0])) 
				{
					System.out.println( "Su dirección es: " + datos[i][1]);
					EstaElNombre = true;
				}

		}
		
		if (EstaElNombre == false) 
		{
			System.out.println( "Su dirección no aparece");
		}
	}

}
 