package Ejercicios_3_Switch;

import java.util.Scanner;

public class Gentilicios {

	public static void main(String[] args) {

		//Tecleamos el nombre de un pueblo y nos da sus gentilicio
		
		System.out.println("deme el nombre de un pueblo y dare sus gentilicio");
		String pueblo; 

		Scanner Teclado = new Scanner(System.in);
		
		pueblo = Teclado.nextLine();

		switch (pueblo) {
		
		case "Toledo", "TOLEDO","toledo": System.out.println("Toledano/a");
			break;
			
		case "Pantoja", "PANTOJA", "pantoja": System.out.println("Pantojano/a");
			break;
			
		case "Yuncos", "YUNCOS" ,"yuncos": System.out.println("Yunquero/a");
			break;
		default: System.out.println("Tu pueblo no existe");
			break;
		}
	}

}
