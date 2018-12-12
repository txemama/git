package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenas {

	public static void main(String[] args) {
		// recibe Strings por teclado hasta que se introduce un String en blanco y 
		// los va almacenando en un ArrayList. 
		// Cuando finaliza la introducción muestra el contenido del array por pantalla
		
		// necesidades previas
		String cadena;
		ArrayList<String> arrayListString = new ArrayList<String>();
		
		// creo el objeto Scanner teclado 
		Scanner teclado; 		
		teclado = new Scanner(System.in); 
		
		// leo una cadena
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		while(!cadena.isEmpty()) {
			// añado la cadena al arrayList
			arrayListString.add(cadena);
			
			// leo otra cadena
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
		}
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// muestro el contenido del arrayList
		for(int posicion=0;posicion<arrayListString.size();posicion++) {
			System.out.println(arrayListString.get(posicion));
		}
	}

}
