package ej06;
import comun.Console;
public class SumaPares {
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un número cualquiera: ");
		if (n%2 == 0)
			System.out.println("Resultado: " + suma(n));
		else
			System.out.println("El método no se ejecuta con números impares.");
	}
	public static int suma (int n){
		if (n == 0)
			return 0;
		else
			return (n + suma(n-2));
	}
}
