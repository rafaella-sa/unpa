package ej08;

import comun.Console;

public class Sumayproducto {

	public static void main(String[] args) {
		System.out.println("Ingrese tres numeros enteros: ");
		int NUM1 = Console.readInt();
		int NUM2 = Console.readInt();
		int NUM3 = Console.readInt();
		int PRODUCTO = NUM1 * NUM2 * NUM3;
		int SUMA = NUM1 + NUM2 + NUM3;
		System.out.println("Suma de enteros: " + SUMA);
		System.out.println("Producto de enteros: " + PRODUCTO);
	}

}
