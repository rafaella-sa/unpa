package Punto9;

public class Main {
	public static void main(String[] args) {
		Cola c = new Cola();
		Pila p = new Pila();
		String elem;
		int i;
		System.out.println("Ingrese una cadena de caracteres");
		elem = Console.readString("");
		char arr[] = elem.toCharArray();
		for (i = 0; i < elem.length(); i++) {
			System.out.println("" + arr[i]);
			c.insertar(elem.charAt(i));
			p.meter(elem.charAt(i));
		}
		if (p.esPalindromo(p) == true) {
			System.out.println("Pila: La palabra es Palindromo");

		} else
			System.out.println("Pila: La palabra no es Palindromo");
		
		if (c.esPalindromo(c) == true) {
			System.out.println("Cola: La palabra es Palindromo");

		} else
			System.out.println("Cola: La palabra no es Palindromo");
	}
}
