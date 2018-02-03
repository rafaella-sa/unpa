package Ejer10;
public class ColaAuto {
	private final int maxcola=3;
	private Auto [] elementos;
	private int frente, ultimo;
	//Constructor
	public ColaAuto(){
		elementos= new Auto [3];
		frente=0;
		ultimo=0;
	}
	//VERIFICA SI LA COLA ESTA VACIA O NO
	public boolean estaVacia(){
		if (ultimo==frente)
			return true;
		else
			return false;
		}
	//VERIFICA SI LA COLA ESTA O NO LLENA
	public boolean estaLlena(){
		int sigultimo=siguiente(ultimo);
		if (sigultimo==frente)
			return true;
		else
			return false;
	}
	//ESTABLECE CUAL ES EL SIGUIENTE ELEMENTO
	public int siguiente(int subind){
		if(subind==maxcola-1)
			return 0;
		else
			return ++subind;
	}
	//INSERTA UN ELEMENTO EN LA COLA
	//PRECONDICION:COLA NO LLENA Y ELEMENTO AUTO
	//POSCONDICION:AUTO INSERTADO EN LACOLA
	public void insertar(Auto elem){
		if(!estaLlena()){
			ultimo=siguiente(ultimo);
			elementos[ultimo]=elem;
		}
	}
	public Auto borrar(){
		if(!estaVacia()){
			frente=siguiente(frente);
			return elementos[frente];
		}
		else
			return null;
		}
	}
