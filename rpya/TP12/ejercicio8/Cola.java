package ejercicio8;

public class Cola {
	private final int maxcola;
	private int[] elementos;
	private int frente, ultimo;
	
	//Constructor de una cola circular
	Cola() {
		maxcola=5;
		elementos=new int[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean vacio(){
		
	return (ultimo-1==frente);	
	}
	
	public boolean estaVacia(){
		return(ultimo==frente);
		
	}
	
	//verificar si la cola esta llena
	public boolean estaLlena(){
		int sigultimo=siguiente(ultimo);
		return(sigultimo==frente);
	}
	//establece cual es el siguiente elemento
	private int siguiente(int subind){
		if (subind==maxcola-1)
		   return 0;
		else
			return subind++;
	}
	
	//incertar un elemento en la cola
	public void insertar(int elem){
		if(!estaLlena()){
			ultimo=siguiente(ultimo);
			elementos[ultimo]=elem;}
		return;
		}
	
	//borrar un elemento en la cola
	public int borrar(){
		if(!estaVacia()){
			frente=siguiente(frente);
			return elementos[frente];
		}
		else
			return Integer.MIN_VALUE;
		}
}
