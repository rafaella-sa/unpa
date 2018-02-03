package ej01;

import comun.Console;

public class Vectores {

	public static void main(String[] args) {
		//declaraciones
		int I; 
		int N;
		int POS;
		int DIM = 100;
		int [] VEC;
		VEC = new int [DIM];
		
		//a)
		System.out.println("Ingrese la dimensi�n: ");
		N = Console.readInt();
		while (N <= 0 | N >= DIM){
			System.out.println("Error. Reingrese la dimensi�n: ");
			N = Console.readInt();
		}
		
		//b)
		System.out.println("Ingrese los valores del vector: ");
		for (I = 0; I < N; I++){
			VEC [I] = Console.readInt();
		}
		
		//c)
		System.out.println("Los elementos del vector son: ");
		for (I = 0; I < N; I++){
			System.out.println(VEC[I]);
		}
		
		//d)
		System.out.println("Ingrese una posici�n cualquiera del vector: ");
		POS = Console.readInt();
		while (POS < 0 | POS >= N){
			System.out.println("Error. Reingrese la posici�n: ");
			POS = Console.readInt();
		}
		System.out.println("El valor en esta posici�n es: " + VEC[POS]);

	}

}
