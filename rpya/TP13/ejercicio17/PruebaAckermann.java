package ejercicio17;

import comun.Console;

public class PruebaAckermann {
	public static void main(String[] args) {
		int m=Console.readInt("Ingrese un numero");
		int n=Console.readInt("Ingrese otro numero");
		System.out.println(arckermann(m,n));
		
	}
	static int arckermann(int m, int n){
		if(m==0)
			return n+1;
		else
			if(n==0)
				return arckermann(m-1,1);
			else
				return (arckermann(m-1,(arckermann(m,n-1))));
	}
}
