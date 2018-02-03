package ej11;
public class Pila {
	private final int maxpila = 100;
	private int[] elementos;
	private int cima;	
	//constructor de la pila
	public Pila(){
		elementos = new int[maxpila];
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
	public void meter(int elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	public int sacar(){
		int aux = 0;
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}	
	//retornar copia de la pila
	public Pila copiarPila (){
		int x;
		Pila copia = new Pila();
		Pila aux = new Pila();
		while (!estaVacia()){
			aux.meter(sacar());
		}
		while(!estaLlena()){
			x = aux.sacar();
			meter(x);
			copia.meter(x);
		}
		return copia;
	}
}