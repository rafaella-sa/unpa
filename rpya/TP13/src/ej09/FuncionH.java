package ej09;
import comun.Console;
public class FuncionH {
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese un n�mero entero: ");
		System.out.println("Resultado: " + H(x));
	}
	public static int H (int x){
		if (x == 1)
			return 1;
		else
			return (H(x/2)+1);
	}
}
