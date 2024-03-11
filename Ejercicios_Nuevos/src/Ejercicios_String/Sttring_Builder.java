package Ejercicios_String;

public class Sttring_Builder {

	public static void main(String[] args)
	{

		//probando la clase stringbuilder
		String s = "Hola que tal";
		
		StringBuilder sb1 = new StringBuilder();		//vacio
		StringBuilder sb2 = new StringBuilder("Hola");  //con un texto dentro
		StringBuilder sb3 = new StringBuilder(500);		//con capaciodad de 500 letras
		StringBuilder sb4 = new StringBuilder(s);		//contriene un string dentro

		
		//puedo comprobar la capacidad de cada variable
		System.out.println(sb1.capacity()); //saldra 16: de espacio por defecto
		System.out.println(sb2.capacity()); //saldra 20: de espacio por defecto + las 4 letras
		System.out.println(sb3.capacity()); //saldra 500: de espacio definido
		System.out.println(sb4.capacity()); //saldra 28: de espacio por defecto + 12 letras
		
		//DIFERENCIA ENTRE STRING Y STRING BUILDER
		//para unir 2 frases
		String s1 = "Hola";
		String s2 = ", que tal";
		
		s1 = s1.concat(s2);//unos las 2 frases pero debo especificar donde se guardan
		
		System.out.println(s1);
		
		
		StringBuilder sb5 = new StringBuilder("Hola");		
		StringBuilder sb6 = new StringBuilder(", que tal"); 
		
		sb5.append(sb6); //ahora no hay que poner donde se queda porq se usa el mismo objeto
		System.out.println(sb5);
		
		//ERRORES A EVITAR
		//comparar una frase con otra no se usa ==
		s1 = "hola";
		s2 = "Hola";
		
		if(s1.equals(s2)) //con == comparas el objeto, con equals el contenido
		{
			System.out.println("Son iguales");
		}
		else
			System.out.println("Son diferentes");
		
		sb1 = new StringBuilder("Hola");
		sb2 = new StringBuilder("Hola");
		
		if(sb1.equals(sb2)) 
		{
			System.out.println("Son iguales");
		}
		else
			System.out.println("Son diferentes");
		
		//DE STRING A STRINGBUILDER
		sb1 = new StringBuilder(s1);
		
		//DE STRINGBUILDER A STRING
		s1 = sb1.toString();
		
		

	}

}
