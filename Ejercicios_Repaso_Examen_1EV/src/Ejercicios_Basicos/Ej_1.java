package Ejercicios_Basicos;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) 
	{

		//	Hacer un programa q sea el correo y vea si esta bien escrito	
		//		
		//		ej: javier@ies-azarquiel.es
		//		
		//		existe @
		//		minimo 4 letras en el nombre
		//		en el dominio habra un punto
		//		acaba en "es" o "com"

		
		System.out.println("Deme su correo electronico");
		String email = "";

		Scanner teclado = new Scanner(System.in);

		email = teclado.nextLine();
		
		if(email.indexOf("@") == -1) {
			System.out.println("ERROR: No puso @");
		}
		if(email.indexOf("@") < 5) {
			System.out.println("ERROR: No hay sufucientes caracteres en el nombre deben ser min. 4");
		}
		if (email.indexOf(".com")== -1 || email.indexOf(".es")== -1 ) {
			System.out.println("ERROR: No puso el dominio .com o .es");
		}
		else
			System.out.println("Perfecto, su correo es: " + email);
		
	}
	

}
 