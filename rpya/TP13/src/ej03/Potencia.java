package ej03;
import comun.Console;
public class Potencia {
	public static void main(String[] args) {
		int m = Console.readInt("Ingrese un número cualquiera: ");
		int n = Console.readInt("Ingrese el exponente del número " + m + ": ");
		System.out.println("Resultado: " + m + " elevado a " + n + " es igual a " + potencia(m, n));
	}
	public static int potencia (int m, int n){
		if (n == 0)
			return 1;
		else 
			return (m * potencia(m, n - 1)); 
	}
}
