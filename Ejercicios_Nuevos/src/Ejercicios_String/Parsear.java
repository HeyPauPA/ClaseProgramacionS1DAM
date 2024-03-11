package Ejercicios_String;

public class Parsear {

	public static void main(String[] args) 
	{
		//convierto de entero a texto
		int num =1234;
		String texto ="";		
	
		texto = String.valueOf(num);
		
		System.out.println(texto);
			
		//convertir un texto a un int

		String texto2 ="541";	
		int numero = 0;
		
		numero = Integer.parseInt(texto2);
		// Double.parseDouble(texto2)
		// float.parsefloat(texto2)
		// long.parselong(texto2)
		
		System.out.println(numero);
		
		//averiguar las crifras de un numero
		System.out.println("El numero de digios del numero es igual a: "  + String.valueOf(num).length());
	}

}
