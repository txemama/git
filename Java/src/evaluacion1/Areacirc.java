package evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		/*
		 * lee el valor del radio por teclado  
		 * calcula el valor del circulo de ese radio y
		 * muestra el resultado por pantalla
		 */
		// Necesidades previas
		double radio;
		double resultado;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// lee el valor del radio por teclado
		System.out.println("Introduce un valor para el radio: ");
		radio = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// calcula el valor del circulo de ese radio
		resultado = Math.PI * radio * radio;
		
		// muestra el resultado por pantalla
		System.out.println("El valor del circulo es " + resultado);
		 
	}

}
