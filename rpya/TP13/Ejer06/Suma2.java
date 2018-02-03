package Ejer06;
import Comun.Console;
public class Suma {

	public int suma(int n){
		if(n==1)
			return 1;
		else
			 return n+(suma(n-1));
	}
	public static void main(String[] args) {
		Suma s=new Suma();
		int n=Console.readInt("ingrese un numero para realizar la suma");
		System.out.println("el resultado es:" +s.suma(n));

	}

}
