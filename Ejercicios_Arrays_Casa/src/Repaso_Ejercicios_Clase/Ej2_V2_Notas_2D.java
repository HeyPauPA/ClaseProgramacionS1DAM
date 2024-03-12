package Repaso_Ejercicios_Clase;

import java.util.Iterator;

public class Ej2_V2_Notas_2D {

	public static void main(String[] args) 
	{
		// Preparar un array con las notas de las 3 evaluaciones
		
				//Tendríamos 7 notas por 3 evaluaciones, en total 21 notas

				int[][] notas = { {8, 5, 3, 7, 9, 5, 10}, 
						          {7, 6, 2, 4, 8, 6, 9},
						          {9, 8, 4, 5, 9, 6, 9}};
				
				int cuentaAprovados = 0;
				double notaMedia = 0;
				double suma=0;
				
				//Contar cuantos aprobados hay
				for (int i = 0; i < notas.length; i++) 
				{
					for (int j = 0; j < notas[i].length; j++) 
					{
						if(notas[i][j] >= 5) 
						{
							cuentaAprovados++;
						}
					}
				}
				System.out.println("El numero de aprovados es: " + cuentaAprovados);
				
				/*
				 * Media de cada evaluación
				 *  	Media 1ªEv: 6.7
				 *   	Media 2ªEv: 6
				 *    	Media 3ªEv: 7.14
				 */
				
				for (int i = 0; i < notas.length; i++) 
				{
					for (int j = 0; j < notas[i].length; j++) 
					{
						suma= suma + notas[i][j];
						notaMedia = suma/notas[i].length; 
					}
					System.out.println("La media de la " + (i+1) +"º EV es: "+ notaMedia);
					suma=0;
					notaMedia=0;
				}
				
				/*
				 * Media de cada módulo
				 * 		Módulo 1: 7.0
				 * 		Módulo 2: 6.8
				 * 		....
				 * 		Modulo 7: 8.3
				 */
				
				
				String[] modulos = {"Leng.Marcas", "Inglés", "Programación", "BBDD", "FOL", "Sistemas","Ingles"};
				
				for (int j = 0; j < notas[0].length; j++) 
				{
					suma= 0;
					notaMedia=0;
					
					for (int i = 0; i < notas.length; i++) 
					{
						suma = notas[i][j] + suma;
					}
					notaMedia = suma/(notas.length);
					System.out.println("La media del modulo " + modulos[j] + " es: " + notaMedia);
				}
				
				String[] evaluaciones = {"1ªEv", "2ªEv", "3ªEv" };
				
				 /* Aprobados por evaluación
				 * 		1ªEv: 6
				 * 		2ªEv: 5
				 * 		3ªEv: 6
				 */
				int sumaAprovados= 0;
				
				for (int i = 0; i < notas.length; i++) 
				{
					for (int j = 0; j < notas[i].length; j++) 
					{
						if(notas[i][j] >= 5) {
							sumaAprovados++;
						}
					}
					System.out.println("El numero de aprovados de la " + evaluaciones[i] +" es: "+ sumaAprovados);
					sumaAprovados = 0;
				}
				
				
				/*
				 * Aprobados en cada módulo
				 * 		Módulo 1: 3
				 * 		Módulo 2: 1
				 * 		Módulo 3: 0
				 * 		...
				 * 		Módulo 7: 3
				 */
				
				System.out.println("Aprobados en cada módulo");
				for (int j = 0; j < notas[0].length; j++)
				{
					sumaAprovados = 0;
					for (int i = 0; i < notas.length; i++)  
					{
						if (notas[i][j] >= 5) {
							sumaAprovados++;
						}
					}
					System.out.println("Módulo " + modulos[j] + ": " + sumaAprovados);
				}
				
			
	}
	

}
