package empresa;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) 
	{
		Cliente c = new Cliente( "E3938484J","Javier",665747433,1);

		Empleado e = new Empleado("0458976125P", "Paco", 665449373, 1400);
		
		Jefe j = new Jefe("59876421W","Juan" ,688745244 , 8751, "7894U");
		
		// Persona p = new Persona("E3938484J","Javier",665747433); NO SE PUEDE INSTANCIAR YA QUE ES ABSTRACTO
	
		
		 ArrayList<Persona> gente = new ArrayList<Persona>(); //puedes almacenar una persona 
		 													  // siempre q el objeto tenga dentro esta clase 
		
		 gente.add(e);
		 gente.add(c);
		 gente.add(j);
		 
		 for (Persona persona : gente) 
		 {
			System.out.println(persona); //al imprimir te dara todos los datos (aunque no sean de la clase persona)
		 }
	}

}
