package EjemploCola2;
//implementacion 2: FRENTE Y FINAL MOVIBLES CON ESPACIO RESERVADO
//COLA CIRCULAR


public class Cola {
	private final int maxcola = 5; // cantidad de elementos de la cola
	private int[] elementos; // arreglo que representa a la cola
	private int frente, ultimo; // �ndices para insertar y borrar

	// Constructor de la cola
	public Cola() {
		elementos = new int[maxcola];
		frente = 0;
		ultimo = 0;
	}

	// verifica si la cola esta o no vac�a
	public boolean estaVacia() {
		return (ultimo == frente);
	}

	// verifica si la cola esta o no llena
	public boolean estaLlena() {
		int sigultimo = siguiente(ultimo);
		return (sigultimo == frente);
	}

	// establece cu�l es el siguiente elemento
	private int siguiente(int subind) {
		if (subind == maxcola - 1)
			return 0;
		else
			return ++subind;
	}

	// inserta un elemento en la cola
	// precondici�n: cola no llena y elemento entero
	// postcondici�n: elemento entero insertado en cola si no est� llena
	public void insertar(int elem) {
		if (!estaLlena()) {
			ultimo = siguiente(ultimo);
			elementos[ultimo] = elem;
		}
	}

	// borra un elemento de la cola
	// precondici�n: cola no vac�a
	// postcondici�n: elemento entero borrado de la cola si no est� vac�a
	public int borrar() {
		if (!estaVacia()) {
			frente = siguiente(frente);
			return elementos[frente];
		} else
			return Integer.MIN_VALUE; // -2147483648
	}
}
