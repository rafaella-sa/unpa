package ej02;

import comun.Console;

public class Main_Matriz {

	public static void main(String[] args) {
		//declaración de variables
		int i, j, N, TOPE;
		double num;
		Matriz M1, M2;
		
		//carga de datos
		TOPE = Console.readInt("Ingrese la dimensión de las matrices: ");
		
		//creación de las matrices
		M1 = new Matriz(TOPE);
		M2 = new Matriz(TOPE);
		
		//carga de las matrices
		for (i = 0; i < TOPE; i++)
			for (j = 0; j < TOPE; j++){
				num = Console.readDouble("Ingrese un valor en la posición " + i + " " + j);
				M1.cargarMatriz(num);
			}
		for (i = 0; i < TOPE; i++)
			for (j = 0; j < TOPE; j++){
				num = Console.readDouble("Ingrese un valor en la posición " + i + " " + j);
				M2.cargarMatriz(num);
			}
		
		//verificación de los elementos de las diagonales de la primera matriz
		if(M1.verificarDiagonales())
			System.out.println("Los elementos de la diagonal principal son mayores o iguales que la diagonal opuesta.");
		else
			System.out.println("Los elementos de la diagonal principal NO son mayores o iguales que la diagonal opuesta.");	
		
		//determinar si dos matrices tienen igual contenido
		if(M1.equals(M2))
			System.out.println("Las dos matrices ingresadas tienen el mismo contenido.");
		else
			System.out.println("Las dos matrices ingresadas NO tienen el mismo contenido.");
		
		/*verificar si las sumas de los elementos de la fila de la primera matriz
		 * y de la columna de la segunda matriz son iguales
		 */
		N = Console.readInt("Ingrese una fila/columna para el cálculo: ");
		if (M1.sumarFila(N) == M2.sumarColumna(N))
			System.out.println("La suma de la fila " + N + " de la primera matriz es igual a la suma de la columna " + N + " de la segunda matriz.");
		else
			System.out.println("La suma de la fila " + N + " de la primera matriz NO es igual a la suma de la columna " + N + " de la segunda matriz.");
	}

}
