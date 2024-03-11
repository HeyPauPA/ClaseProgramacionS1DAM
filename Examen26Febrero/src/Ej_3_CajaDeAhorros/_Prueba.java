package Ej_3_CajaDeAhorros;

public class _Prueba {

	public static void main(String[] args) 
	{
		// --------------- ENUNCIADO ---------------
		
//		3. En la Caja de Ahorros de mi pueblo desean informatizar la gestión de los
//		préstamos hipotecarios que han concedido. 
//		Suelen tener dos tipos de préstamos,los de interés fijo y los de interés variable.
//		
//		La información necesaria que van a almacenar es:
//		1. Titular del préstamo.
//		2. Capital prestado.
//		3. Duración del préstamo(en años).
//		4. Tipo de interés.
//
//		El tipo de interés en los préstamos fijos, no cambia nunca, pero en los préstamos
//		de interés variable se revisa en base al Euribor cada cierto tiempo, por lo que
//		estos préstamos deben almacenar el Euribor que se está aplicando, además de un
//		diferencial. Un ejemplo de interés para un préstamo variable sería Euribor+0,75 ,
//		lo que quiere decir que el diferencial es 0,75. Por lo tanto los préstamos
//		variables deben almacenar el Euribor y el diferencial, siendo el interés la suma
//		de estos dos.
//		Además los préstamos a interés variable deben almacenar cada cuantos meses se
//		revisa el interés.
//		Todos los prestamos tendrán un método obligatorio llamado cuota(), que
//		retornará cuanto tenemos que pagar cada mes.
//		Para realizar el cálculo se utiliza la siguiente formula:
//
//		Plazo Interes
//		Capital Interes Cuota −
//
//		           capital*Interes
//		Cuota =  --------------------
//				 1-(1+Interes)^-Plazo
//		
//		Siendo el plazo los meses totales que vamos a pagar el préstamo
//
//		Se pide realizar:
//		a) Las clases necesarias para poder organizar correctamente la
//		información de todos los préstamos.
		
//		b) Un método cuota() obligatorio en todas las clases.
		
//		c) Una clase “Pasivo” que contiene todos los préstamos que el Banco tiene
//		en este momento. Esta clase debe contener:
		
//		- Métodos básicos para la gestión de los préstamos.
		
//		- Dos métodos llamados “getPrestamosFijos()” y
//		“getPrestamosVariables()”, que retornan los prestamos que hay
//		de cada tipo.
		
		
		// --------------- EJERCICIO ---------------
		
		InteresFijo p1 = new InteresFijo("Pepe",2000, 2, 5);
		InteresFijo p2 = new InteresFijo("Luisa",2500, 3, 1);
		InteresVariable p3 = new InteresVariable("Marcos", 7000, 5, 1, 2.5, 6);
		InteresVariable p4 = new InteresVariable("Angustias",8000, 3, 2, 0.75, 7);

		Pasivo pasivo =  new Pasivo();
		
		pasivo.addPrestamo(p1);
		pasivo.addPrestamo(p2);
		pasivo.addPrestamo(p3);
		pasivo.addPrestamo(p4);
		
	
		System.out.println(p1.cuota() + "€");
		System.out.println(p3.cuota() + "€");
		
		System.out.println(pasivo.getPrestamosFijos());
		System.out.println(pasivo.getPrestamosVariables());
		
		
	}

}
