package Ejercicios_Switch;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {

		System.out.println("Introduce un numero del mes y te dire cuantos dias tiene");

		int nMes;

		Scanner Teclado = new Scanner(System.in);

		nMes = Teclado.nextInt();

		/*switch (nMes) {

		//ENERO
		case 1:	System.out.println("Enero tiene 31 dias");		
			break; 

		//FEBRERO
		case 2:	System.out.println("Febrero tiene 28 o 29 dias");		
			break; 

		//MARZO
		case 3:	System.out.println("Marzo tiene 31 dias");		
			break;

		//ABRIL
		case 4:	System.out.println("Abril tiene 30 dias");		
			break;

		//MAYO
		case 5:	System.out.println("Mayo tiene 31 dias");		
			break;

		//JUNIO
		case 6:	System.out.println("Junio tiene 30 dias");		
			break;

		//JULIO
		case 7:	System.out.println("Julio tiene 31 dias");		
			break;

		//AGOSTO
		case 8:	System.out.println("Agosto tiene 31 dias");		
			break;

		//SEPTIEMBRE
		case 9:	System.out.println("Septiembre tiene 30 dias");		
			break;

		//OCTUBRE
		case 10: System.out.println("Octubre tiene 31 dias");		
			break;

		//NOVIEMBRE
		case 11: System.out.println("Noviembre tiene 30 dias");			
			break;

		//DICIEMBRE
		case 12: System.out.println("Diciembre tiene 31 dias");			
			break;

		default:
			break;
		}*/

		//FORMA 2

		switch (nMes) {

		case 1,3,5,7,8,10,12:	System.out.println("Enero tiene 31 dias");		
		break; 

		case 2:	System.out.println("Marzo tiene 28 dias");		
		break;
		
		case 4,6,9,11:	System.out.println("tiene 30 dias");		
		break; 

		default: System.out.println("Ese mees no existe");
		break;
		}
		 Teclado.close();
	   }
	}
