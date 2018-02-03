package tp13;
import Comun.Console;
class Ocho {
	
int potencia (int n, int m){
	if (m == 0)
		return 1;
	else
		return (n * potencia(n, m - 1));
}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un número cualquiera: ");
		Ocho numero = new Ocho();
		System.out.println("Resultado: ");
	}

}
