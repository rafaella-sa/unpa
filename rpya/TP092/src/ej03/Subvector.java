package ej03;

import comun.Console;

public class Subvector {
	public static void main(String[] args) {
		//declaraciones
		int TOPE = 100;
		int [] VEC;
		VEC = new int [TOPE];
		int I;
		int N;
		int POS1;
		int POS2;
		
		//carga de datos
		System.out.println("Ingrese la dimensión del vector: ");
		N = Console.readInt();
		while (N <= 0 | N > TOPE){
			System.out.println("Error. Reingrese la dimensión del vector: ");
			N = Console.readInt();
		}
		for (I = 0; I < N; I++){
			System.out.println("Ingrese un valor en la posición: " + I);
			VEC [I] = Console.readInt();
		}
		
		//generación y muestra del subvector
		System.out.println("Generación del subvector: ");
		POS1 = Console.readInt("Ingrese la primera posición: ");
		while (POS1 <= 0 | POS1 > N){
			POS1 = Console.readInt("Error. Reingrese la primera posición: ");
		}
		POS2 = Console.readInt("Ingrese la segunda posición: ");		
		while (POS2 <= 0 | POS2 > N | POS2 <= POS1){
			POS2 = Console.readInt("Error. Reingrese la segunda posición: ");
		}
		System.out.println("El subvector es: ");
		for (I = POS1 - 1; I < POS2; I++){
			System.out.println(VEC[I]);
		}
	}
}
