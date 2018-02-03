package ej08;
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
	//insertar en la cola los elementos pares de la pila
	public Cola insertarPares(Pila p){
		Cola c = new Cola();
		Pila aux = new Pila();
		int x;
		while (!p.estaVacia()){
			x = p.sacar();
			aux.meter(x);
			if(x%2 == 0)
				c.insertar(x);			
		}
		while(!aux.estaVacia())
			p.meter(aux.sacar());
		return c;
	}
}
