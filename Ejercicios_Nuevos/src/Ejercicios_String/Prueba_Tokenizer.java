package Ejercicios_String;

import java.util.StringTokenizer;

public class Prueba_Tokenizer {

	public static void main(String[] args) 
	{

		//Probando la clase string tokenizer
		String frase ="Hola a todos, buenos dias";

		//creamos un objeto 
		//StringTokenizer st = new StringTokenizer(frase);//por defecto solo mira los espacios
		
		//a no ser q hagamos esto
		StringTokenizer st = new StringTokenizer(frase , " .,");  //indicamos el string y lo q vamos a mirar 
																//(si no ponemos espacio ya no los detecta)
						
		//y luego le preguntamos cuantos trozos tiene la frase 
		System.out.println("La frase tiene "+st.countTokens() + " palabras");
		
		//pedir un token
		System.out.println("El primer trozo " + st.nextToken());//la primera parte de la frase hasta el . ,
		
		//pedir otro token
		System.out.println("El segundo trozo " + st.nextToken());//la primera parte de la frase hasta el . ,
		
		//cuantos trozos tiene ahora
		System.out.println("La frase tiene" + st.countTokens() + " palabras"); //un objeto con datos q segun pido se consume, como una caja de naranjas, 
																			  //segun pides una se gasta de la caja
		//pedir todos los tokens q le quedan 
		while (st.hasMoreTokens() == true) //comprueba si hasy mas tokens disponibles
		{
			System.out.println(st.nextToken());
		}
		//si pido despunes otro token fallara porq ya no le quedan
	}

}
