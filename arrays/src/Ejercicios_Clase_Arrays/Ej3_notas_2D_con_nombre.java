package Ejercicios_Clase_Arrays;

public class Ej3_notas_2D_con_nombre {

	public static void main(String[] args) 
	{
		int[][]notas ={{8,5,3,7,9,5,10},   //fila1
					   {7,6,2,4,8,6,9},   //fila2
					   {9,8,4,5,9,6,9}};  //fila3

		String[]modulos = {"LM","Ingles","Programacion","BBDD","FOL","SISI","ENDE"}; //nombres de la columna
		String[]evaluaciones = {"1ºEV","2ºEV","3ºEV"}; //nombres de la fila

		//SALGA UN LISTADO DE MODULOS APROBADOS EN CADA EVALUACION

		System.out.println("Modulos aprobados por evaluacion");

		for (int i = 0; i < notas.length; i++) 
		{
			System.out.println("Las notas aprovadas en la "  + evaluaciones[i] + " son de los modulos");
			for (int j = 0; j < notas[i].length; j++) 
			{
				if(notas[i][j] >= 5) 
				{
					System.out.println("·" + modulos[j]);
				}
			}
		}

		//MEDIA DE CADA MODULO

		//Leng.Marcas: 8.0
		//Inglés: 7.3
		//Programación: 3.8
		//...
		//Entornos: 9.4

		System.out.println("Media de cada modulo por separado ");

		float mediaPorModulo = 0;
		float sumaModulos = 0;

		for (int j = 0; j < notas[0].length; j++) 
		{
			mediaPorModulo = 0;
			sumaModulos = 0;

			for (int i = 0; i < notas.length; i++) 
			{
				sumaModulos = notas[i][j] + sumaModulos;
			}
			mediaPorModulo = sumaModulos/ (notas.length);
			System.out.println("la media del modulo " + modulos[j] + " es igual a: " + mediaPorModulo);
		}

		/*
		 * Módulo con mejor media
		 * 
		 * Entornos: 9.4
		 * 
		 */

		System.out.println("CALCULAR EL MODULO CON MAYOR MEDIA");

		float mejorMedia = 0;
		float sumaPorModulo = 0 ;
		float mediaCalculadaModulo = 0;
		int mejorModulo = 0;

		for (int j = 0; j < notas[0].length; j++) 
		{
			mediaCalculadaModulo = 0;
			sumaPorModulo= 0;

			for (int i = 0; i < notas.length; i++) 
			{
				sumaPorModulo = notas[i][j] + sumaPorModulo;
				mediaCalculadaModulo = (sumaPorModulo /3);

				if(mejorMedia < mediaCalculadaModulo) 
				{
					mejorMedia = mediaCalculadaModulo;
					mejorModulo = j;
				}
			}
		}
		System.out.println("La mejor media es la de " + modulos[mejorModulo] + " con una nota de: " + mejorMedia);


		/*
		 * Resultado Final (Si hay alguna evaluación suspensa, queda Pendiente)
		 * 
		 * Leng.Marcas: Aprobado
		 * Inglés: Aprobado
		 * Programación: Pendiente
		 * BBDD: Pendiente
		 * ....
		 * Entornos: Aprobado
		 */

		Boolean aprovado = true;

		for (int j = 0; j < notas[0].length; j++) 
		{
			mediaCalculadaModulo = 0;
			sumaPorModulo= 0;
			aprovado = true;

			for (int i = 0; i < notas.length; i++) 
			{
				sumaPorModulo = notas[i][j] + sumaPorModulo;
				mediaCalculadaModulo = (sumaPorModulo /3);

				if(mediaCalculadaModulo < 5)
				{
					aprovado = false;
				}
			}
			if ( aprovado = false) {
				System.out.println("El modulo " + modulos[j] + " esta suspenso" );
			}
			else {
				System.out.println("El modulo " + modulos[j] + " esta aprobado" );
			}
		}

	}

}
