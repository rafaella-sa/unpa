package tp13;
import Comun.Console;
class Tres {
	int potencia (int m, int n){
		if (n == 0)
			return 1;
		else 
			return (m * potencia(m, n - 1)); 
	}
	int factorial (int x){
		if (x > 0)
			return (x * factorial (x - 1));
		else
			if (x == 0)
				return 1;
			else
				return -1;
	}
	public static void main(String[] args) {
		Tres P = new Tres();
		Tres F = new Tres();
		int m = Console.readInt("Ingrese un número cualquiera: ");
		int n = Console.readInt("Ingrese el exponente del número " + m + ": ");
		System.out.println("Resultado: " + m + " elevado a " + n + " es igual a " + P.potencia(m, n));
		int x = Console.readInt("Ingrese un número para el cálculo del factorial: ");
		System.out.println("Resultado: el factorial de " + x + " es: " + F.factorial(x));
	}

}
