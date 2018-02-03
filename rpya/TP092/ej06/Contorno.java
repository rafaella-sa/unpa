package ej06;

import comun.Console;

public class Contorno {

	public static void main(String[] args) {
		//declaraciones
		int DIM = 100;
		int [][] mat;
		mat = new int [DIM][DIM];
		int i;
		int j;
		int m;
		int n;
		
		//carga y validación de dimensiones
		System.out.println("Ingrese la cantidad de filas: ");
		m = Console.readInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		n = Console.readInt();
		while (m <= 2 || m > DIM || n <= 2 || n > DIM){
			System.out.println("Error. Reingrese las dimensiones: ");
			m = Console.readInt();
			n = Console.readInt();
		}
		
		//carga de datos
		System.out.println("Ingrese los elementos de la matriz: ");
		for (i = 0; i < m; i++){
			for (j = 0; j < n; j++){
				mat[i][j] = Console.readInt();
			}
		}
		
		//muestra del contorno
		System.out.println("Elementos del contorno: ");
		for (i = 0; i < m; i++){
			for (j = 0; j < n; j++){
				if (i == 0 || i == m-1 || j == 0 || j == n-1)		
					System.out.println(mat[i][j]);
			}
		}
	}
}
