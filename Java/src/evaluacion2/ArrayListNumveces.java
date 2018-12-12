package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		// necesidades previas
		int n,valor;
		
		// creo el arrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// lo inicializo con 10 elementos
		for(int posicion=0;posicion<10;posicion++) {
			arrayList.add(0);
		}
		
		// Pide números de 0 a 9 por pantalla y 
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leo un valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();
		// calcula el número de veces que han sido introducidos utilizando un array. 
		// Finaliza la introducción de datos cuando se introduce un valor negativo o mayor que 9. 
		while(n>=0 && n <=9) {
			// cojo el valor que hay en esa posicion en arrayList
			valor = arrayList.get(n);
			// le sumo 1
			valor = valor + 1;
			// actualizo el valor que hay en esa posicion en arrayList
			arrayList.set(n, valor);
			
			// leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		}
		
		// libero la memoria asignadada al objeto llamado teclado
		teclado.close();
		
		// muestro el contenido del arrayList
		for(int posicion=0;posicion<arrayList.size();posicion++) {
			valor = arrayList.get(posicion);
			System.out.println(posicion + ": "+valor+"veces");
		}
	}
}
