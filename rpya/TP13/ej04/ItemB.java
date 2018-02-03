package ej04;
import comun.Console;
public class ItemB {
	public static int f(int n){
		if(n == 0 || n == 1)
			return 1;
		else
			return (3 * f(n - 2) + 2);
	}
	public static void main(String[] args) {
		int n  = Console.readInt("Ingrese el valor de N: ");
		System.out.println("Resultado: " + f(n));		
	}
}
