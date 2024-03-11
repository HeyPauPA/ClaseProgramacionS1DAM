package Ej_2_Cruceros;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _Prueba {

	public static void main(String[] args) 
	{
//		2. Vamos a intentar informatizar una Agencia de Viajes. En concreto nos vamos a
//		centrar hoy en los cruceros.
//
//		Los cruceros son viajes a bordo de un barco donde tenemos una serie de
//		servicios, y además durante el viaje se hacen diversas escalas en las más
//		importantes ciudades de la zona.
		
//		Intentaremos programar la clase Crucero, que debe contener la siguiente
//		información:
		
//		- Datos sobre el código del crucero, su nombre comercial, el nombre del
//		barco, la fecha de partida y la fecha de regreso.
//		- Una lista con las escalas que se van a realizar a lo largo del viaje.
//
//		Las escalas pueden ser de varios tipos:
		
//		- Escalas de ocio, en las que el barco para en una ciudad y nos dejan bajar
//		durante un determinado número de horas.
		
//		- Escalas culturales, en las que además de bajar a la ciudad, tenemos a un
//		guía turístico a nuestra disposición para realizar una ruta por la ciudad.
		 
//		Todas las escalas contienen el nombre de la ciudad a visitar, la hora de bajada y
//		la hora de regreso. Además si la visita es cultural contiene el precio del guía
//		turístico.
		
//		En resumen, hay que programar:
		
//		a) La jerarquía de clases para las escalas. Estas clases deben contener los
//		métodos básicos, y el método toString().
		
//		b) La clase Crucero con todos los métodos básicos necesarios.
		
//		c) Un método toString() en la clase Crucero que imprime la ficha completa del
//		crucero con todas las escalas que contiene.
		
//		d) Un método coste() en la clase Crucero que calcula el precio del crucero en
//		base a las escalas que realiza.
		
//		- Mínimo de 600 €.
//		- Por cada escala de ocio 100€ más.
//		- Por cada escala cultural 100€ más el precio del guía turístico.
		
		//Prueba de las clase Crucero.
		
				//Escala de Ocio
				Escala_Ocio o = new Escala_Ocio("Atenas", LocalDateTime.parse("2024-04-14T09:00:00"),LocalDateTime.parse("2024-04-14T18:00:00"));
				Escala_Cultural c = new Escala_Cultural("Genova", LocalDateTime.parse("2024-04-16T08:00:00"),LocalDateTime.parse("2024-04-16T17:30:00"), 150);
			
				Crucero crucero = new Crucero(1, "Islas Griegas", "Liberty of the seas", LocalDate.parse("2024-04-12"), LocalDate.parse("2024-04-18"));
				
				crucero.add(o);
				crucero.add(c);
				
				System.out.println(crucero);
				System.out.println("Coste total: " + crucero.coste());
		
		
	}

}
