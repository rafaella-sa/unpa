package tp13;
import Comun.Console;
class Veintidos {
public int secF(int n, int x, int y){
if (n == 1)
	return 1;
else if (n == 2)
	return 1;
	else
		return secF2(x, y);
}
public int secF2(int x, int y){
	
}
	public static void main(String[] args) {
		int n = Console.readInt("Ingrese un valor n para el cálculo de la secuencia de Fibonacci: ");
		Veintidos Fibonacci = new Veintidos();
		int x = y = 1;
			
		System.out.println("Los primeros " + n + " numeros de la secuencia de Fibonacci son: " + Fibonacci.secF(n, x, y));

	}

}
