package ej26;
import java.util.Stack;
import java.util.Vector;

public class ArbolBinarioExpresion {
	NodoBinario raiz;
	
	ArbolBinarioExpresion(){
		raiz = null;
	}
	
	public boolean estaVacio(){
		return (raiz == null);
	}
	
	public NodoBinario getRaiz(){
		return raiz;
	}
	
	//notacion prefija = preorden
	void generarArbolPreorden(Expresion exp){
		Stack<NodoBinario> p = new Stack<NodoBinario>();
		char sigmov, simbolo;
		NodoBinario ultimo,nuevo;
		simbolo = exp.obtenerSimbolo();
		nuevo = new NodoInterno(simbolo); // el primero es un operador
		raiz = nuevo; // el primero siempre va a la raiz
		sigmov = 'i';
		while (exp.haySimbolo()){
			simbolo = exp.obtenerSimbolo();
			ultimo = nuevo;
			if (Expresion.esOperador(simbolo))
				nuevo = new NodoInterno(simbolo);
			else
				nuevo = new NodoHoja(simbolo) ;
			if (sigmov == 'i'){
				ultimo.setIzq(nuevo);
				p.addElement(ultimo);
			}
			else{
				ultimo = p.pop();
				ultimo.setDer(nuevo);
			}
			if (Expresion.esOperador(simbolo))
				sigmov='i';
			else
				sigmov='d';
			}
		}
	
	//notación postfija(postorden) e infija(inorden) 
	public void generarArbolPostorden(Vector<Character> exp){
		Stack<NodoBinario> p = new Stack<NodoBinario>();
		char sigmov;
		char simbolo;
		NodoBinario ultimo,nuevo;
		int i = 0;
		nuevo = new NodoInterno('0'); 
		sigmov = 'i';
		while (i < exp.size()){
			simbolo = exp.elementAt(i);
			if(i == 0){
				nuevo = new NodoInterno(simbolo);
				raiz = nuevo;
			}
			else{
				ultimo = nuevo;
				if (Expresion.esOperador(simbolo))
					nuevo = new NodoInterno(simbolo);
				else
					nuevo = new NodoHoja(simbolo) ;
				if (sigmov == 'i'){
					ultimo.setIzq(nuevo);
					p.addElement(ultimo);
				}
				else{
					ultimo = p.pop();
					ultimo.setDer(nuevo);
				}
				if (Expresion.esOperador(simbolo))
					sigmov='i';
				else
					sigmov='d';
			}
		i++;
		}
	}
	
	public void preorden(NodoBinario P){
		if ( P != null){// caso base
			System.out.print(P.getElemento().toString()+" "); // caso general
			preorden (P.getIzq());
			preorden (P.getDer());
		}
	}
	
	public void inorden (NodoBinario P){
		if(P != null){                                
			inorden (P.getIzq());
			System.out.print("|"+P.getElemento().toString()+"|");
			inorden (P.getDer());
		}
	}
	
	public void postorden (NodoBinario P){
		if(P != null){                               
			postorden (P.getIzq());
			postorden (P.getDer());
			System.out.print("|"+P.getElemento().toString()+"|");
		  }
	   }
	
	public int eval(NodoBinario p){
		Character a;
		if (p instanceof NodoInterno ){ // caso general	
			a = (Character)p.getElemento();
			if (a.charValue() == '+' ) return eval(p.getIzq()) + eval(p.getDer());
			if (a.charValue() == '*' ) return eval(p.getIzq()) * eval(p.getDer());
			if (a.charValue() == '-' ) return eval(p.getIzq()) - eval(p.getDer());
			if (a.charValue() == '/' ) return eval(p.getIzq()) / eval(p.getDer());
		}
		return Integer.parseInt((String)p.getElemento()); // caso base
	}	
}

