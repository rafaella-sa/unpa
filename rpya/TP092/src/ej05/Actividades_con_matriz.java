package ej05;

import comun.Console;

public class Actividades_con_matriz {
	public static void main(String[] args) {
		//declaraciones
		int DIM = 100;
		int [][] MAT;
		MAT = new int [DIM][DIM];
		int I;
		int J;
		int M;
		int N;
		int MAYOR;
		int SUMA;
		double P;
		double MP;
		
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
		
		//a) búsqueda del mayor elemento
		MAYOR = MAT[0][0];
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
				if (MAT[I][J] > MAYOR){
					MAYOR = MAT[I][J];
				}
			}
		}
		System.out.println("El mayor elemento de la matriz es: " + MAYOR);
		
		//b) obtención del promedio de cada fila y el mayor promedio
		MP = 0.0;
		for (I = 0; I < M; I++){
			SUMA = 0;
			for (J = 0; J < N; J++){
				SUMA = SUMA + MAT[I][J];
			}
			P = SUMA/N;
			System.out.println("El promedio de la fila " + I + " es " + P);
			if(P > MP){
				MP = P;
			}
		}
		
		//c) obtención de la nueva matriz
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
				if (MAT[I][J] > 0){
					MAT[I][J] = 0;
				}
				else{
					MAT[I][J] = -1;
				}				
			}
		}
		System.out.println("La nueva matriz es: ");
		for (I = 0; I < M; I++){
			for (J = 0; J < N; J++){
				System.out.println(MAT[I][J]);
			}
		}
	}
}
