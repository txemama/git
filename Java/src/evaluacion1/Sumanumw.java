package evaluacion1;

import java.util.Scanner;

public class Sumanumw {

	public static void main(String[] args) {
		/*
		 * un numero entero por teclado y 
		 * muestra la suma de todos los n�meros desde 1 hasta el inclusive
		 * con for
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
	
		// muestra los n�meros desde 1 hasta �l inclusive
		suma = 0;
		
		for(posicion = 1;posicion <= numero;posicion = posicion + 1) {
			// calculo suma
			suma = suma + posicion;
		}
		// muestro suma
		System.out.println("La suma de los "+ numero + " primeros n�meros es " + suma);
	}
}
