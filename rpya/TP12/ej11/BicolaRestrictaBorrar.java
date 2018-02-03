package ej11;
public class BicolaRestrictaBorrar {
	private final int maxcola = 100; // cantidad de elementos de la cola
	private char[] elementos; // arreglo que representa a la cola
	private int frenteizq, frenteder, ultimoizq, ultimoder; // índices para insertar y borrar
	// Constructor de la cola
	public BicolaRestrictaBorrar() {
		elementos = new char[maxcola];
		frenteizq = 0;
		ultimoizq = 0;
		frenteder = maxcola - 1;
		ultimoder = maxcola - 1;
	}
	//verifica si la bicola está o no vacía
	public boolean estaVaciaIzquierda() {
		return (frenteizq == ultimoizq);
	}
	public boolean estaVaciaDerecha(){
		return (frenteder == ultimoder);
	}
	public boolean esVacia(){
		return (estaVaciaIzquierda() && estaVaciaDerecha());
	}
	//verifica si la bicola está o no llena
	public boolean estaLlenaIzquierda() {
		int sigultimo = siguienteIzquierda(ultimoizq);
		return (sigultimo == frenteizq);
	}
	public boolean estaLlenaDerecha() {
		int sigultimo = siguienteDerecha(ultimoder);
		return (sigultimo == frenteder);
	}
	//establece cuál es el siguiente elemento
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
	// precondición: cola no llena y elemento entero
	// postcondición: elemento entero insertado en cola si no está llena
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
	// precondición: cola no vacía
	// postcondición: elemento entero borrado de la cola si no está vacía
	public char borrar() {
		if (!estaVaciaIzquierda()){
				frenteizq = siguienteIzquierda(frenteizq);
				return elementos[frenteizq];
				}
		else
			if (!estaVaciaDerecha()){			
			frenteder = siguienteDerecha(frenteder);
			return elementos[frenteder];
			} 			
			else	
				return ' ';
	}
	//mostra los elementos de la bicola
	public void mostrarElementos(){
		BicolaRestrictaBorrar aux = new BicolaRestrictaBorrar();
		char elem;
		while(!esVacia()){
			elem = this.borrar();
			System.out.println(elem);
			aux.insertarIzquierda(elem);
		}
		while(!aux.esVacia()){
			this.insertarIzquierda(aux.borrar());		
		
		}
	}
	public void mostrarElementos2(){
		BicolaRestrictaBorrar aux = new BicolaRestrictaBorrar();
		char elem;		
		while(!estaVaciaIzquierda()){
			elem = this.borrar();
			System.out.println(elem);
			aux.insertarIzquierda(elem);
		}
		while(!estaVaciaDerecha()){
			elem = this.borrar();
			System.out.println(elem);
			aux.insertarDerecha(elem);
		}
		while(!aux.estaVaciaIzquierda())
			this.insertarIzquierda(aux.borrar());		
		while(!aux.estaVaciaDerecha())
			this.insertarDerecha(aux.borrar());
	}
}
