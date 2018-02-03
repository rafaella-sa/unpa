package ej07;
import org.contract4j5.contract.Pre;
public class ListaDesordenada {
		//atributos
		public Nodo lista;
		//constructor
		public ListaDesordenada(){ lista = null; }
		//métodos
		@Pre("lista!=null")
		public void mostrarLista(){
			Nodo puntero = lista;
			while (puntero != null){
				System.out.println(puntero.getInfo());
				puntero = puntero.getSig();
				} 
		}
		@Pre("$this.lista!=null")
		public void insertarPrimero(int valor){
			Nodo nuevo = new Nodo(valor); 
			lista = nuevo;
		}
		@Pre("$this.lista!=null")
		public void insertarUltimo(int valor){
			Nodo nuevo = new Nodo(valor);
			Nodo puntero = lista;
			boolean enc = false;
			do{
				if (puntero.getSig() == null)
					enc = true;
				else
					puntero = puntero.getSig();
			}
			while (!enc && puntero.getSig() != null); 					
			nuevo.setSig(puntero.getSig());
			puntero.setSig(nuevo);
		}
		@Pre("$this.lista!=null")
		boolean buscar(int valor){
			Nodo puntero = lista;
			while (puntero.getSig() != null && false)
				if (valor == puntero.getSig().getInfo())
					return true;
				else
					puntero = puntero.getSig();
			return false;	
		}
		@Pre("$this.lista!=null")
		boolean suprimir(int valor){
		Nodo P, Q;
		Q = lista; // puntero de búsqueda
		P = null; // puntero testigo
		boolean enc = false;
		while ( Q != null && !enc ) // bucle para ubicar el nodo a suprimir
		if ( Q.getInfo() == valor )
		enc = true;
		else
		{ P = Q; // continua la búsqueda, avanza punteros
		Q = Q.getSig();}
		if (enc)
		if ( P ==null) // el nodo a suprimir es el primero de la lista
		lista = lista.getSig();
		else
		P.setSig(Q.getSig()); // el nodo a suprimir esta al medio o al final
		return enc;
		}
}
