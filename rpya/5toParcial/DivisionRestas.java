package ej02;
import comun.Console;
public class DivisionRestas {
	public static void main(String[] args) {
		int a = Console.readInt("Ingrese el valor de A: ");
		int b = Console.readInt("Ingrese el valor de B: ");
		if(a < b)
			System.out.println("No se permite hacer la divisi�n.");
		else
			System.out.println("A/B = " + a + "/" + b + " = " + divisionPorRestas(a, b));
	}
	//m�todo recursivo que permite hacer la divisi�n por restas
	//precondici�n: los valores enteros de A y B
	//postcondici�n: el resultado entero de la divisi�n
	public static int divisionPorRestas(int a, int b){
		/*Caso base que permite el c�lculo cuando A y B no hacen una divisi�n exacta.
		 * Ejemplo: 14/5 = 2 (14%5 = 4).
		 */
		if(a%b!=0) 
			return divisionPorRestas(a - 1, b);
		else
			/*caso base que hace el c�lculo de la divisi�n cuando A%B == 0.
			* Ejemplo: 15/3 = 5.
			*/
			if(a - b == 0)
				return 1;
			else //llamador m�s peque�o
				return 1 + divisionPorRestas(a - b, b);
	}
}
