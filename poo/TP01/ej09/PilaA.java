package ej09;
public class PilaA {
	protected final int maxpila = 100;
	protected char[] elementos;
	protected int cima;
	//constructor de la pila
	protected PilaA(){
		elementos = new char[maxpila];
		cima = -1;
	}	
	//verifica si la pila está o no vacía
	protected boolean estaVacia(){
		return(cima == -1);
	}	
	//verifica si la pila está o no llena
	protected boolean estaLlena(){
		return (cima == maxpila - 1);
	}	
	//agrega un elemento en la pila
	protected void meter(char elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	protected char sacar(){
		char aux = ' ';
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}	
}
