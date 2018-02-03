package ej02;

import comun.Console;

public class Tresvectores {
	public static void main(String[] args) {
		//declaraciones
		int I;
		int J = 0;
		int K = 0;
		int N;
		int TOPE = 100;
		int [] VECO;
		VECO = new int [TOPE];
		int [] VECP;
		VECP = new int [TOPE];
		int [] VECI;
		VECI = new int [TOPE];
		
		//carga de datos
		System.out.println("Ingrese la dimensión del vector: ");
		N = Console.readInt();
		while (N <= 0 | N > TOPE){
			System.out.println("Error. Reingrese la dimensión: ");
			N = Console.readInt();
		}
		for (I = 0; I <N; I ++){
			System.out.println("Ingrese un valor en la posición: " + I);
			VECO [I] = Console.readInt();
		}
		
		//cálculo y carga de los vectores auxiliares
		for (I = 0; I < N; I++){
			if (VECO [I] %2 == 0){
				VECP [J] = VECO [I];
				J++;
			}
			else{
				VECI [K] = VECO [I];
				K++;
			}
		}
		
		//muestra de los vectores
		System.out.println("Elementos del vector original: ");
		for (I = 0; I < N; I++){
			System.out.println(VECO [I]);
		}
		System.out.println("Elementos del vector auxiliar de pares: ");
		for (I = 0; I < J; I++){
			System.out.println(VECP [I]);
		}
		System.out.println("Elementos del vector auxiliar de impares: ");
		for (I = 0; I < K; I++){
			System.out.println(VECI [I]);
		}
	}

}
