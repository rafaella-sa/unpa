package ej09;
public class Cola {
	//atributos
	private final int maxcola = 100; 
	private int[] elementos;
	private int ultimo;
	private final int frente = 0;
	//constructor
	public Cola() {
		elementos = new int[maxcola];
		ultimo = -1;
	}
	//verifica si está vacía
	public boolean estaVacia() {
		return (ultimo == -1);
	}
	//verifica si está llena
	public boolean estaLlena() {
		return (ultimo == maxcola - 1);
	}
	//insertar elemento
	public void insertar(int e) {
		if (!estaLlena()) {
			ultimo++;
			elementos[ultimo] = e;
		}
	}
	//saca un elemento del tope de la cola
	public int borrar() {
		int aux, i = 0;
		aux = elementos[frente];
		while (i < ultimo) {
			elementos[i] = elementos[i + 1];
			i++;
		}
		ultimo--;
		return aux;
	}
	//verifica si la cadena es  un palíndromo
	public boolean esPalindromo(Pila p){
		boolean ok = true;
		while(!estaVacia() && !p.estaVacia() && ok){
			if(borrar() == p.sacar())
				ok = true;
			else
				ok = false;
		}
		return ok;	
	}
}
