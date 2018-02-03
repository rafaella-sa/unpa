package ej08;

import comun.Console;

public class Funciones_vector {
		//a) funci�n que muestra los elementos de un vector
		//precondici�n: vector cargado
		//postcondici�n: muestra del vector
		static void mostrarVector (int []VECTOR, int TOPE){
			//declaraciones
			int X;
			//muestra del vector
			System.out.println("Elementos del vector: ");
			for (X = 0; X < TOPE; X++){
				System.out.println(VECTOR[X]);
			}
		}
		
		//b) funci�n que busca el mayor elemento del vector
		//precondici�n: vector cargado
		//postcondici�n: el mayor elemento
		static int buscarMayorelemento (int []VECTOR, int TOPE){
			//declaraciones
			int MAYOR;
			int X;
			//carga de datos
			MAYOR = 0;
			for (X = 0; X < TOPE; X++){
				if(VECTOR [X] > MAYOR)
					MAYOR = VECTOR [X];
			}
			return MAYOR;
		}
		
		//c) funci�n que muestra el vector en orden invertido
		//precondici�n: vector cargado
		//postcondici�n: vector en orden invertido
		static void invertirVector (int []VECTOR, int TOP){
			//declaraciones
			int X;
			int []VEC;
			VEC = new int [TOP];
			//inversi�n del vector y muestra del resultado
			for (X = 0; X < TOP; X++){
				VEC [TOP-1-X] = VECTOR[X];
			}
			mostrarVector (VEC, TOP);		
		}
	public static void main(String[] args) {
		//declaraciones
		int DIM = 100;
		int []VEC;
		VEC = new int [DIM];
		int I;
		int M;
		int N;
		
		//carga de datos
		System.out.println("Ingrese la dimensi�n del vector: ");
		N = Console.readInt();
		while (N <= 0 | N > DIM){
			System.out.println("Error. Reingrese la dimensi�n del vector: ");
			N = Console.readInt();			
		}
		System.out.println("Ingrese los elementos del vector: ");
		for (I = 0; I < N; I++){
			VEC [I] = Console.readInt();
		}
		
		//a)
		System.out.println("a) funci�n que muestra los elementos de un vector");
		mostrarVector(VEC, N);
		
		//b)
		System.out.println("b) funci�n que busca el mayor elemento del vector");
		M = buscarMayorelemento(VEC, N);
		System.out.println("El mayor elemento en el vector es " + M);
		
		//c)
		System.out.println("c) funci�n que muestra el vector en orden invertido");
		invertirVector(VEC, N);
		

	}

}
