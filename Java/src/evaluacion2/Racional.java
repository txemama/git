package evaluacion2;

public class Racional implements Comparable<Racional>{
	// defino la clase Racional
	// propiedades
	private int numerador;
	private int denominador;
	
	// metodos
	// constructor por defecto
	public Racional(){
		this.numerador = 0;
		this.denominador = 1;
	}
	// constructores personalizados
	public Racional(int n, int d) {
		this.numerador = n;
		this.denominador = d;
	}
	public Racional(int n) {
		this.numerador = n;
		this.denominador = 1;
	}
	// constructor copia
	public Racional(Racional r) {
		this.numerador = r.numerador;
		this.denominador = r.denominador;
	}
	
	// toString
	@Override
	public String toString() {
		return (this.numerador + "/" + this.denominador);
	}
	// Getters and Setters
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	// hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominador;
		result = prime * result + numerador;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		// comparo las propiedades de los objetos
		Racional other = (Racional) obj;
		if((this.numerador*other.denominador) == (other.numerador*this.denominador)) {
			return true;
		}
		return false;
	}
	// compareTo
	@Override
	public int compareTo(Racional other) {
		if((this.numerador*other.denominador) > (other.numerador*this.denominador)) {
			return 1;
		}
		else if((this.numerador*other.denominador) < (other.numerador*this.denominador)) {
			return -1;
		}
		return 0;
	}
	
}
