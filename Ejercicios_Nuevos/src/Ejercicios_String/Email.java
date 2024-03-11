package Ejercicios_String;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) 
	{

		//	Hacer un programa q sea el correo y vea si esta bien escrito	
		//		
		//		javier@ies-azarquiel.es
		//		
		//		existe @
		//		minimo 4 letras en el nombre
		//		en el dominio habra un punto
		//		acaba en "es" o "com"

		String email = "";

		Scanner teclado = new Scanner(System.in);

		email = teclado.nextLine();
		
		
		int posArroba = email.indexOf("@");
		String nombreEmail = email.substring(0,posArroba);


		if(posArroba == -1) //comprobar q hay arroba
		{
			System.out.println("Error: Falta el @ en el email");
		}
		else if(posArroba == 4) //comprobar si el nombre tiene minimo 4 letras
		{
			System.out.println("Error: No hay campo suficiente antes del @ en el email");
		}
		else if(nombreEmail == null) { //probar q hay nombre antes del @
			System.out.println("Error: No se escribio nombre de correo");
		}
		else if (email./*substring(posArroba + 1).*/indexOf(".") == -1) //comprobar si existe un punto despues de @
		{
			System.out.println("Error: falta el punto");
		}
		else if (email.endsWith("es") == false || email.endsWith("com") == false) //comprobar si tiene .com o .es
		{
			System.out.println("Error: falta el dominio >com< o >es<");
		}
		
		else
			System.out.println("Su correo: " + email + " es correcto");
	}

}
