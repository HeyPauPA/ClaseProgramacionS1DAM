package Repaso_Ejercicios_Clase;

import java.util.Iterator;

public class Ej1_Temperaturas {

	public static void main(String[] args) 
	{
		// Crear un Array con las temperaturas de la semana
		double[] temperaturas = {14, 12, 13.4, 16, 11, 14.6, 15};
		double suma = 0;
		double media= 0;	
		double mayor=0;
		double menor= temperaturas[1];
		
//		//calcular la temperatura media de la semana
//		
//		for (int i = 0; i < temperaturas.length; i++) 
//		{
//			suma = temperaturas[i] +suma;
//		}
//		
//		media= suma/temperaturas.length;		
//		System.out.println("La media es: " + media);
		
		//v2 → con foreach
		for (double temperatura : temperaturas) 
		{
			suma= suma + temperatura;
		}
		media= suma/temperaturas.length;		
		System.out.println("La media es: " + media);
		
		//Averiguar la temperatura máxima
		for (int i = 0; i < temperaturas.length; i++) 
		{
			if (mayor < temperaturas[i]) 
			{
				mayor = temperaturas[i];
			}
		}
		
		System.out.println("El mayor es: " + mayor);
		
		//Averigura que día fue la temperatura mínima
		for (int i = 0; i < temperaturas.length; i++) 
		{
			if (menor > temperaturas[i]) 
			{
				menor = temperaturas[i];
			}
		}
		System.out.println("La minima es: " + menor);
		
	}

}
