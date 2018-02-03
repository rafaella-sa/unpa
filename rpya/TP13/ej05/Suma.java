package ej05;
import comun.Console;
public class Suma {
	public static int suma (int n){
		if (n == 1)
			return 1;
		else
			return (n + suma(n-1));
	}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un número cualquiera: ");
		System.out.println("Resultado: " + suma(n));	
		}

}
