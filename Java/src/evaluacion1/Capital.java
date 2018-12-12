package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		/*
		 * lee una cantidad en euros, 
		 * un tipo de interés (ej: 3,6 %), y 
		 * un período de tiempo expresado en días por pantalla y
		 * calcula el interés producido en ese tiempo en base a la fórmula
		Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		 */
		// Necesidades previas
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// leer tipointeres
		System.out.println("Tipo de Interes (3,5%): ");
		tipointeres = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		// leer tiempo
		System.out.println("Tiempo en dias: ");
		tiempo = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
			
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// calcula el interes
		interes = (cantidad * tipointeres * tiempo)/(360*100);
		
		// muestra el resultado por pantalla
		System.out.println("El Interes es " + interes);
		 
	}

}
