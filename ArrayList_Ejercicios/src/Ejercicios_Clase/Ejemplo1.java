package Ejercicios_Clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		// pedir por teclado numeros hasta q se ponga el 0
		//no se pueden repetir numeros
		
		ArrayList<Integer> listaNumeros= new ArrayList<Integer>();
		
		Scanner teclado =  new Scanner(System.in);
		int numeroDado = 0;
		
		System.out.println("Dame numeros");
		do {
			numeroDado = teclado.nextInt();
			
			if(!listaNumeros.contains(numeroDado)) 
			{	
				listaNumeros.add(numeroDado);
			}
			
		} while (numeroDado != 0);
		//borrar 0
		
		//listaNumeros.remove(listaNumeros.size()-1);//para borrar el ultimo elemento si no no funiona
		listaNumeros.remove(listaNumeros.indexOf(0));//borrar el dato de dentro de la lista de la posicion del 0
		//listaNumeros.remove( new Integer(0));//borrar dato nuevo 0
		//listaNumeros.remove(Integer.valueOf(0));  

		System.out.println(listaNumeros);
	}

}
