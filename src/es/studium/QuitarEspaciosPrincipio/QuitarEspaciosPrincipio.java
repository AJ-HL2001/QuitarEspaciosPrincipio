package es.studium.QuitarEspaciosPrincipio;

import java.util.Scanner;

public class QuitarEspaciosPrincipio {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		//Variables
		String cad1;
		
		//Inicio
		System.out.println("Escribe una cadena:");
		cad1 = teclado.nextLine();
		cad1 = cad1.replaceAll("^\\s*", "");
		System.out.println(cad1);
		teclado.close();
	}
}
