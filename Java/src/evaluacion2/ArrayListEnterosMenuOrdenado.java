package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		
		// necesidades previas
		int opcion;
		Integer valor;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// creo el objeto Scanner teclado 
		Scanner teclado; 		
		teclado = new Scanner(System.in); 
		
		// escribo el menu
		System.out.println("1.Añadir Integer");
		System.out.println("2.Buscar Integer");
		System.out.println("3.Borrar Integer");
		System.out.println("4.Listar Array");
		System.out.println("0.Salir");
		// pido la opcion
		System.out.println("Opcion: ");
		opcion = teclado.nextInt();
		
		while(opcion != 0) {
			// con cada opcion
			switch (opcion) {
			case 1:
				// pido un Entero
				System.out.println("Introduce un Entero: ");
				valor = teclado.nextInt();
				// si todavía no existe
				if(!arrayList.contains(valor)) {
					// añado la palabra
					arrayList.add(valor);
				}
				break;
			case 2:
				// pido un Entero
				System.out.println("Introduce un Entero: ");
				valor = teclado.nextInt();
				// la busca en el arrayList 
				if(arrayList.contains(valor)) {
					// Si lo encuentra lo muestra y
					System.out.println("El valor "+ valor + " está en el arrayList");
				}
				else {
					// si NO lo encuentra muestra un mensaje de error.
					System.out.println("Error. El valor "+ valor + " NO está en el arrayList");
				}
				break;
			case 3:
			// pido un Entero
				System.out.println("Introduce un Entero: ");
				valor = teclado.nextInt();
				// la busca en el arrayList 
				if(arrayList.contains(valor)) {
					// Si lo encuentra lo borra
					arrayList.remove(valor);
					System.out.println("El valor "+ valor + " ha sido borrado del arrayList");
				}
				else {
					// si NO la encuentra muestra un mensaje de error.
					System.out.println("Error. El valor " + valor +  " NO está en el arrayList");
				}
				break;
			case 4:
				// Muestra todos los elementos del arrayList por pantalla, 
				// si es que tiene elementos, 
				// ordenados alfabéticamente
				Collections.sort(arrayList);
				for(int posicion=0;posicion<arrayList.size();posicion++) {
					System.out.println(arrayList.get(posicion));
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
