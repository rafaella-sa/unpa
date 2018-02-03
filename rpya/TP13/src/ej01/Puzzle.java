package ej01;
import comun.Console;
public class Puzzle {
	public static void main(String[] args) {
		int base = Console.readInt("Ingrese la base del m�todo: ");
		int limite = Console.readInt("Ingrese el l�mite del m�todo: ");
		System.out.println("Resultado: " + puzzle(base, limite));	
	}
	public static int puzzle (int base, int limite){
		if (base > limite)
			return -1;
		else
			if (base == limite)
				return 1;
			else
				return (base * puzzle(base + 1, limite));
	}
}
