package Ejercicios_Casa;

public class Ej_14 {

	public static void main(String[] args) 
	{
//		14. Programa que simule el juego de las minas. El programa rellenará de forma
//		aleatoria un array de 5x5 con 10 minas. Una vez relleno, pedirá que escribamos
//		coordenada y mostrará el mensaje MINA, en caso de haber pisado una, o bien un
//		numero que indica cuantas minas hay alrededor.
		
		int tamaño = 5;
		int[][] buscaminas = new int[tamaño][tamaño];

		for (int i=0; i < buscaminas.length; i++) 
		{
			// relleno la matriz con datos aleatorio de 0-1
			for (int j = 0; j < buscaminas[i].length; j++) 
			{
				int dato = (int) (Math.random());
				buscaminas[i][j] = (int) (Math.random());
			}	
		}	
	}

}
