package ej14;
import comun.Console;
public class MaximoComunDivisor {
	int maximoComunDivisor(int x, int y){
		if(y <= x && x%y == 0)
			return y;
		else
			if(x < y)
				return maximoComunDivisor(y, x);
			else
				return maximoComunDivisor(y, x%y);
	}
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese el valor de X: ");
		int y = Console.readInt("Ingrese el valor de Y: ");
		MaximoComunDivisor obj = new MaximoComunDivisor();
		System.out.println("El máximo comun divisor de " + x + " y " + y + " es: " + obj.maximoComunDivisor(x, y));
	}
}
