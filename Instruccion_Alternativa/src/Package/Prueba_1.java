package Package;

public class Prueba_1 {

	public static void main(String[] args) 
	{
		//intruccion alternativa, simple y doble
		
		/*
		 * --- SIMPLE ---
		 * 
		 * si(condicion)
		 * {
		 * 	 intruccion
		 * }
		 * fin del si
		 * 
		 * */
		boolean condicion= true;
		
		if(condicion = true) 
		{
			System.out.println("la condicion es verdadera");
		}
		
		/*
		 * --- DOBLE ---
		 * 
		 * si(condicion)
		 * {
		 * 	 intruccion
		 * }
		 * si no
		 * {
		 * 	 instruccion
		 * }
		 * fin del si
		 * 
		 * */
		
		if ( condicion = true) 
		{
			System.out.println("la condicion es verdadera");
		}
		else 
		{
			System.out.println("la condicion es falsa");
		}
		
	}

}
