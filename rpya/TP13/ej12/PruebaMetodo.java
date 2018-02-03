package ej12;
import comun.Console;
public class PruebaMetodo {	
	public static void main(String[] args) {
		int a = Console.readInt("Ingrese el valor de A: ");
		int b = Console.readInt("Ingrese el valor de B: ");
		System.out.println(a + " * " + b + " = " + producto(a, b));
		}
	public static int producto(int a, int b){
		if (b == 1)
			return a;
		else
			return a + producto(a, b - 1);
	}
}
