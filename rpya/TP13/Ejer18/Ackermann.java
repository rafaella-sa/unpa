package Ejer18;
import Comun.Console;
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
		Ackermann OBJ=new Ackermann();
		int m=Console.readInt("ingrse un numero");
		int n=Console.readInt("ingrse un numero");
		System.out.println("El resultado de la funcion es:" + OBJ.funcionA(m, n));
}

}
