package Multiples;

import java.util.Scanner;

public class EstadoCivilSwich2 {

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
		
		switch (letra) {
		case 's', 'S': System.out.println("Solter@");
		break;
		
		case 'c','C': System.out.println("Casad@");
		break;

		case 'v' ,'V': System.out.println("Viud@");
		break;
		
		case 'd','D': System.out.println("Divorciad@");
		break;
		
		default:
			System.out.println("Ese estado civil no existe");
		break;
		}
		
		Teclado.close();

		}
	}
	
