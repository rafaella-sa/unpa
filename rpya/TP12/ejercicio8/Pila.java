package ejercicio8;

public class Pila {

	//delcaracion de variable
	private int cima;
	private int [] elementos;
	private final int maxpila=5;
	
	//constructor
	public Pila(){
		elementos=new int [maxpila];
		cima=-1;
	}
	
	//verificar si la pila esta vacia o no
	public boolean estaVacio(){
		return (cima==-1);
	}
	
	//verificar si la pila esta llena o no
	public boolean estaLlena(){
		return (cima==maxpila-1);
	}
	
	//meter un elemento en la pila
	//precondicion:pila no llena y elemento entero
	//poscondicion:elemento entero metido en la pila si no esta llena
	public void meter(int elem){
		if(!estaLlena()){
	         cima++;
			elementos[cima]=elem;
		}
	}
	
	
	//sacar un elemento del tope de la pila
	//precondicion:pila no vacia
	//poscondicion: elemento entero sacardo en la pila si no esta llena 
	public int sacar(){
		int aux=Integer.MIN_VALUE;
		if(!estaVacio()){
			aux=elementos[cima];
			cima--;
			}
		return aux;
		}
	
	public void mostrar(){
		if (estaVacio()){
		System.out.println ("Pila vacia");}
		else {
		       for(int i=0;i<maxpila-1;i++)
		    	System.out.print(" --> ");
		    }
	} 
}
