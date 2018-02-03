package ej09;

public class PilaAuto {
	private final int maxpila=100;
	private Auto [] elementos;
	private int cima;
	//constructor
	public PilaAuto(){
		elementos=new Auto [maxpila];
		cima=-1;
		}
	//verifica si la pila esta o no vacia
	public boolean estaVacia(){
		if (cima==-1)
			return true;
		else
			return false;
	}
	//virifica si la pila esta llena o no
	public boolean estaLlena(){
		if (cima==maxpila-1)
			return true;
		else
			return false;
	}
	//agrega un elementl en la pila
	//precondicion:pila no llena y elemento  entero
	//postcondicion: elemento cargado
	public void meter(Auto elem){
		if(!estaLlena()){
			cima++;
			elementos[cima]=elem;
		}
	}
	public Auto sacar(){
		Auto aux=null;//-2147483648
		if(!estaVacia()){
			aux=elementos[cima];
			cima--;
		}
		return aux;
		}
	
	}
