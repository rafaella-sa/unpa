package ej06;

import comun.Console;

public class Contorno {
	public static void main(String[] args) {
		//declaraciones
		int DIM = 100;
		int [][] MAT;
		MAT = new int [DIM][DIM];
		int I;
		int J;
		int M;
		int N;
		
		//carga y validación de dimensiones
		System.out.println("Ingrese la cantidad de filas: ");
		M = Console.readInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		N = Console.readInt();
		while (M <= 0 | M > DIM | N <= 0 | N > DIM){
			System.out.println("Error. Reingrese las dimensiones: ");
			M = Console.readInt();
			N = Console.readInt();
		}
		
		//carga de datos
		System.out.println("Ingrese los elementos de la matriz: ");
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
				MAT[I][J] = Console.readInt();
			}
		}
		
		//muestra del contorno
		System.out.println("Elementos del contorno: ");
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
				if (I == 0 | I == M-1 | J == 0 | J == N-1)		
					System.out.println(MAT[I][J]);
			}
		}
	}
}
