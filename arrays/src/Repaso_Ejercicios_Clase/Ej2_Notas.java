package Repaso_Ejercicios_Clase;

public class Ej2_Notas {

	public static void main(String[] args) 
	{
		// Trabajo con dos arrays simultaneos

		int[] notas = {8, 6, 10, 3, 5, 7};
		String[] modulos = {"Leng.Marcas", "Inglés", "Programación", "BBDD", "FOL", "Sistemas"};

		int mayor= 0;
		int mayorPuesto= 0;

		double media;
		int suma = 0;

		/*Listado de módulos aprobados

		  Módulos aprobados:
		  		Leng.Marcas
		  		Inglés
		  		Programación
		  		...
		 */

		System.out.println("Modulos aprobados: ");
		for (int i = 0; i < notas.length; i++) 
		{
			if(notas[i] >= 5) 
			{
				System.out.println(" ·" + modulos[i]);
			}
		}

		/*Módulo favorito el que tenga la nota mas alta

		  Módulo favorito
		  Programación

		 */
		System.out.println("Modulos favoritos: ");
		for (int i = 0; i < notas.length; i++) 
		{
			if(notas[i] > mayor) 
			{
				mayor= notas[i];
				mayorPuesto = i;
			}
		}
		System.out.println(" ·" + modulos[mayorPuesto]);

		/* Módulos por encima de la media
		  
		   		Módulos por encima de la media
		  		Leng.Marcas
		  		Programación
		  		Sistemas
		 */
		
		for (int i = 0; i < notas.length; i++) 
		{
			suma += notas[i];
		}
		media = (double)suma / notas.length;
		
		System.out.println("Módulos por encima de la media: " + media );
		
		for (int i = 0; i < notas.length; i++) 
		{
			if (notas[i] > media) 
			{
				System.out.println(" ·" +modulos[i]);
			}
		}
	}

}
