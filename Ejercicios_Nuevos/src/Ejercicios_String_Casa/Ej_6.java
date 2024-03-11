package Ejercicios_String_Casa;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) 
	{
		
//		Programa que descubra si una palabra es o no palíndroma, es decir se lee
//		igual del derecho que del revés.
//		Introduciendo: "oso"
//		Da como salida: true

		String frase = "" ;
		String fraseIzq = "" ;
		String fraseDer = "" ;
		
		int longitudFrase = 0;
		int mitadfrase = 0;
		 
		System.out.println("Dame una frase y te dire si es palíndroma");

		Scanner teclado = new Scanner(System.in);
        frase = teclado.nextLine();
        
        StringBuilder sb = new StringBuilder(frase);
        
        longitudFrase = sb.length();
        
        mitadfrase = longitudFrase/2; //al ser un int sera entero
        
        //elegimos la mitad izquierda de la frase  
        fraseIzq = sb.substring(longitudFrase, mitadfrase);
        
        //elegimos la mitad derecha de la frase  
        //fraseDer = sb.reverse(sb.substring(mitadfrase, longitudFrase));
        
        if(fraseDer.equals(fraseIzq)) {
        	System.out.println("La frase es palindroma");
        }
        else
        	System.out.println("no es palíndroma");
	}

}
