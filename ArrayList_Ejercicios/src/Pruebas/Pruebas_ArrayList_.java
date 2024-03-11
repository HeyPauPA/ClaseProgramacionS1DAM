package Pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Pruebas_ArrayList_ {

	public static void main(String[] args) {

		//PRUEBAS ARRAYLIST
		
				ArrayList lista = new ArrayList(); //creo un array vacio
				
				lista.add("Hola");
				lista.add(49);
				lista.add(35.23);
				lista.add(true);
				
				System.out.println(lista);
				
				//declarar una lista con un tipo fijo de dato (tipado)
				
				ArrayList <String> nombres = new ArrayList<String>();
				
				nombres.add("Hola");
				nombres.add("Juan");
				nombres.add("Pepe");
				nombres.add("Libro");
				
				System.out.println(nombres);
				
//				ArrayList<Object> datos = new ArrayList<Object>(); // estructura genérica
//				datos.add("Buenos dias");
				
				
				//añadir nombres en una posicion correcta
				
				nombres.add(2,"Ana");
				System.out.println(nombres);
				
				//quitar un objeto y sustituirllo por otro
				
				nombres.set(1,"Luis");
				
				System.out.println(nombres);
				
				//borrar un elemento
				nombres.remove(3); //posicion
//				nombres.remove("Ana");
//				nombres.clear();
				
				//recorrer un array
				
				for (int i = 0; i < nombres.size(); i++) 
				{
					System.out.println(nombres.get(i));
				}
				
				//foreach (por cada elemento "nombre" en el array da una vuelta)
				
				for/*each*/ (String string : nombres) 
				{
					System.out.println(string);
				}

				//con iterador (funciona como un string tokenicer)
				for (Iterator iterator = nombres.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					System.out.println(nombres);
					
				}
				
				//arraylist multidimensional
				
				ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
				
				//buscar dentro de un ArrayList
				System.out.println("Luis está en la posicion" + nombres.indexOf("Luis"));
				System.out.println("Esta ana?:" + nombres.contains("Ana"));
				
				//ordenar un arrayList
				Collections.sort(nombres);
				System.out.println(nombres );
				
				//convertir un array clásico en un ArrayList
				String[] array = {"Ángel", "Marta", "Carlos"};
				ArrayList<String>ListaNombres = new ArrayList<String>(Arrays.asList(array));
				System.out.println(ListaNombres);
				
				//de una dinamica conseguir una estatica
				Object[]array2  = ListaNombres.toArray(); //siembre crea objetos
	}

}
