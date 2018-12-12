package evaluacion1;

import java.util.Scanner;

public class Valorabs {

	public static void main(String[] args) {
		/*
		 * lee el valor de un número entero por teclado y muestra su valor absoluto por
		 * pantalla
		 */
		// Necesidades previas
		int n;
		int resultado;

		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer n
		System.out.println("N: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();

		if (n > 0) {
			// si n es positivo
			resultado = n;
		} else {
			// si n es negativo
			resultado = -n;
		}

		// muestra el resultado por pantalla
		System.out.println("El valor absoluto de " + n + " es " + resultado);

	}

}
