package evaluacion1;

import java.util.Scanner;

public class Leernumd {

	public static void main(String[] args) {
		/*
		 * un n�mero entero por teclado, 
		 * si el n�mero entero que se pide por teclado es negativo 
		 * sigue pidiendo n�meros hasta que se introduzca un n�mero positivo que 
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
		System.out.println("El n�mero introducido es el "+ numero);
	}
}
