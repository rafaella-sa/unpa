package ej09;
public class PilaStringA extends PilaA{
	protected String[] elementos;	
	protected PilaStringA(){
		elementos = new String[maxpila];
		cima = -1;
	}
	//agrega un elemento en la pila
	protected void meter(String elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	protected String sacarElem(){
		String aux = "";
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}
}
