package evaluacion2;

public class RacionalMain {

	public static void main(String[] args) {
		// Clase para probar la clase Racional
		Racional r1 = new Racional();
		System.out.println(r1);// 0/1
		Racional r2 = new Racional(2,3); 
		System.out.println(r2);// 5/7
		Racional r3 = new Racional(3); 
		System.out.println(r3);// 3/1
		Racional r4 = new Racional(r2);
		System.out.println(r4);// 5/7
		// Getters and Setters
		int n;
		n = r4.getNumerador();
		int d;
		d = r4.getDenominador();
		System.out.println("Numerador: "+n+" Denominador: "+d);
		// hashCode and equals
		r4.setNumerador(4);
		r4.setDenominador(6);
		if(r4.equals(r2)) {
			// si son Iguales
			System.out.println(r4 + " y " + r2 + " son Iguales");
		}
		else {
			System.out.println(r4 + " y " + r2 + " NO son Iguales");
		}
		// compareTo
		if(r4.compareTo(r2) > 0) {
			System.out.println(r4 + " es MAYOR que " + r2);
		}
		else if(r4.compareTo(r2) < 0) {
			System.out.println(r4 + " es MENOR que " + r2);
		}
		else {
			System.out.println(r4 + " es IGUAL que " + r2);
		}

	}
}
