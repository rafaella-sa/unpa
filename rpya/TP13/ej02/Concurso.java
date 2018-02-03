package ej02;
import comun.Console;
public class Concurso {
	public static int concurso (int base, int limite){
		if (base == limite)
			return 1;
		else		
			if (base > limite)
				return 0;
	return (base + concurso (base + 1, limite));
	}
	public static void main(String[] args) {
		int base = Console.readInt("Ingrese la base del método: ");
		int limite = Console.readInt("Ingrese el límite del método: ");
		System.out.print("Resultado: " + concurso(base, limite));
	}
}
