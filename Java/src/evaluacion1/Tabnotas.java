package evaluacion1;

import java.util.Scanner;

public class Tabnotas {

	public static void main(String[] args) {
		/*
		 * lee la nota de un alumno por teclado y muestra por pantalla la calificación
		 * que le corresponde sabiendo que si NOTA CALIFICACION >=0 y <3 MD >=3 y <5 INS
		 * >=5 y <6 SUF >=6 y <7 BIEN >=7 y <9 NOT >=9 y <=10 SOBRE
		 */
		// Necesidades previas
		int nota;

		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer nota
		System.out.println("Nota: ");
		nota = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();

		if (nota >= 0) {
			if (nota < 3) {
				System.out.println("MD");
			}
			else if(nota < 5) {
				System.out.println("INS");
			}
			else if(nota < 6) {
				System.out.println("SUF");
			}
			else if(nota < 7) {
				System.out.println("BIEN");
			}
			else if(nota < 9) {
				System.out.println("NOT");
			}
			else if(nota <= 10) {
				System.out.println("SOBRE");
			}
		}
	}

}
