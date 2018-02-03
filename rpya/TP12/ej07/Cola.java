package ej07;
public class Cola {
	//atributos
	private final int maxcola = 100; 
	private int[] elementos;
	private int ultimo;
	private final int frente = 0;
	//constructor
	public Cola() {
		elementos = new int[maxcola];
		ultimo = -1;
	}
	//verifica si está vacía
	public boolean estaVacia() {
		return (ultimo == -1);
	}
	//verifica si está llena
	public boolean estaLlena() {
		return (ultimo == maxcola - 1);
	}
	//insertar elemento
	public void insertar(int e) {
		if (!estaLlena()) {
			ultimo++;
			elementos[ultimo] = e;
		}
	}
	//saca un elemento del tope de la cola
	public int borrar() {
		int aux, i = 0;
		aux = elementos[frente];
		while (i < ultimo) {
			elementos[i] = elementos[i + 1];
			i++;
		}
		ultimo--;
		return aux;
	}
	//verifica si dos colas son iguales
	public boolean sonIguales(Cola c1, Cola c2){
		boolean ok = true;
		Cola aux1 = new Cola();
		Cola aux2 = new Cola();
		int x, y;
		if(c1.ultimo != c2.ultimo)
			ok = false;
		else{
			while(!c1.estaVacia())
				aux1.insertar(c1.borrar());
			while(!c2.estaVacia())
				aux2.insertar(c2.borrar());
			while(!aux1.estaVacia() && !aux2.estaVacia() && ok == true){
				x = aux1.borrar();
				y = aux2.borrar();			
				if(x == y)
					ok = true;					
				else
					ok = false;
				c1.insertar(x);
				c2.insertar(y);			
			}
			while(!aux1.estaVacia() && !aux2.estaVacia()){
				c1.insertar(aux1.borrar());
				c2.insertar(aux2.borrar());
			}
		}
		return ok;
	}
}

