package ej10y11;
public class Vector {
	private int[] elementos;
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
	//m�todo que agrega elementos
	//precondici�n: elemento entero
	//postcondici�n: valor agregado si hay lugar en el vector
	public void agregarElemento (int valor){
		if (actual < dimension){
			elementos [actual] = valor;
			actual++;
		}
	}	
	//10.a) m�todo que devuelve el elemento de una determinada posici�n
	//precondici�n: posici�n v�lida
	//postcondici�n: elemento que se encuentra en dicha posici�n
	public int getElemento (int pos){
		int elem = 0;
		if (pos > 0 && pos <= dimension)
			elem = elementos [pos];			
		return elem;
	}
	//10.b) m�todo que calcula el promedio de los elementos
	//precondici�n: vector cargado
	//postcondici�n: promedio de los elementos
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
	//10.c) m�todo que modifica el elemento de determinada posici�n
	//precondiciones: posici�n v�lida y nuevo elemento
	//postcondici�n: elemento modificado
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
	//10.d) m�todo que busca un elemento en el vector
	//precondici�n: elemento a ser buscado
	//postcondici�n: confirmaci�n si el elemento fue o no encontrado
	public boolean encontrarElemento (int buscado){
		boolean encontrado = false;
		int cont = 0;
		while (cont < actual && encontrado == false){
			if (elementos [cont] == buscado)
				encontrado = true;
		}
		return encontrado;
	}	
	//10.e) m�todo que ordena los elementos en otro vector
	//precondici�n: vector cargado
	//postcondici�n: vector auxiliar ordenado
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
