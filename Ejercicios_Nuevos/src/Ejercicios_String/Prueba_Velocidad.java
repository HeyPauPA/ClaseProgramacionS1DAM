package Ejercicios_String;

public class Prueba_Velocidad {

	public static void main(String[] args) 
	{

		//vamos a comprobar la velocidad de un string y un stringbuilder
		
		//	--- STRING ---
		String s = "";

		long inicio = System.currentTimeMillis();

		//trabajo a realizar
		for (int i = 0; i < 100000; i++) 
		{
			s= s.concat("Lunes");
		}
		
		//	--- STRINGBUILDER ---
		//StringBuilder es mucho mas veloz ya q cada vez q no tiene 
		//espacio solo aumenta el espacio x16
		
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo del string:" + (fin-inicio));

		StringBuilder sb = new StringBuilder("");
		long inicio2 = System.currentTimeMillis();

		//trabajo a realizar
		for (int i = 0; i < 100000; i++) 
		{
			sb.append("Lunes");
		}

		long fin2 = System.currentTimeMillis ();
		System.out.println("Tiempo del stringBuilder:" + (fin2-inicio2));

	}

}
