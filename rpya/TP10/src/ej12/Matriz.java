package ej12;
public class Matriz {
	private int [][] elementos;
	private int dimensionfila, dimensioncolumna;
	private int actualfila, actualcolumna;	
	//constructor para la clase Matriz
	public Matriz (int dimf, int dimc){
		if (dimf <= 0 || dimc <= 0){
			dimensionfila = 100;
			dimensioncolumna = 100;
		}
		else{
			dimensionfila = dimf;
			dimensioncolumna = dimc;
		}
		actualfila = 0;
		actualcolumna = 0;
		elementos = new int [dimensionfila][dimensioncolumna];
	}	
	//a) método que agrega un elemento
	//precondición: elemento entero
	//postcondición: valor agregado si hay lugar en la matriz
	public void agregarElementos (int valor){
		elementos [actualfila][actualcolumna] = valor;
		if (actualcolumna == dimensioncolumna - 1){
			actualcolumna = 0;
			actualfila = actualfila + 1;
		}
		else
			actualcolumna = actualcolumna + 1;
		if (actualfila == dimensionfila)
			actualcolumna = dimensioncolumna;
	}	
	//b) método que devuelve el elemento de determinada posición
	//precondiciones: posición de la matriz (fila y columna)
	//postcondición: elemento de la posición
	public int mostrarElemento (int f, int c){
		int num = 0;
		if (f > 0 && f <= dimensionfila && c > 0 && c <= dimensioncolumna)
			num = elementos [f-1][c-1];
		return num;
	}	
	//c) método que muestra la matriz
	//precondición: matriz con elementos
	//postcondición: muestreo de los elementos de la matriz
	public void mostrarMatriz (){
		int fil, col;
		for (fil = 0; fil < dimensionfila; fil++)
			for (col = 0; col < dimensioncolumna; col++)
				System.out.println(elementos[fil][col]);
	}	
	//d) método que muestra los elementos de una determinada fila
	//precondición: la fila deseada
	//postcondición: elementos de la fila seleccionada
	public void mostrarFila (int fi){
		int c;
		if (fi > 0 && fi <= dimensionfila)
			for (c = 0; c < dimensioncolumna; c++)
				System.out.println (elementos [fi-1][c]);
	}	
	//e) método que muestra los elementos de una determinada columna
	//precondición: la columna deseada
	//postcondición: elementos de la columna seleccionada
	public void mostrarColumna (int co){
		int f;
		if (co > 0 && co <= dimensioncolumna)
			for (f = 0; f < dimensionfila; f++)
				System.out.println (elementos [f][co-1]);	
	}	
	//f) método que modifica el elemento de determinada posición
	//precondiciones: el nuevo elemento y la posición
	//postcondición: el nuevo elemento en la posición seleccionada
	public void modificarElemento (int elem, int posf, int posc){
		if (posf > 0 && posf <= dimensionfila && posc > 0 && posc <= dimensioncolumna)
			elementos [posf-1][posc-1] = elem;
	}
}
