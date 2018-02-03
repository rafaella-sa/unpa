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
	//verifica si la pila est� o no vac�a
	public boolean estaVacia(){
		return (elementos[cima] == 0);
	}
	//verifica si la pila es� o no llena
	public boolean estaLlena(){
		return (elementos[cima] == -1);
	}
	//mete un elemento en la pila
	//precondici�n: pila no llena y elemento entero
	//postcondici�n: elemento metido en la pila si no est� llena
	public void meter (int elem){
		if (!estaLlena()){
			elementos[cima]++;
			elementos[elementos[cima]] = elem;
			System.out.println("En la pila hay " + elementos[cima] + " elementos.");
			System.out.println("Faltan " + (maxpila - elementos[cima]) + " elementos para completarla.");
		}
	}
	//saca un elemento del tope de la pila
	//precondici�n: pila no vac�a
	//postcondici�n: elemento entero sacado de la pila si no est� vac�a
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
