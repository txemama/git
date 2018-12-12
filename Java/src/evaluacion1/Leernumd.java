package evaluacion1;

import java.util.Scanner;

public class Leernumd {

	public static void main(String[] args) {
		/*
		 * un número entero por teclado, 
		 * si el número entero que se pide por teclado es negativo 
		 * sigue pidiendo números hasta que se introduzca un número positivo que 
		 * muestra por pantalla
		 */
		// Necesidades previas
		int numero;

		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		do {
			// leer numero
			System.out.println("Numero: ");
			numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		}while(numero < 0);
		
		// cierro teclado
		teclado.close();
	
		// muestro numero
		System.out.println("El número introducido es el "+ numero);
	}
}
