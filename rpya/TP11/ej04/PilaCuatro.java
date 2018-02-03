package ej04;

public class PilaCuatro {
	private final int maxpila = 100;
	private char[] elementos;
	private int cima;
	
	//constructor de la pila
	public PilaCuatro(){
		elementos = new char[maxpila];
		cima = -1;
	}
	
	//verifica si la pila está o no vacía
	public boolean estaVacia(){
		return(cima == -1);
	}
	
	//verifica si la pila está o no llena
	public boolean estaLlena(){
		return (cima == maxpila - 1);
	}
	
	//agrega un elemento en la pila
	public boolean meter(char elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
			return false;
		}
		else
			return true;
	}
	
	//saca un elemento del tope de la pila
	public boolean sacar(){
		char aux;
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
			return false;
		}
		else
			return true;
	}
}
