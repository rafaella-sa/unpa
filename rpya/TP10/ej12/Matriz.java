package ej12;
public class Matriz {
	int [][] elementos;
	int dimensionfila, dimensioncolumna;
	int actualfila, actualcolumna;	
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
	//a) m�todo que agrega un elemento
	//precondici�n: elemento entero
	//postcondici�n: valor agregado si hay lugar en la matriz
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
	//b) m�todo que devuelve el elemento de determinada posici�n
	//precondiciones: posici�n de la matriz (fila y columna)
	//postcondici�n: elemento de la posici�n
	public int mostrarElemento (int f, int c){
		int num = 0;
		if (f > 0 && f <= dimensionfila && c > 0 && c <= dimensioncolumna)
			num = elementos [f-1][c-1];
		return num;
	}	
	//c) m�todo que muestra la matriz
	//precondici�n: matriz con elementos
	//postcondici�n: muestreo de los elementos de la matriz
	public void mostrarMatriz (){
		int fil, col;
		for (fil = 0; fil < dimensionfila; fil++)
			for (col = 0; col < dimensioncolumna; col++)
				System.out.println(elementos[fil][col]);
	}	
	//d) m�todo que muestra los elementos de una determinada fila
	//precondici�n: la fila deseada
	//postcondici�n: elementos de la fila seleccionada
	public void mostrarFila (int fi){
		int c;
		if (fi > 0 && fi <= dimensionfila)
			for (c = 0; c < dimensioncolumna; c++)
				System.out.println (elementos [fi-1][c]);
	}	
	//e) m�todo que muestra los elementos de una determinada columna
	//precondici�n: la columna deseada
	//postcondici�n: elementos de la columna seleccionada
	public void mostrarColumna (int co){
		int f;
		if (co > 0 && co <= dimensioncolumna)
			for (f = 0; f < dimensionfila; f++)
				System.out.println (elementos [f][co-1]);	
	}	
	//f) m�todo que modifica el elemento de determinada posici�n
	//precondiciones: el nuevo elemento y la posici�n
	//postcondici�n: el nuevo elemento en la posici�n seleccionada
	public void modificarElemento (int elem, int posf, int posc){
		if (posf > 0 && posf <= dimensionfila && posc > 0 && posc <= dimensioncolumna)
			elementos [posf-1][posc-1] = elem;
	}
}
