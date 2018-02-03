package tp13;
import Comun.Console;
class Nueve {
int G (int x, int y){
	if (x <= y)
		return 1;
	else
		return (G(x, y+1) + 1);
}
	public static void main(String[] args) {
		int x = Console.readInt("Ingrese el valor de x: ");
		int y = Console.readInt("Ingrese el valor de y: ");
		Nueve valor = new Nueve();
		System.out.println("Resultado: " + valor.G(x, y));
	}

}
