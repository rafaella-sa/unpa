package ej07;
public class Cadena {
	private final int maxpila = 100;
	private char[] elementos;
	private int cima;	
	//constructor de la pila
	public Cadena(){
		elementos = new char[maxpila];
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
	//método que hace la inversión de la palabra
	public String invertirPalabra(){
		String pal = "";
		char car;
		while(!estaVacia()){
			car = sacar();
			pal = pal + car;			
		}
		return pal;
	}
	//método que verifica si es un palíndromo
	public boolean esPalindromo(){
		String p = this.invertirPalabra();
		int i = 0;
		boolean verif = false;
		while (i < p.length() && verif == false){
			if(p.charAt(i) == sacar())
				verif = true;
			else
				verif = false;			
			i++;
		}
		return verif;
	}
}
