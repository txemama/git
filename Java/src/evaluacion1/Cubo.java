package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		/*
		 * lee un número por teclado  
		 * calcula el cubo de ese número y 
		 * muestra el resultado por pantalla
		 */
		// Necesidades previas
		double n;
		double resultado;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// lee el valor de n
		System.out.println("Introduce un valor para n: ");
		n = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// calcula el valor del cubo
		resultado = n * n * n;
		
		// muestra el resultado por pantalla
		System.out.println("El valor del cubo es " + resultado);
		 
	}

}
