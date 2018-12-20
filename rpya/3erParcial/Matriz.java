package ej02;

public class Matriz {
	private double elementos[][];
	private int actualfila, actualcolumna, dimension, i;
	
	//constructor de la matriz
	Matriz(int DIM){
		if (DIM <= 0)
			dimension = 100;
		else
			dimension = DIM;
		actualfila = 0;
		actualcolumna = 0;
		elementos = new double [DIM][DIM]; 		
	}
	
	//carga de datos de la matriz
	public void cargarMatriz(double elem){
		elementos[actualfila][actualcolumna] = elem;
		if (actualcolumna < dimension)
			actualcolumna = actualcolumna + 1;
		else{
			actualcolumna = 0;
			actualfila = actualfila + 1;			
		}
		if (actualfila == dimension)
			actualcolumna = dimension;			
	}
	
	//verificación de elementos de las diagonales principal y opuesta
	public boolean verificarDiagonales(){
		boolean mayorigual = false;
		i = 0;
		while (i < actualfila && mayorigual == false){
			if (elementos[i][i] >= elementos [actualfila-1-i][actualfila-1-i])
				mayorigual = true;
			else
				mayorigual = false;
			i++;
		}
		return mayorigual;
	}
	
	//sumar elementos de una fila determinada
	public double sumarFila(int fila){
		int i;
		double suma = 0.0;
		for(i = 0; i < actualcolumna; i++)
			suma = suma + elementos[fila][i];
		return suma;
	}
	
	//sumar elementos de una columna determinada
	public double sumarColumna(int columna){
		int i;
		double suma = 0.0;
		for (i = 0; i < actualfila; i++)
			suma = suma + elementos[i][columna];
		return suma;		
	}
}
