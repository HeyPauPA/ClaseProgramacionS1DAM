package Ejercicios_Clase_Arrays;

import java.util.Iterator;

public class Ejercicios_3D {

	public static void main(String[] args) 
	{
//el orden de "eleccion es como una loncha, si elegimos la i primero hlas cojemos en horizontal, con la j en vertical
		
		
		/* Ejemplo de array de 3 dimensiones*/
		//		
		//		Organizar los datos de los alumnos de la universidad
		//		
		//		Filas: datos de cada grado
		//		Columna: cursos de 1º a 4º
		//		Profundidad: sexo de los alumnos
		//								j
		int [][][]datosUniversidad ={{ {20,22}, {19,21}, {20,18}, {22,23} }, /*i*/
									 { {23,21}, {18,22}, {19,19}, {20,19} },
									 { {16,19}, {18,20}, {22,22}, {21,16} },
									 { {20,22}, {22,21}, {20,18}, {19,20} },
									 { {20,20}, {19,20}, {20,19}, {17,20} }};

		String[]grados = {"Derecho", "Informatica","Magisterio","Fisica","ADE"}; //filas (i)
		String[]curso = {"1º", "2º","3º","4º"}; //columnas (j)
		String[]sexo = {"Hombre", "Mujer"}; //profundidad (k)

		//TOTAL DE ALUMNOS EN LA UNIVERSIDAD

		int sumaAlumnos = 0;
		
		for (int i = 0; i < datosUniversidad.length; i++) 
		{
			for (int j = 0; j < datosUniversidad[i].length; j++) 
			{
				for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) 
				{
					sumaAlumnos = datosUniversidad[i][j][j2] + sumaAlumnos;
				}
			}
		}
		System.out.println("El numero de alumnos total es: " + sumaAlumnos);
		
		for (int i = 0; i < datosUniversidad.length; i++) 
		{
			System.out.println(grados[i] + ":");
			sumaAlumnos = 0;
			
			for (int j = 0; j < datosUniversidad[i].length; j++) 
			{
				for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) 
				{
					sumaAlumnos = datosUniversidad[i][j][j2] + sumaAlumnos;
				}
			}
			System.out.println(sumaAlumnos);
		}
		
		//LISTADO DE ALUMNOS POR CURSO
		for (int i = 0; i < datosUniversidad.length; i++) 
		{
			sumaAlumnos = 0;
			for (int j = 0; j < datosUniversidad[i].length; j++) 
			{
				for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) 
				{
				}
			}
		}
		
		//ALUMNOS POR SEXO
		
		for (int i = 0; i < datosUniversidad.length; i++) {
			for (int j = 0; j < datosUniversidad[i].length; j++) 
			{
				for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) 
				{
					
				}
			}
		}
		
		//Listado de alumnos por grado y curso
		
		for (int j = 0; j < datosUniversidad[0].length; j++) 
		{
			sumaAlumnos = 0;
			System.out.println("El numero de alumnos en " + curso[j]);
			for (int i = 0; i < datosUniversidad.length; i++) 
			{
				for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) 
				{
					sumaAlumnos = datosUniversidad[i][j][j2] + sumaAlumnos;
				}
			}
			System.out.println("es " + sumaAlumnos);
		}
		
		//Clase con mayor numero de diferencia entre chicos y chicas
		int maxDif_i = 0;
		int maxDif_j = 0;
		int maxDif_k = 0;
		
		for (int i = 0; i < datosUniversidad.length; i++) 
		{
			for (int j = 0; j < datosUniversidad[i].length; j++) 
			{
				for (int k = 0; k < datosUniversidad[i][j].length; k++) 
				{
					if (Math.abs(datosUniversidad[i][j][0] - datosUniversidad[i][j][1]) > maxDif_k )
					{
						maxDif_i = i;
						maxDif_j = j;
						maxDif_k = Math.abs(datosUniversidad[i][j][0] - datosUniversidad[i][j][1]);
					}
				}
			}
		}
		System.out.println("La clase con mayor numero de diferencia entre chicos y chicas es el curso " 
				+ curso[maxDif_j] + " del grado " + grados[maxDif_i] + 
				" con una diferencia de: " + maxDif_k);
		
	}
	

}
