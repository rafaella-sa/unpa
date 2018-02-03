package ej11;
public class Bicola {
	private final int maxcola = 100; // cantidad de elementos de la cola
	private char[] elementos; // arreglo que representa a la cola
	private int frenteizq, frenteder, ultimoizq, ultimoder; // �ndices para insertar y borrar
	// Constructor de la cola
	public Bicola() {
		elementos = new char[maxcola];
		frenteizq = 0;
		ultimoizq = 0;
		frenteder = maxcola - 1;
		ultimoder = maxcola - 1;
	}
	//verifica si la bicola est� o no vac�a
	public boolean estaVaciaIzquierda() {
		return (frenteizq == ultimoizq);
	}
	public boolean estaVaciaDerecha(){
		return (frenteder == ultimoder);
	}
	//verifica si la bicola est� o no llena
	public boolean estaLlenaIzquierda() {
		int sigultimo = siguienteIzquierda(ultimoizq);
		return (sigultimo == frenteizq);
	}
	public boolean estaLlenaDerecha() {
		int sigultimo = siguienteDerecha(ultimoder);
		return (sigultimo == frenteder);
	}
	//establece cu�l es el siguiente elemento
	private int siguienteIzquierda(int subind) {
		if (subind == maxcola - 1)
			return 0;
		else
			return ++subind;
	}
	private int siguienteDerecha(int subind) {
		if (subind == 0)
			return maxcola - 1;
		else
			return --subind;
	}
	// inserta un elemento en la cola
	// precondici�n: cola no llena y elemento entero
	// postcondici�n: elemento entero insertado en cola si no est� llena
	public void insertarIzquierda(char elem) {
		if (!estaLlenaIzquierda()) {
			ultimoizq = siguienteIzquierda(ultimoizq);
			elementos[ultimoizq] = elem;
		}
	}
	public void insertarDerecha(char elem){
		if(!estaLlenaDerecha()){
			ultimoder = siguienteDerecha(ultimoder);
			elementos[ultimoder] = elem;
		}
	}
	// borra un elemento de la cola
	// precondici�n: cola no vac�a
	// postcondici�n: elemento entero borrado de la cola si no est� vac�a
	public char eliminarIzquierda() {
		if (!estaVaciaIzquierda()) {
			frenteizq = siguienteIzquierda(frenteizq);
			return elementos[frenteizq];
		} 
		else
			return ' ';
	}
	public char eliminarDerecha() {
		if (!estaVaciaDerecha()) {
			frenteder = siguienteDerecha(frenteder);
			return elementos[frenteder];
		} 
		else
			return ' ';
	}
	//mostra los elementos de la bicola
	public void mostrarElementos(){
		Bicola aux = new Bicola();
		char elem;
		while(!estaVaciaIzquierda()){
			elem = this.eliminarIzquierda();
			System.out.println(elem);
			aux.insertarIzquierda(elem);
		}
		while(!aux.estaVaciaIzquierda()){
			this.insertarIzquierda(aux.eliminarIzquierda());
		}
		while(!estaVaciaDerecha()){
			elem = this.eliminarDerecha();
			System.out.println(elem);
			aux.insertarDerecha(elem);
		}
		while(!aux.estaVaciaDerecha()){
			this.insertarDerecha(aux.eliminarDerecha());
		}
	}
}
