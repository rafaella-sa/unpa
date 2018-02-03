package ej08;
import comun.Console;
public class FuncionG {
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese el valor de x: ");
		int y = Console.readInt("Ingrese el valor de y: ");
		System.out.println("Resultado: " + G(x, y));
	}
	public static int G (int x, int y){
		if (x <= y)
			return 1;
		else
			return (G(x, y+1) + 1);
	}
}
