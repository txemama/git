package evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		/*
		 * lee una cantidad en euros, 
		 * un tipo de inter�s (ej: 3,6 %), y 
		 * un per�odo de tiempo expresado en d�as por pantalla y
		 * calcula el inter�s producido en ese tiempo en base a la f�rmula
		Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		 */
		// Necesidades previas
		double n;
		int parteentera;
		double partereal;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer n
		System.out.println("N: ");
		n = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// calculo parteentera
		parteentera = (int)n;
		
		// calculo partereal
		partereal = n - parteentera;
		
		// muestra el resultado por pantalla
		System.out.println("Parte Entera: " + parteentera + " Parte Real: " + partereal);
		 
	}

}
