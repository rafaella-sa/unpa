package ejercicio16;

import comun.Console;

public class PruebaCombinacion {

	public static void main(String[] args) {
		int n=Console.readInt("Ingrese un numero");
		int k=Console.readInt("Ingrese otro numero");
		System.out.println("La convinacion es: "+combinaciones(n,k));
		
	}
	static int combinaciones(int n, int k){
		if(k==1)
			return n;
		else
			if(k==n)
				return 1;
			else
				return (combinaciones(n-1,k-1)+combinaciones(n-1,k));
	}
}
