package ejercicios_WRAPPERS;

public class Pruebas {

	public static void main(String[] args) 
	{
		//Diferencia entre un dato orimitivo y un objetos c
		int numero = 5;
		
		String letras = "Hola";
		
		System.out.println(letras.toUpperCase() );
		
		//para cada dato primitivo existe uno referenciado  
		
//		int		-->	Integer
//		long	-->	Long
//		double	-->	Double
//		float	-->	Float
//		boolean	-->	Boolean
//		char	-->	Character
//		short	-->	Short
//		byte	-->	Byte
//		
		int x = 5;
		int y = 5;
		
		System.out.println( x == y);
		 
		/*En este caso, los objetos son diferentes, aunq tengan ambos el mismo dato*/
		Integer b = new Integer(5);
		Integer c = new Integer(5);
		
		System.out.println(b == c);
		//para mirar el contenido del objeto se hace intValue
		
		//probar un string
		
		String frase1 ="Adios";
		String frase2 ="Adios";
		
		System.out.println(frase1 == frase2);
		
		StringBuilder frase3 = new StringBuilder("Adios");
		StringBuilder frase4 = new StringBuilder("Adios");
		
		System.out.println(frase3 == frase4);
	}

}
