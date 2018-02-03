package ej14;
import comun.Console;
public class MaximoComunDivisor {
	int maximoComunDivisor(int x, int y){
		if(y <= x && x%y == 0)
			return y;
		else
			if(x<y)
				return maximoComunDivisor(y, x);
			else
				return maximoComunDivisor(y, x%y);
	}
	public static void main(String[] args) {
		MaximoComunDivisor max = new MaximoComunDivisor();
		int x = Console.readInt("Ingrese el valor de X: ");
		int y = Console.readInt("Ingrese el valor de y: ");
		System.out.println("Máximo Comun Divisor = " + max.maximoComunDivisor(x, y));

	}

}
