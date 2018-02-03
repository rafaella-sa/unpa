package ej5;

import comun.Console;

public class Intercambio {

	public static void main(String[] args) {
		System.out.println("Ingrese los valores de A, B y C:");
		int A = Console.readInt();
		int B = Console.readInt();
		int C = Console.readInt();
		int D = C;
		B = A;
		C = A;
		A = D;
		System.out.println("El valor de A es: " + A);
		System.out.println("El valor de B es: " + B);
		System.out.println("El valor de C es: " + C);
		}

}
