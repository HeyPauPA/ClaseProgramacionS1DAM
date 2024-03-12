package Ejercicios_4_For;

public class Apuntes_For {

	public static void main(String[] args)
	{
		//  Bucle for, bucle en el que conocemos el numero de veces q se dara vuelta
		
		// for(inicializacion, condicion de final(mientras), incremento/decremento)
		
		
		for(int i = 0; i < 4; i++) 
		{
			System.out.println("Holaa");
		}
		
		//imprimir la vuelta por la q voy
		for(int i = 0; i < 4; i++) 
		{
			System.out.println("vuelta "+ i);
		}
		
		//contar del reves
		for(int i = 0; i > -4; i--) 
		{
			System.out.println("vuelta "+ i);
		}
		
		//contar de 2 en 2 
		for(int i = 0; i < 10; i = i+ 2) 
		{
			System.out.println("vuelta "+ i);
		}
	}

}
