package Ejercicios_String_Casa;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Ej_10 {

	public static void main(String[] args) {
		
//		10. Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
//		pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
//		acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
//		perdido.

		String frase ="";
		String trozo = "";
		int contadorCoincidencias = 0;
		int numeroDeVidas = 8;
		boolean palabraAcertada = false;
		
		System.out.println("Dame 1 frases para el ahorcado y trata de adivinarla");

		JPasswordField jpf = new JPasswordField();
		JOptionPane.showConfirmDialog(null,jpf,"Palabra Secreta" , JOptionPane.CLOSED_OPTION);
		frase = String.valueOf(jpf.getPassword());
		
		StringBuilder adivinado = new StringBuilder();
		
		for (int i = 0; i < frase.length(); i++) 
		{
			adivinado.append("-");
			System.out.println(adivinado);
		}
		
		//mientras hay vidas y no se acierta la palabra
		while (numeroDeVidas > 0 &&  palabraAcertada == false) {
			
		}
		//muestro guiones
		
		//pido letra
		
		//si la encuentro
		
			//cambio guiones por letra
		
		// si no
		
		//añado un fallo
	}

}
