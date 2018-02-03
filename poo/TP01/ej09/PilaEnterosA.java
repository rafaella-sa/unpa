package ej09;
public class PilaEnterosA extends PilaA{
	protected int[] elementos;
	protected PilaEnterosA(){
		elementos = new int[maxpila];
		cima = -1;
	}
	//agrega un elemento en la pila
	protected void meter(int elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	protected int sacarElem(){
		int aux = 0;
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}
}
