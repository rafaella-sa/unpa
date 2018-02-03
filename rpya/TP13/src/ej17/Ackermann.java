package ej17;
import comun.Console;
public class Ackermann {
	public int funcionA(int m, int n){
		if(m==0)
			return n+1;
		else{
			if(n==0)
				return funcionA(m-1, 1);
			else
				return funcionA(m-1,funcionA(m,n-1));
		}
	}
		public static void main(String[] args) {
			Ackermann obj = new Ackermann();
			int m = Console.readInt("Ingrese el valor de M: ");
			int n = Console.readInt("Ingrese el valor de N: ");
			System.out.println("El resultado de la función es: " + obj.funcionA(m, n));
	}
}
