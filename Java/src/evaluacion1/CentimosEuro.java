package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		/*
		 * lee una cantidad en euros por teclado y 
		 * muestra por separado el número de euros y 
		 * el número de céntimos de euro
		 */
		// Necesidades previas
		double cantidad;
		int euros;
		int centimos;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// calculo euros
		euros = (int)cantidad;
		
		// calculo centimos
		centimos = (int)((cantidad - euros)*100);
		
		// muestra el resultado por pantalla
		System.out.println("Euros: " + euros + " Centimos: " + centimos);
		 
	}

}
