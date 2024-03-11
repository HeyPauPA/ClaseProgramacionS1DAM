package Ejercicios_String;

public class Pruebas_String {

	public static void main(String[] args) 
	{
		//probamos el string

		String s = "Hola, que tal";
		String s2 = "HOla, que tal";

		//mostrar la longitud del string
		System.out.println("Longitud :" + s.length());

		//letra por posicion
		System.out.println("La letra nº7 es: " + s.charAt(7));
		
		//sacar la ultima letra
		System.out.println("la ultima letra es: " + (s.length()-1));
		
		//comparar dos cadenas
		System.out.println( s == s2);	
		System.out.println(s.equals(s2));//para comparar el contenido del objeto
		System.out.println(s.equalsIgnoreCase(s2));//para comparar el contenido del objeto sin tener en cuenta 
		
		//--
		
		//diferencia entre 2 strings
		System.out.println(s.compareTo(s2));
		
		//inicio y final de una frase
		System.out.println("La frase comienza en <Hola>: " + s.startsWith("Hola"));
		System.out.println("la frase termina en <tal>: " + s.endsWith("tal"));
		//--
		
		//trozo de frase
		System.out.println("El trozo de la letra 3-10 es :" + s.substring(3,10)); //del 3 al 10
		System.out.println("El trozo de la letra 3-10 es :" + s.substring(3)); //del 3 hasta el final
		//--
		
		//buscar dentro de la frase
		System.out.println("La letra <q> esta en la posicion " +  s.indexOf("q"));
		System.out.println("La letra <Q> esta en la posicion " +  s.indexOf("Q")); //da -1 q indica q no lo encuentra en ningun sitio
		System.out.println("La letra <que> esta en la posicion " +  s.indexOf("que")); //indica donde comienza la palabra
		System.out.println("La letra <a> la ultima vez q parece es " +  s.lastIndexOf("a"));
	}

}
