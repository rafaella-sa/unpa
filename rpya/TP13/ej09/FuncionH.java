package ej09;
import comun.Console;
public class FuncionH {
	public static int H (int x){
		if (x == 1)
			return 1;
		else
			return (H(x/2)+1);
	}
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese un número entero: ");
		System.out.println("Resultado: " + H(x));
	}

}
