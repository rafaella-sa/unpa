package ej09;
public class PilaB {
	protected final int maxpila = 100;
	protected Object[] elementos;
	protected int cima;
	//constructor de la pila
	protected PilaB(){
		elementos = new Object[maxpila];
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
	protected void meter(Object elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	protected Object sacar(){
		Object aux = null;
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}
}
