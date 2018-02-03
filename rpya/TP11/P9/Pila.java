package P9;

public class Pila {
	private final int maxpila = 10;
	private Auto[] elementos;
	private int cima;
	private Auto aux;

	// constructor
	public Pila() {
		elementos = new Auto[maxpila];
		cima = -1;
	}

	// vacia
	public boolean estaVacia() {
		return (cima == -1);
	}

	// llena
	public boolean estaLLena() {
		return (cima == maxpila - 1);
	}

	//
	public void meter(Auto elem) {
		if (!estaLLena()) {
			cima++;
			elementos[cima] = elem;
		}
		return;
	}

	public Auto sacar() {
		if (!estaVacia()) {
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}
}
