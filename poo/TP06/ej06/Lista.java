package ej06;
import java.util.Stack;

import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Pre;

import ej07.Nodo;
@Contract
public class Lista {
	//atributos
	public Nodo lista;
	//constructor
	public Lista(){ lista = null; }
	//métodos
	@Pre("lista!=null")
	public void mostrarLista(){
		Nodo puntero = lista;
		while (puntero != null){
			System.out.println(puntero.getInfo());
			puntero = puntero.getSig();
			} 
	}
	public Nodo getLista(){ return this.lista; }
	public void setLista(Nodo newlista) { this.lista = newlista; }
	public void insertar(int valor){
		Nodo nuevo = new Nodo(valor); 
		if(lista == null) lista = nuevo;
		else {
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
	}
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
	//a)
	boolean buscar(int valor){
		boolean ok = false;
		Nodo puntero = lista;
		while (puntero != null && !ok)
			if (valor == puntero.getInfo())
				ok = true;
			else
				puntero = puntero.getSig();
		return ok;	
	}
	//b)
	@Pre("lista!=null")
	int cantidad(){
		Nodo puntero = lista;
		int cant = 0;
		while (puntero != null){
			cant = cant + 1;
			puntero = puntero.getSig();
		}
		return cant;	
	}
	//c)
	@Pre("lista!=null")
	int sumatoria(){
		Nodo puntero = lista;
		int suma = 0;
		while (puntero != null){
			suma = suma + puntero.getInfo();
			puntero = puntero.getSig();
		}
		return suma;	
	}
	//d)
	int mayor(){
		Nodo puntero = lista;
		int mayor = puntero.getInfo();
		while (puntero != null){
			if(puntero.getInfo() > mayor)
				mayor = puntero.getInfo();
		}
		return mayor;
	}
	int menor(){
		Nodo puntero = lista;
		int menor = puntero.getInfo();
		while (puntero != null){
			if(puntero.getInfo() < menor)
				menor = puntero.getInfo();
		}
		return menor;
	}
	//e)
	void inversoPila(){
		Stack<Integer> pila = new Stack<Integer>();
		Nodo puntero = lista;
		while(puntero != null){
			pila.addElement(puntero.getInfo());
			puntero.getSig();
		}
		while(!pila.isEmpty()){
			System.out.println(pila.lastElement());
			pila.remove(pila.lastElement());
		}
	}
	//f)
	void inversoRecursivo(Nodo puntero){
		if(puntero.getSig() == null)
			System.out.println(puntero.getInfo());
		else{
			inversoRecursivo(puntero.getSig());	
			System.out.println(puntero.getInfo());
		}
	}
	//g)
	void invertirLista(){
		Stack<Integer> pila = new Stack<Integer>();
		Nodo puntero = lista;
		Lista newlista = new Lista();
		do{
			pila.addElement(puntero.getInfo());
			puntero = puntero.getSig();
			if(puntero.getSig() == null)
				newlista.insertar(puntero.getInfo());
		}
		while(puntero != null);
		while(!pila.isEmpty()){		
			newlista.insertar(pila.lastElement());
			pila.removeElement(pila.lastElement());
		}
	}
	//h)
	Lista copiaLista(){
		Lista copia = new Lista();
		Nodo puntero = this.getLista();
		while(puntero.getSig() != null)
			copia.insertar(puntero.getInfo());
		return copia;
	}
}
