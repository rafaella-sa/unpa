package Ejer08;
import Comun.Console;
public class SumaP {
	
	public int potencia(int n, int m){
		if(n==0)
			return 1;
		else
			return (n*potencia(n,m-1));
	}
	public int sumaP(int n, int m){
		if(m==1)
			return m;
		else
			return (sumaP (n+1, m-1))+ potencia(n, m);
	}
	public static void main(String[] args) {
	SumaP s=new SumaP();
	int n=Console.readInt("ingrese un elemento");
	int m=Console.readInt("ingrese el exponente");
	System.out.println("el resultado es:" + s.sumaP(n, m));
	}
}