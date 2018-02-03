package ej03;
public class Pila {
	private final int maxpila = 100;
	private char[] elementos;
	private int cima;
	//constructor de la pila
	public Pila(){
		elementos = new char[maxpila];
		cima = -1;
	}	
	//verifica si la pila est� o no vac�a
	public boolean estaVacia(){
		return(cima == -1);
	}	
	//verifica si la pila est� o no llena
	public boolean estaLlena(){
		return (cima == maxpila - 1);
	}	
	//agrega un elemento en la pila
	public void meter(char elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	public char sacar(){
		char aux = ' ';
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}	
	//m�todo que hace la inversi�n de la palabra
	public String invertirPalabra(){
		String palabra = "";
		while(!estaVacia()){
			palabra = palabra + sacar();			
		}
		return palabra;
	}
}
