package ej12;
public class ColaTrabajos {
	private Trabajo []elementos;
	private int maxcola = 10;
	private int frente, ultimo;
	public ColaTrabajos(){
		elementos = new Trabajo[maxcola];
		frente=0;
		ultimo=0;
	}
	//verificar si la cola est� o no vac�a
	public boolean estaVacia(){
		return (ultimo == frente);	                    
	}
	//verificar si la cola est� o no llena 
	public boolean estaLlena(){
		int sigultimo = siguiente(ultimo);
		return (sigultimo == frente);
	}
	//establece cu�l es el siguiente elemento
	private int siguiente(int subind){
		if (subind == maxcola -1)
			return 0;
		else
			return subind+1;
	}
	//insertar elemento en la cola
	public void insertar(Trabajo t){
		if(!estaLlena()){
			ultimo = siguiente(ultimo);
			elementos[ultimo] = t;
		}
	}
	//borra un elemento de la cola
	public Trabajo borrar(){
		if(!estaVacia()){
		frente = siguiente(frente);
		return elementos[frente];	
		}
		else
			return null;
	}
}
