package Ej_Restaurante_V2;

import java.util.ArrayList;

import Ej_Restaurante_V2.Carne.GradosDeCoccion;

public class _Prueba {

	public static void main(String[] args) 
	{
		// ------------------------- ENUNCIADO ---------------------------
		
//		1. Aprovechando la declaración de Toledo como Capital Española de la
//		Gastronomía, en el Restaurante “Azarquiel”, vamos a hacer un esfuerzo para
//		informatizar todos los platos de nuestra carta.
//
//		Los camareros van a tener una PDA donde anotar las comandas de cada mesa.
//		Estas comandas incluyen información de que numero de mesa es y el número
//		de comensales. Y además incluye todos los platos que han pedido.
//		Todos los platos tienen un nombre y un precio.
//		En la carta tenemos divididos los platos en cuatro categorías:
//
//		- Primeros. Estos platos tienen la opción de compartir, por lo que
//		debemos almacenar si son para compartir en la mesa o nó
//		- Carnes. Tienen la opción de poner el grado de coción, que debe
//		ser uno de los siguientes: “Poco hecho”, “Al punto”, “Muy
//		hecho”, “Carbonizado”.
//		- Pescados. No tienen más información relevante
//		- Postres. Tienen información para diabéticos, por lo que
//		almacenan si son con o sin azúcar.
//
//		En resumen, hay que programar:
		
//		a) La jerarquía de clases para los platos. Estas clases deben contener los
//		métodos básicos, y el método toString().
		
//		b) La clase Comanda con todos los métodos básicos necesarios.
		
//		c) Un método toString() en la clase Comanda que imprime la comanda con
//		toda la información de todos los platos que contiene.
		
//		d) Un método coste() en la clase Comanda que calcula el precio total de todo
//		lo pedido.
		
//		Un método hayDiabéticosEnLaMesa(), que retorna verdadero o falso, si se
//		han pedido postres sin azúcar en la comanda.

		
		
		// ------------------------- EJERCICIO ---------------------------
		
		//platos
		Primero pl1 = new Primero ("Pan", 5,true);
		Primero pl2 = new Primero ("Pan y tomate", 7,true);
		Pescado pl3 = new Pescado("Trucha", 20);
		Carne pl4 = new Carne("Cachopo",25, GradosDeCoccion.AlPunto);
		Carne pl5 = new Carne("Entrecot",15, GradosDeCoccion.PocoHecho);
		Postre pl6 = new Postre("Helado",3,true);
		Postre pl7 = new Postre("Tarta de queso",3,false);
		
		//pedido
		ArrayList<Platos> p1 = new ArrayList<Platos>();
		
		//añadir platos
		p1.add(pl1);
		p1.add(pl2);
		p1.add(pl3);
		p1.add(pl4);
		p1.add(pl5);
		p1.add(pl6);
		p1.add(pl7);
		

		Comanda c1 = new Comanda(5,4,p1);
		
		System.out.println(c1.toString());
		System.out.println(c1.coste() + "€"); 
		System.out.println("Hay diabeticos en la mesa? " + c1.hayDiabéticosEnLaMesa());
		//2DA FORMA
		
		//Comanda c1 = new Comanda(14, 6);		
//		c1.addPlato(new Primero("Jamón serrano", 25, true));
//		c1.addPlato(new Carne("Solomillo", 16, Carne.GradosDeCoccion.AlPunto));
//		c1.addPlato(new Pescado("Lubina", 14));
//		c1.addPlato(new Postre("Tiramisú", 8, true));
//		c1.addPlato(new Postre("Brownie", 6, false));
		
		
	}

}
