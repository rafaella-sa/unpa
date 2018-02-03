package ej11;
public class BicolaRestrictaInsertar {
	//atributos
	private final int maxcola = 100; 
	private char[] elementos;
	private int ultimoizq, ultimoder;
	private final int frente = 0;
	//constructor
	public BicolaRestrictaInsertar() {
		elementos = new char[maxcola];
		ultimoizq = -1;
		ultimoder = -1;
	}
	//verifica si está vacía
	public boolean estaVacia() {
		return (ultimoizq == -1);
	}
	//verifica si está llena
	public boolean estaLlena() {
		return (ultimoizq == maxcola - 1);
	}
	//insertar elemento
	public void insertar(char e) {
		if (!estaLlena()) {
			ultimoizq++;
			ultimoder = ultimoizq;
			elementos[ultimoizq] = e;
		}
	}
	//saca un elemento del tope de la cola
	public char borrarIzquierda() {
		char aux; 
		int i = 0;
		aux = elementos[frente];
		while (i < ultimoizq) {
			elementos[i] = elementos[i + 1];
			i++;
		}
		ultimoizq--;
		return aux;
	}
	public char borrarDerecha(){
		char aux; 
		aux = elementos[ultimoder];
		ultimoder--;
		ultimoizq--;
		return aux;
	}
	//muestra los elementos de la bicola
	public void mostrarElementos(){
		BicolaRestrictaInsertar aux = new BicolaRestrictaInsertar();
		char elem;
		while(!estaVacia()){
			elem = this.borrarIzquierda();
			System.out.println(elem);
			aux.insertar(elem);
		}
		while(!aux.estaVacia()){
			this.insertar(aux.borrarIzquierda());
		}
	}
}
