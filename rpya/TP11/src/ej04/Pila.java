package ej04;
public class Pila {
	private final int maxpila = 100;
	private int[] elementos;
	private int cima;
	//constructor de la pila
	public Pila(){
		elementos = new int[maxpila];
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
	public boolean meter(int elem){
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
		if(!estaVacia()){
			eliminar();			
			return false;
		}
		else
			return true;
	}
	public int eliminar(){
			int aux = 0;
			aux = elementos[cima];
			cima--;
			return aux;
		}
	}	

