package Ejer22;
import Comun.Console;
public class Fibonacci {
	public int numF(int n){
		if(n==1)
			return 1;
		else{
			if(n==2)
				return 1;
			else
				return numF(n-1)+numF(n-2);
		}
	}
	public static void main(String[] args) {
	Fibonacci f= new Fibonacci();
	int n=Console.readInt("ingrse un numero");
	f.numF(n);
	System.out.println("EL numero en fibonacci es:" + f.numF(n));
	}
}