package tp13;
import Comun.Console;
class Siete {
	int suma (int n){
		if (n == 0)
			return 0;
		else
			return (n + suma(n-2));
	}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un n�mero cualquiera: ");
		Siete numero = new Siete();
		if (n%2 == 0)
			System.out.println("Resultado: " + numero.suma(n));
		else
			System.out.println("El m�todo no se ejecuta con n�meros impares.");
	}
}
