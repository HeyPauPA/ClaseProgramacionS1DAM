package Ejercicios_If_Else;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) 
	{
    // poner dependiendo de la letra q nos den, el estado civil de la persona
    /* 
     * sS --> Soltero
     * cC --> Casado
     * vV --> Viudo
     * dD --> Divorciado
     * */
		
		System.out.println("deme una letra y le inidcare su estado civil");
		char letra; 

		Scanner Teclado = new Scanner(System.in);

		letra = Teclado.nextLine().charAt(0);
		
		// ---------- FORMA PRIMERA ----------
		
		/*
		if(letra == 's'|| letra == 'S') 
		{
			System.out.println("Solter@");
		}
		else if(letra == 'c'|| letra == 'C') 
		{
			System.out.println("Casad@");
		}
		else if(letra == 'v'|| letra == 'V') 
		{
			System.out.println("Viud@");
		}
		else if(letra == 'd'|| letra == 'D') 
		{
			System.out.println("Divorciad@");
		}
		else
			System.out.println("La letra es incorrecta");
		*/
		
		// ---------- FORMA SEGUNDA ----------
		switch (letra) {
		case 's': System.out.println("Solter@");
		
		break;
		case 'S':System.out.println("Solter@");
		
		break;
		
		case 'c': System.out.println("Casad@");

		break;
		case 'C':System.out.println("Casad@");

		break;

		case 'v': System.out.println("Viud@");

		break;
		case 'V':System.out.println("Viud@");

		break;
		
		case 'd': System.out.println("Divorciad@");

		break;
		case 'D':System.out.println("Divorciad@");

		break;
		
		default:
			System.out.println("Ese estado civil no existe");
		break;
		}
		
		Teclado.close();
	}

}
