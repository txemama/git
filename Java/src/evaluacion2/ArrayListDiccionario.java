package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {
		
		// necesidades previas
		int opcion;
		String palabra;
		ArrayList<String> diccionario = new ArrayList<String>();
		
		// creo el objeto Scanner teclado 
		Scanner teclado; 		
		teclado = new Scanner(System.in); 
		
		// escribo el menu
		System.out.println("1.Añadir Palabra");
		System.out.println("2.Buscar Palabra");
		System.out.println("3.Borrar Palabra");
		System.out.println("4.Listar Diccionario");
		System.out.println("0.Salir");
		// pido la opcion
		System.out.println("Opcion: ");
		opcion = teclado.nextInt();
		
		while(opcion != 0) {
			// con cada opcion
			switch (opcion) {
			case 1:
				// pido una palabra
				// limpio el buffer
				teclado.nextLine();
				System.out.println("Introduce una palabra: ");
				palabra = teclado.nextLine();
				// si todavía no existe
				if(!diccionario.contains(palabra)) {
					// añado la palabra
					diccionario.add(palabra);
				}
				break;
			case 2:
				// pido una palabra
				// limpio el buffer
				teclado.nextLine();
				System.out.println("Introduce una palabra: ");
				palabra = teclado.nextLine();
				// la busca en el diccionario. 
				if(diccionario.contains(palabra)) {
					// Si la encuentra la muestra y
					System.out.println("La palabra "+ palabra + " está en el diccionario");
				}
				else {
					// si NO la encuentra muestra un mensaje de error.
					System.out.println("Error. La palabra "+ palabra + " NO está en el diccionario");
				}
				break;
			case 3:
				// pido una palabra
				// limpio el buffer
				teclado.nextLine();
				System.out.println("Introduce una palabra: ");
				palabra = teclado.nextLine();
				// la busca en el diccionario. 
				if(diccionario.contains(palabra)) {
					// Si la encuentra la borra y
					diccionario.remove(palabra);
					System.out.println("La palabra "+ palabra + " ha sido borrada del diccionario");
				}
				else {
					// si NO la encuentra muestra un mensaje de error.
					System.out.println("Error. La palabra "+ palabra + " NO está en el diccionario");
				}
				break;
			case 4:
				// Muestra todos los elementos del diccionario por pantalla, 
				// si es que tiene elementos, 
				// ordenados alfabéticamente
				Collections.sort(diccionario);
				for(int posicion=0;posicion<diccionario.size();posicion++) {
					System.out.println(diccionario.get(posicion));
				}
				break;
			}
			
			// pido otra opcion
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
		}
		
		// cierro teclado
		teclado.close();
	}

}
