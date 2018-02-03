package ej07;
import comun.Console;
public class SumaSerie {
	public static double sumaSerie(double m, double n){
			if(n == 1)
				return m;
			else 		
				return Math.pow(m, n) + sumaSerie(m+1, n-1);
	}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese el valor de N: ");
		System.out.println("Resultado: " + sumaSerie(n, 1));
	}
}
