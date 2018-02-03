package P3;

public class Pila {
	private final int maxpila = 5;
	private int[] elementos;
	private int cima;
	private int aux;

	// constructor
	public Pila() {
		elementos = new int[maxpila];
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
	public void meter(int elem) {
		if (!estaLLena()) {
			cima++;
			elementos[cima] = elem;
		}
		return;
	}

	public int sacar() {
		if (!estaVacia()) {
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}

	public int getSize() {
		return cima;
	}

	public void mostraElem() {
		int i;
		for (i = 0; i <= cima; i++) {
			System.out.println("El elemento "+i+" es "+elementos[i]);
		}
	}

	public int faltan() {
		int contf = 0;
		if (!estaLLena()|!estaVacia()) {
			contf=maxpila-cima;
		}
		else System.out.println("Pila llena");
		return contf;
	}
}