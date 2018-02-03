package ej03;
public class ColaMovible {
	private final int maxcola = 100; // cantidad de elementos de la cola
	private int[] elementos; // arreglo que representa a la cola
	private int frente, ultimo; // índices para insertar y borrar
	// Constructor de la cola
	public ColaMovible() {
		elementos = new int[maxcola];
		frente = 0;
		ultimo = 0;
	}
	// verifica si la cola esta o no vacía
	public boolean estaVacia() {
		return (ultimo == frente);
	}
	// verifica si la cola esta o no llena
	public boolean estaLlena() {
		int sigultimo = siguiente(ultimo);
		return (sigultimo == frente);
	}
	// establece cuál es el siguiente elemento
	private int siguiente(int subind) {
		if (subind == maxcola - 1)
			return 0;
		else
			return ++subind;
	}
	// inserta un elemento en la cola
	// precondición: cola no llena y elemento entero
	// postcondición: elemento entero insertado en cola si no está llena
	public void insertar(int elem) {
		if (!estaLlena()) {
			ultimo = siguiente(ultimo);
			elementos[ultimo] = elem;
		}
	}
	// borra un elemento de la cola
	// precondición: cola no vacía
	// postcondición: elemento entero borrado de la cola si no está vacía
	public int borrar() {
		if (!estaVacia()) {
			frente = siguiente(frente);
			return elementos[frente];
		} else
			return Integer.MIN_VALUE; // -2147483648
	}
}
