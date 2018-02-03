package ej04;

import comun.Console;

public class Matrices {

	public static void main(String[] args) {
		//declaraciones
		int I;
		int J;
		int M;
		int N;
		int POSF;
		int POSC;
		int DIM = 100;
		int [][] MAT;
		MAT = new int [DIM][DIM];
		
		//a)
		System.out.println("Ingrese las dimensiones: ");
		M = Console.readInt();
		N = Console.readInt();
		while (M <= 0 | M > DIM | N <= 0 | N >= DIM){
			System.out.println("Error. Reingrese las dimensiones: ");
			M = Console.readInt();
			N = Console.readInt();
		}
		
		//b)
		System.out.println("Ingrese los valores de la matriz: ");
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
			MAT [I][J] = Console.readInt();
		}
		}
		
		//c)
		System.out.println("Los elementos de la matriz son: ");
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
			System.out.println(MAT[I][J]);
		}
		}
		
		//d)
		System.out.println("Ingrese una posición cualquiera de la matriz: ");
		POSF = Console.readInt();
		POSC = Console.readInt();
		while (POSF <= 0 | POSF > M | POSC <= 0 | POSC > N){
			System.out.println("Error. Reingrese la posición: ");
			POSF = Console.readInt();
			POSC = Console.readInt();
		}
		System.out.println("El valor en esta posición es: " + MAT[POSF-1][POSC-1]);
	}

}
