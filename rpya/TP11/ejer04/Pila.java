package ejer04;

public class Pila {
	private  final int maxpila=100;
	private int []elementos;
	private int cima;
	//constructor
	public Pila(){
		elementos=new int [maxpila];
		cima=-1;
	}
	//verifica si la pila esta o no vacia
	public boolean estaVacia(){
		if (cima==-1)
			return true;
		else
			return false;
	}
	//verifica si la pila esta o no llena
	public boolean estaLlena(){
		if (cima==maxpila-1)
			return true;
		else
			return false;
	}
	//agregar un elemento a la pila 
	//precondicion: pila no llena y elemento entero
	//postcondicion: ELELEMENTO ENTERO CARGADO A LA PILA SI NO ESTA LLENA
	public void meter(int elem){
		if (!estaLlena()){
			cima++;
			elementos[cima]=elem;
		}
		}
	//saca un elemento del tope de la fila 
	//precondicion: pila no vacia
	//poscondicion: elemento entero sacado de la pila si no esta vacia
	public int sacar(){
		int aux=Integer.MIN_VALUE; //-2147483648
		if (!estaVacia()){
			aux=elementos[cima];
			cima--;
		}
	return aux;
	}
}

