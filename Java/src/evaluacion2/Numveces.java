package evaluacion2;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// necesidades previas
		int n, posicion;
		int [] arrayenteros = new int[10];
		// Pide números de 0 a 9 por pantalla y 
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leo un valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();
		// calcula el número de veces que han sido introducidos utilizando un array. 
		// Finaliza la introducción de datos cuando se introduce un valor negativo o mayor que 9. 
		while(n>=0 && n <=9) {
			arrayenteros[n] = arrayenteros[n] + 1;
			// leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		}
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha introducido cada número.
		posicion = 0;
		while(posicion < 10) {
			System.out.println(posicion + ":"+arrayenteros[posicion]+"veces");
			posicion = posicion + 1 ;
		}
	}
}
