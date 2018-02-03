package ej04;
import comun.Console;
public class ItemC {
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese el valor de N: ");
		System.out.println("Resultado: " + f(n));
	}
	public static int f(int n){
		if(n == 0)
			return 1;
		else
			if(n == 1)
				return 2;
			else
				return (2 * f(n - 2) + f(n - 1));
	}
}
