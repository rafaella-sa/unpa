package Ejer12;

public class ColaTrabajo {
	private final int maxcola=10;
	private Trabajo [] elementos;
	private int frente, ultimo;
	//Constructor
	public ColaTrabajo(){
		elementos= new Trabajo [maxcola];
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
	//PRECONDICION:COLA NO LLENA Y ELEMENTO ENTERO
	//POSCONDICION:ELEMENTO ENTERO INSERTADO EN LACOLA
	public void insertar(Trabajo elem){
		if(!estaLlena()){
			ultimo=siguiente(ultimo);
			elementos[ultimo]=elem;
		}
	}
	public Trabajo borrar(){
		if(!estaVacia()){
			frente=siguiente(frente);
			return elementos[frente];
		}
		else
			return null; //-2147483648
		}
	}
