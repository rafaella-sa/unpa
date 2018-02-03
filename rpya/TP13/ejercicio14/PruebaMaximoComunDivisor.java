package ejercicio14;

import comun.Console;

public class PruebaMaximoComunDivisor {

	public static void main(String[] args) {
		int x=Console.readInt("Ingrese un numero");
		int y=Console.readInt("Ingrese otro numero");
		System.out.println("El maximo comun division es: "+maximoComunMenor(x,y));
		
	}
	static int maximoComunMenor(int x,int y){
		if(y<=x & x%y==0)
			return y;
		else{ 
			if(x<y)
				return maximoComunMenor(y,x);
			else
				return  maximoComunMenor(y,x%y);
		}
	}
}
