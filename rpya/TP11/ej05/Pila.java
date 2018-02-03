package ej05;
public class Pila {
	private final int maxpila = 100;
	private int[] elementos;
	private final int cima = 0;
	//constructor de la pila
	public Pila(){
		elementos = new int [maxpila];
		elementos[cima] = 0;
	}
	//verifica si la pila está o no vacía
	public boolean estaVacia(){
		return (elementos[cima] == 0);
	}
	//verifica si la pila esá o no llena
	public boolean estaLlena(){
		return (elementos[cima] == -1);
	}
	//mete un elemento en la pila
	//precondición: pila no llena y elemento entero
	//postcondición: elemento metido en la pila si no está llena
	public void meter (int elem){
		if (!estaLlena()){
			elementos[cima]++;
			elementos[elementos[cima]] = elem;
			System.out.println("En la pila hay " + elementos[cima] + " elementos.");
			System.out.println("Faltan " + (maxpila - elementos[cima]) + " elementos para completarla.");
		}
	}
	//saca un elemento del tope de la pila
	//precondición: pila no vacía
	//postcondición: elemento entero sacado de la pila si no está vacía
	public int sacar(){
		int aux = Integer.MIN_VALUE; //-2147483648
		if (!estaVacia()){
			aux = elementos[elementos[cima]];
			elementos[cima]--;
			System.out.println("En la pila hay " + elementos[cima] + " elementos.");
			System.out.println("Faltan " + (maxpila - elementos[cima]) + " elementos para completarla.");
		}
		return aux;
	}	
}
