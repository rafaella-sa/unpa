package tp13;
import Comun.Console;
class Uno {
	int puzzle (int base, int limite){
		if (base > limite)
			return -1;
		else
			if (base == limite)
				return 1;
			else
				return (base * puzzle(base + 1, limite));
	}
	public static void main(String[] args) {
		int base = Console.readInt("Ingrese la base del m�todo: ");
		int limite = Console.readInt("Ingrese el l�mite del m�todo: ");
		Uno P = new Uno();
		System.out.println("Resultado: " + P.puzzle(base, limite));
	}

}
