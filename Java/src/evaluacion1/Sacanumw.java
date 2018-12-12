package evaluacion1;

import java.util.Scanner;

public class Sacanumw {

	public static void main(String[] args) {
		/*
		 * lee un número entero por teclado y 
		 * muestra los números desde 1 hasta él inclusive
		 */
		// Necesidades previas
		int numero,posicion;

		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		// cierro teclado
		teclado.close();
		
		// muestra los números desde 1 hasta él inclusive
		// inicializo posicion
		posicion = 1;
		while(posicion <= numero) {
			// escribir posicion
			System.out.println(posicion);
			// actualizo posicion
			posicion = posicion + 1;
		}
	}
}
