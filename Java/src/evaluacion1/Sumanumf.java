package evaluacion1;

import java.util.Scanner;

public class Sumanumf {

	public static void main(String[] args) {
		/*
		 * un numero entero por teclado y 
		 * muestra la suma de todos los números desde 1 hasta el inclusive
		 */
		// Necesidades previas
		int numero,posicion, suma;

		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		// cierro teclado
		teclado.close();
		
		// muestra los números desde 1 hasta él inclusive
		// inicializo posicion
		suma = 0;
		posicion = 1;
		while(posicion <= numero) {
			// calculo suma
			suma = suma + posicion;
			// actualizo posicion
			posicion = posicion + 1;
		}
		// muestro suma
		System.out.println("La suma de los "+ numero + " primeros números es " + suma);
	}
}
