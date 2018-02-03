package tp13;
import Comun.Console;
class Dos {
	int concurso (int base, int limite){
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
	Dos c = new Dos ();
	System.out.print("Resultado: " + c.concurso(base, limite));
}
}
