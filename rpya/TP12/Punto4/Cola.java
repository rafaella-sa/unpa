package Punto4;

//implementacion 1: FRENTE FIJO Y FINAL MOVIBLE

public class Cola {
	private final int maxcola = 5; // atributos
	private int[] elementos;
	private int ultimo;
	private final int frente = 0;

	public Cola() {
		elementos = new int[maxcola];
		ultimo = -1;
	}

	public boolean estaVacia() {
		return (ultimo == -1);
	}

	public boolean estaLlena() {
		return (ultimo == maxcola - 1);
	}

	public void insertar(int e) {
		if (!estaLlena()) {
			ultimo++;
			elementos[ultimo] = e;
		}
	}

	public int borrar() // saca un elemento de la cola
	{
		int aux, i = 0;
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
}
