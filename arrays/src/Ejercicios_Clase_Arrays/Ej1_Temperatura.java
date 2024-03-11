package Ejercicios_Clase_Arrays;

public class Ej1_Temperatura {

	public static void main(String[] args) 
	{
		//quiero calcular la temperatura media de la semana

		//crear un array con las temperaturas de la semana
		double[] temperaturas = {14, 12, 13.4, 16, 11, 14.6, 15}; //almaceno la informacion y trabajo con esa informacion


		double fechaMax = 0;
		double fechaMin = 0;
		
		double suma = 0;
		double media= 0;

		for (int i = 0; i < temperaturas.length; i++) 
		{
			suma = (temperaturas[i]) + suma;
		}

		media = suma/temperaturas.length; 

		System.out.println("La media de temperaturas es: " + media);

		//Averiguar la temperatura maxima
		double max= temperaturas[0];// de momento es la primera cifra

		for (int i = 0; i < temperaturas.length; i++) 
		{
			if(temperaturas[i] >max) {
				max = temperaturas[i];
				fechaMax = i;
			}
		}

		//		for (int i = 0; i < temperaturas.length; i++) 
		//		{
		//			temperaturas[i] = primero;
		//			
		//			if(primero > segundo ) 
		//			{
		//				max = primero;
		//				segundo = primero;
		//				primero = 0;
		//			}
		//		}

		//averiguar la fecha con mas calor
		System.out.println("la temperatura max: " + max + "º");

		//forma de decir el dia con un switch
		switch ((int)(fechaMax)) {
		case 0:
			System.out.println("El dia con la temperatura mas alta es Lunes");
			break;
		case 1:
			System.out.println("El dia con la temperatura mas alta es Martes");
			break;
		case 2:
			System.out.println("El dia con la temperatura mas alta es Miercoles");
			break;
		case 3:
			System.out.println("El dia con la temperatura mas alta es Jueves");
			break;
		case 4:
			System.out.println("El dia con la temperatura mas alta es Viernes");
			break;
		case 5:
			System.out.println("El dia con la temperatura mas alta es Sabado");
			break;
		case 6:
			System.out.println(" El dia con la temperatura mas alta es Domingo");
			break;
		default:
			break;
		}

		//averiguar la fecha con menos temperatura
		double min= temperaturas[0];// de momento es la primera cifra
		
		for (int i = 0; i < temperaturas.length; i++) 
		{
			if(temperaturas[i] < min) {
				min = temperaturas[i];
				fechaMin = i;
			}
		}
		
		System.out.println("El dia con la temperatura mas fria es el : " + fechaMin);
		String[] dias = {"Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado", "Domingo"};
		System.out.println("El dia con la temperatura mas fria es el : " + dias[(int) fechaMin]);

	}

}
