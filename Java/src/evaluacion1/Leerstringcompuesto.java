package evaluacion1;

import java.util.Scanner;

public class Leerstringcompuesto {

	public static void main(String[] args) {
		/*
		 * lee un String por teclado y 
		 * muestra por pantalla el mensaje "El valor de la variable introducida es "
		 */
		String n;
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor
		// muestro un mensaje informativo
		System.out.println("Introduce un String: ");
		n = teclado.nextLine(); // asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		
		teclado.close(); // libero la memoria asignadada al objeto llamado teclado
		
	}

}
