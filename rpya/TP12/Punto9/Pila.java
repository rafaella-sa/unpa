package Punto9;

public class Pila {
	private final int maxpila = 100;
	private char[] elementos;
	private int cima;
	private char aux;

	// constructor
	public Pila() {
		elementos = new char[maxpila];
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
	public void meter(char elem) {
		if (!estaLLena()) {
			cima++;
			elementos[cima] = elem;
		}
		return;
	}

	public char sacar() {
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
			System.out.println("El elemento " + i + " es " + elementos[i]);
		}
	}

	public int faltan() {
		int contf = 0;
		if (!estaLLena() | !estaVacia()) {
			contf = maxpila - cima;
		} else
			System.out.println("Pila llena");
		return contf;
	}

	public boolean esPalindromo(Pila p) {
		int n = p.getSize();
		int i = 0, j = n;
		boolean pal = false;
		while (i <= j && p.elementos[i] == p.elementos[j]) {
			i++;
			j--;
			pal = true;
		}
		return pal;

	}
}
