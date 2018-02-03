package ej07;
import comun.Console;
public class SumaSerie {	
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese el valor de N: ");
		System.out.println("Resultado: " + sumaSerie(1, n));
	}
	public static double sumaSerie(int m, int n){
		if(n == 1)
			return Math.pow(m, n);
		else
			return Math.pow(m, n) + sumaSerie(m + 1, n - 1); 
	}
}
