package tp13;
import Comun.Console;
public class Seis {
	int suma (int n){
		if (n == 1)
			return 1;
		else
			return (n + suma(n-1));
	}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un número cualquiera: ");
		Seis numero = new Seis();
		System.out.println("Resultado: " + numero.suma(n));
	}

}
