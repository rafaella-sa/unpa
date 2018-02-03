package ej09;
import comun.Console;
public class Main_Cadena {
	public static void main(String[] args) {
		Pila p = new Pila();
		Cola c = new Cola();
		String cadena = Console.readString("Ingrese la cadena: ");
		for(int i = 0; i < cadena.length(); i++){
			p.meter(cadena.charAt(i));
			c.insertar(cadena.charAt(i));
		}
		if(c.esPalindromo(p))
			System.out.println("La cadena ingresada es un palíndromo.");
		else
			System.out.println("La cadena ingresada NO es un palíndromo.");
	}
}
