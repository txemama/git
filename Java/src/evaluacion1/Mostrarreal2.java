package evaluacion1;

public class Mostrarreal2 {

	public static void main(String[] args) {
		/*
		 * coge el valor de una variable de tipo real con decimales (double)  y 
		 * lo muestra por pantalla
		 */
		double n;
		n = Math.PI;
		System.out.println("El valor de la variable es " + n);
		System.out.printf("El valor de la variable es %f", n);
		System.out.printf("\nEl valor de la variable es %.2f", n);
	}

}
