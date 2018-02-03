package ej03;
import comun.Console;
public class Factorial {
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese un número para el cálculo del factorial: ");
		System.out.println("Resultado: el factorial de " + x + " es: " + factorial(x));
	}
	public static int factorial (int x){
		if (x > 0)
			return (x * factorial (x - 1));
		else
			if (x == 0)
				return 1;
			else
				return -1;
	}
}
