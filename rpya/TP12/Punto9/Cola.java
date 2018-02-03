package Punto9;

//implementacion 1: FRENTE FIJO Y FINAL MOVIBLE

public class Cola {
	private final int maxcola = 100; // atributos
	private char[] elementos;
	private int ultimo;
	private final int frente = 0;

	public Cola() {
		elementos = new char[maxcola];
		ultimo = -1;
	}

	public boolean estaVacia() {
		return (ultimo == -1);
	}

	public boolean estaLlena() {
		return (ultimo == maxcola - 1);
	}

	public void insertar(char e) {
		if (!estaLlena()) {
			ultimo++;
			elementos[ultimo] = e;
		}
	}

	public char borrar() // saca un elemento de la cola
	{
		char aux; 
		int i = 0;
		aux = elementos[frente];
		while (i < ultimo) {
			elementos[i] = elementos[i + 1];
			i++;
		}
		ultimo--;
		return aux;
	}

	public int getSize() {
		return ultimo;
	}

	public void mostraElem() {
		int i;
		for (i = 0; i <= ultimo; i++) {
			System.out.println("El elemento " + i + " es " + elementos[i]);
		}
	}

	public void elimRep(Cola c) {
		Cola aux = new Cola();
		Cola aux2 = new Cola();
		aux = c;
		int i, j, k;
		for (i = 0; i <= aux.ultimo; i++) {
			for (j = 1; j <= aux.ultimo; j++) {
				while (aux.elementos[i] != aux.elementos[j]) {
					aux2.insertar(aux.borrar());
				}
				aux.borrar();
			}
		}
		for (k = 0; k <= aux2.ultimo; k++) {
			System.out.println("El elemento " + k + " es " + aux2.elementos[k]);
		}
	}
	public boolean esPalindromo(Cola c) {
		int n = c.getSize();
		int i = 0, j = n;
		boolean pal = false;
		while (i <= j && c.elementos[i] == c.elementos[j]) {
			i++;
			j--;
			pal = true;
		}
		return pal;

	}
}
