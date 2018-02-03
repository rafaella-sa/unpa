package ej10y11;
public class Vector {
	private int [] elementos;
	private int dimension, actual;	
	//constructor para la clase Vector
	public Vector (int tam){
		if (tam <= 0)
			dimension = 100;
		else
			dimension = tam;
		actual = 0;
		elementos = new int [dimension];
	}	
	//método que agrega elementos
	//precondición: elemento entero
	//postcondición: valor agregado si hay lugar en el vector
	public void agregarElemento (int valor){
		if (actual < dimension){
			elementos [actual] = valor;
			actual++;
		}
	}	
	//10.a) método que devuelve el elemento de una determinada posición
	//precondición: posición válida
	//postcondición: elemento que se encuentra en dicha posición
	public int getElemento (int pos){
		int elem = 0;
		if (pos > 0 && pos <= dimension)
			elem = elementos [pos];			
		return elem;
	}
	//10.b) método que calcula el promedio de los elementos
	//precondición: vector cargado
	//postcondición: promedio de los elementos
	public double calcularPromedio(){
		int i, suma;
		suma = 0;
		double prom;
		for (i = 0; i < dimension; i++){
			suma = suma + elementos[i];
		}
		prom = suma / dimension;
		return prom;
	}
	//10.c) método que modifica el elemento de determinada posición
	//precondiciones: posición válida y nuevo elemento
	//postcondición: elemento modificado
	public boolean modificarElemento(int elem, int pos){
		if (validarPosicion(pos)){
			elementos[pos-1] = elem;
			return true;
		}
		else
			return false;
	}
	public boolean validarPosicion(int pos){
		if (pos > 0 && pos <= dimension)
			return true;
		else 
			return false;
	}	
	//10.d) método que busca un elemento en el vector
	//precondición: elemento a ser buscado
	//postcondición: confirmación si el elemento fue o no encontrado
	public boolean encontrarElemento (int buscado){
		boolean encontrado = false;
		int cont = 0;
		while (cont < actual && encontrado == false){
			if (elementos [cont] == buscado)
				encontrado = true;
		}
		return encontrado;
	}	
	//10.e) método que ordena los elementos en otro vector
	//precondición: vector cargado
	//postcondición: vector auxiliar ordenado
	public int[] ordenarVector(){
		int[] copia;
		copia = new int [dimension];
		int i, j, p, aux;
		copia = elementos;
		for(i = 1; i < actual - 1; i++){
			p = i;
			for(j = i + 1; j < actual; j++){
				if(copia[j]<copia[p])
					p = j;
			}
			aux = copia[p];
			copia[p] = copia[i];
			copia[i] = aux;
		}
		return copia;
	}
}
