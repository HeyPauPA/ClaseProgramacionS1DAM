package Ejercicios_String_Casa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej_8 {

	public static void main(String[] args) 
	{
		//		8. Igual al anterior, pero sumando los números completos.
		//		Introduciendo: "15 de Noviembre de 2022"
		//		Da como salida: 2037

		String frase = "" ;
		String textoNumero;
		boolean hayLetras= false; //para avisar de que hay letras
		char letra ;
		int numeros = 0;
		int suma = 0 ;

		System.out.println("Dame una frase y te sumare los numeros que aparecen");

		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();


		//preparar un string tokenicer
		StringTokenizer st = new StringTokenizer(frase);//para buscar por cada espacio las palabras

		//bucle para ir pidiendo todos los tokens que ha generado
		while (st.hasMoreTokens()) 
		{
			String trozo =st.nextToken();
			//comprobar que todas las letras del trozo son numeros
			for (int i = 0; i < trozo.length(); i++) 
			{
				hayLetras = false;
				//si hay letras, el bool es true
				if(!Character.isDigit(trozo.charAt(i))) 
				{
					hayLetras = true;
				}
				//si hay letras
				if(!hayLetras) 
				{
					//si es asi convierto el trozo a numero y lo añado a la suma
					numeros= Integer.parseInt(trozo);
					suma = numeros + suma;
				}			
			}

		}

		System.out.println(suma);
	}
}
