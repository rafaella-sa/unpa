package ej02;
import comun.Console;
public class DivisionRestas {
	public static void main(String[] args) {
		int a = Console.readInt("Ingrese el valor de A: ");
		int b = Console.readInt("Ingrese el valor de B: ");
		if(a < b)
			System.out.println("No se permite hacer la división.");
		else
			System.out.println("A/B = " + a + "/" + b + " = " + divisionPorRestas(a, b));
	}
	//método recursivo que permite hacer la división por restas
	//precondición: los valores enteros de A y B
	//postcondición: el resultado entero de la división
	public static int divisionPorRestas(int a, int b){
		/*Caso base que permite el cálculo cuando A y B no hacen una división exacta.
		 * Ejemplo: 14/5 = 2 (14%5 = 4).
		 */
		if(a%b!=0) 
			return divisionPorRestas(a - 1, b);
		else
			/*caso base que hace el cálculo de la división cuando A%B == 0.
			* Ejemplo: 15/3 = 5.
			*/
			if(a - b == 0)
				return 1;
			else //llamador más pequeño
				return 1 + divisionPorRestas(a - b, b);
	}
}
