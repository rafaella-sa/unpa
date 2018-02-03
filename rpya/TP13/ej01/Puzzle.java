package ej01;
import comun.Console;
public class Puzzle {
	public static int puzzle (int base, int limite){
			if (base > limite)
				return -1;
			else
				if (base == limite)
					return 1;
				else
					return (base * puzzle(base + 1, limite));
		}
	public static void main(String[] args) {			
			int base = Console.readInt("Ingrese la base del método: ");
			int limite = Console.readInt("Ingrese el límite del método: ");
			System.out.println("Resultado: " + puzzle(base, limite));		
	}
}
