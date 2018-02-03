package ej03;

import comun.Console;

public class Subvector {
	public static void main(String[] args) {
		//declaraciones
		int TOPE = 100;
		int [] vec;
		vec = new int [TOPE];
		int i;
		int n;
		int pos1;
		int pos2;
		
		//carga de datos
		System.out.println("Ingrese la dimensión del vector: ");
		n = Console.readInt();
		while (n <= 0 || n > TOPE){
			System.out.println("Error. Reingrese la dimensión del vector: ");
			n = Console.readInt();
		}
		for (i = 0; i < n; i++){
			System.out.println("Ingrese un valor en la posición: " + i);
			vec [i] = Console.readInt();
		}
		
		//generación y muestra del subvector
		System.out.println("Generación del subvector: ");
		pos1 = Console.readInt("Ingrese la primera posición: ");
		while (pos1 <= 0 || pos1 > n){
			pos1 = Console.readInt("Error. Reingrese la primera posición: ");
		}
		pos2 = Console.readInt("Ingrese la segunda posición: ");		
		while (pos2 <= 0 || pos2 > n || pos2 <= pos1){
			pos2 = Console.readInt("Error. Reingrese la segunda posición: ");
		}
		System.out.println("El subvector es: ");
		for (i = pos1 - 1; i < pos2; i++){
			System.out.println(vec[i]);
		}
	}
}
