package ej04;
public class Cola {
	private final int maxcola = 50;
	private int[] elementos;
	private int frente, ultimo;
	private int cont = 0;
	//constructor de la cola
	public Cola(){
		elementos = new int[maxcola];
		frente = 0;
		ultimo = 0;
	}
	//verifica si la cola esta o no vacia
	public boolean estaVacia(){
		return (ultimo == frente);
	}
	//verifica si la cola esta o no llena
	public boolean estaLlena(){
		int sigultimo = siguiente(ultimo);
		return (sigultimo == frente);
	}
	//establece cuál es el siguiente elemento
	private int siguiente(int subind){
		if(subind == maxcola - 1)
			return 0;
		else
			return ++subind;
	}
	//inserta un elemento en la cola
	//precondición: cola no llena y elemento entero
	//postcondición: elemento entero insertado en cola si no está llena
	public void insertar (int elem){
		if(!estaLlena()){
			ultimo = siguiente(ultimo);
			elementos[ultimo] = elem;
			setCantidad();
		}		
	}
	//borra un elemento de la cola
	//precondición: cola no vacía
	//postcondición: elemento entero borrado de la cola si no está vacía
	public int borrar(){
		if(!estaVacia()){
			frente = siguiente(frente);
			return elementos[frente];
		}
		else
			return Integer.MIN_VALUE; //-2147483648
	}
	//conta la cantidad de elementos insertados en la cola
	public void setCantidad(){
		cont++;
	}
	//devuelve la cantidad de elementos insertados en la cola
	public int getCantidad(){
		return cont;
	}
}
