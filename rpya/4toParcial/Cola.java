package parcial;
public class Cola {
	//atributos
	private final int maxcola = 100; 
	private Cliente[] elementos;
	private int ultimo;
	private final int frente = 0;
	//constructor
	public Cola() {
		elementos = new Cliente[maxcola];
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
	public void insertar(Cliente c) {
		if (!estaLlena()) {
			ultimo++;
			elementos[ultimo] = c;
		}
	}
	//borrar elemento
	public Cliente borrar() {
		int i = 0;
		Cliente aux = elementos[frente];
		while (i < ultimo) {
			elementos[i] = elementos[i + 1];
			i++;
		}
		ultimo--;
		return aux;
	}
}
