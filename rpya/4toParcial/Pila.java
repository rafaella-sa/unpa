package parcial;
public class Pila extends Cola {
	private final int maxpila = 100;
	private Cliente[] elementos;
	private int cima;
	//constructor de la pila
	public Pila(){
		elementos = new Cliente[maxpila];
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
	public void meter(Cliente elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	public Cliente sacar(){
		Cliente aux = new Cliente();
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}
}
