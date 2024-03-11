package Ejercicios_Clase_Arrays;

public class Ej2_Notas {

	public static void main(String[] args) 
	{
		int[]notas = {8,6,10,3,5,7};
		String[]modulos = {"LM","Ingles","Programacion","BBDD","FOL","SISI"};

		//SACAR UN LISTADO DE MODULOS APROVADOS
		//saldria 
		//		·LM
		//		·Ingles
		//		·Programacion
		//		·SISI

		System.out.println("- Las asignaturas favoritas son: ");
		for (int i = 0; i < notas.length; i++) 
		{
			if(notas[i]> 5) 
			{
				System.out.println("·"+modulos[i]);
			}
		} 

		int notaMasAlta = notas[1];
		int datoMasAlto = 0;

		//modulo favorito

		for (int i = 0; i < notas.length; i++) 
		{
			//			if(notas[i] > notas[notaMasAlta]) 
			//			{
			//				notaMasAlta = i;
			//			}

			if(notas[i] > notaMasAlta) 
			{
				notaMasAlta = notas[i];
				datoMasAlto = i;
			}
		}

		System.out.println("- Las asignatura favorita es: " + modulos[datoMasAlto]);

		//modulos por encima de la media (modulos por encima de mi nota media)

		float sumaNotas = 0;
		float media = 0;

		for (int i = 0; i < notas.length; i++) 
		{
			sumaNotas = notas[i] + sumaNotas;
		}		
		media = sumaNotas / notas.length;

		System.out.println("- Las notas por encima de la media → "+ media + " son: ");
		for (int i = 0; i < modulos.length; i++) 
		{
			if(notas[i] > media) 
			{
				System.out.println("·" + modulos[i]);
			}
		}

		//ARRAY DE VARIAS DIMENSIONES
		//preparar un array con las notas de las 3 evaluaciones

		//tendriamos 7 x 3 evaluaciones, en total 21 notas 

		//                              filas↓  ↓columnas
		//int[][]notasEvaluaciones = new int[3][7];

		int[][]notasEvaluaciones ={{8,5,3,7,9,5,10},   //fila1
								    {7,6,2,4,8,6,9},   //fila2
				                    {9,8,4,5,9,6,9}};  //fila3

		System.out.println("Tamaño del array: " + notasEvaluaciones.length); //te dal el nº de filas
		System.out.println("Tamaño de la fila 0: " + notasEvaluaciones[0].length); //solo funciona el .length con los arrays de varias dimensiones
		System.out.println("Tamaño de la fila 1: " + notasEvaluaciones[1].length); //en arrays de 2 dimensiones si se pregunta por el primer elemento solo te da el nª de elementos de las filas(columnas), la longitud de el 1º
		System.out.println("Tamaño de la fila 2: " + notasEvaluaciones[2].length);  //preguntamos a la fila especificamente

		//System.out.println("Tamaño de la fila 0, columna 3: " + notasEvaluaciones[0][3]); no funciona


		//imprimir un array de 2 dimensiones
		for (int i = 0; i < notasEvaluaciones.length; i++) { // i filas

			for (int j = 0; j < notasEvaluaciones[i].length; j++) { //j columnas con i para q funcione porq sino solo lo hace 
				//3 veces ya q con la i miras el tamaño de la fila

				System.out.print(notasEvaluaciones[i][j] + " ");
			}

			System.out.println("");
		}

		//NOTAS APROBADAS EN TOTAL

		System.out.println("-Notas aprobadas en total");
		
		int contadorAprobados = 0;
		for (int i = 0; i < notasEvaluaciones.length; i++) { // filas

			for (int j = 0; j < notasEvaluaciones[i].length; j++) { //columnas con i para q funcione porq sino solo lo hace 3 veces

				if(notasEvaluaciones[i][j] >= 5) 
				{
					contadorAprobados++;
				}
			}
		}
		System.out.println("El numero de aprovados en las 3 evaluaciones es: " + contadorAprobados);

		//MEDIA DE CADA EVALUACION POR SEPARADO
		// 1ª EV : 6.8
		// 2ª EV : 9.0
		// 3ª EV : 5.4

		System.out.println("-Media de cada evaluacion por separado");
		
		for (int i = 0; i < notasEvaluaciones.length; i++) //fila
		{		
			float sumaEv = 0;

			for (int j = 0; j < notasEvaluaciones[i].length; j++)  //columna
			{
				sumaEv	= notasEvaluaciones[i][j] + sumaEv;
			}

			System.out.println("La nota media de la " + (i+1)  + "ª evaluacion es: " + (sumaEv/notasEvaluaciones[i].length));
		}

		// MEDIA DE CADA MODULO POR SEPARADO
		// 1ª EV - LM : 6.8
		// 2ª EV - LM : 9.0
		// 3ª EV - LM : 5.4

		System.out.println("-Media de modulo por separado");
		
		//el bucle de las j siempre lleva algo
		
		for (int j = 0; j < notasEvaluaciones[0].length; j++) // le pregunto la medida de una de las filas 
														      //por ejemplo la 0 (solo se usa para una matriz perfecta)
		{		
			float sumaEv = 0;
			
			float mediaModulos = 0;

			for (int i = 0; i < notasEvaluaciones.length; i++)  //
			{
				sumaEv	= notasEvaluaciones[i][j] + sumaEv; //nunca se cambia de sitio la i y la j
				mediaModulos =  (sumaEv/notasEvaluaciones.length);
			}
			System.out.println("La nota media de la evaluacion del modulo " + (j+1) + " es: " + mediaModulos);
		
		}
		
		//APROBADOS POR EVALUACION
		
		System.out.println("-Numero de aprobados por evaluacion");
		
		int contadorAprobadosEv = 0;
		
		for (int i = 0; i < notasEvaluaciones.length; i++) 
		{
			contadorAprobadosEv = 0;

			for (int j = 0; j < notasEvaluaciones[i].length; j++) 
			{
				if(notasEvaluaciones[i][j] >= 5) 
				{
					contadorAprobadosEv++;
				}
			}
			System.out.println("El nº de aprovados de la " + (i+1) + " ª EV son: " + contadorAprobadosEv);	
		}
		
		//APROBADOS POR MODULO
		
		System.out.println("-Numero de aprobados por modulo");
		
		int contadorAprobadosModulo = 0;
		for (int j = 0; j < notasEvaluaciones[0].length; j++)
		{		
			contadorAprobadosModulo = 0;
			
			for (int i = 0; i < notasEvaluaciones.length; i++) 
			{
				if(notasEvaluaciones[i][j] >= 5)
				{
					contadorAprobadosModulo++;
				}
			}
			System.out.println("El numero de aprobados del modulo " + (j+1) + " es: " + contadorAprobadosModulo);
		}
		
	}
}
