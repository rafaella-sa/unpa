package tp13;
import Comun.Console;
class Diez {
int H (int x){
	if (x == 1)
		return 1;
	else
		return (H(x/2)+1);
}
	public static void main(String[] args) {
		Diez n = new Diez();
		int x = Console.readInt("Ingrese un número entero: ");
		System.out.println("Resultado: " + n.H(x));
	}
}
