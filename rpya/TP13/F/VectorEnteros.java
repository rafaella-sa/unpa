package F;

import Comun.Console;

public class VectorEnteros {
public int factorial(int n){
	if(n==0)
		return 1;
	else
		return n* factorial(n-1);
}
	public static void main(String[] args) {
	VectorEnteros o=new VectorEnteros();
	int n=Console.readInt("ingrese un numero para calcular eñ factorial");
	System.out.println("el factorial de es:" +o.factorial(n));
	}

}
