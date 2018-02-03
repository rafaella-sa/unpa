package ej26;
import java.util.Stack;
import java.util.Vector;
public class Expresion {
	String exp;
	int l, s;
	
	Expresion(String e){
		exp = e;
		l = e.length();
		s = 0;
	}
	
	void setExpresion(String e){
		exp = e;
	}
	
	char obtenerSimbolo(){
		char aux = exp.charAt(s);
		s++;
		return aux;
	}
	
	boolean haySimbolo(){
		return s <= l - 1;
	}
	
	static boolean esOperador(char ch){
		if(ch != '+' && ch != '-' && ch != '*' && ch != '/')
			return false;
		else
			return true;			
	}
	
	void setS(int s){
		this.s = s;
	}
	
	Vector<Character> postordenAPreorden(){
		char simbolo;
		Vector<Character> nuevaexp = new Vector<Character>();
		Stack<Character> aux1 = new Stack<Character>(); 
		Stack<Character> aux2 = new Stack<Character>();
		while(haySimbolo()){
			simbolo = obtenerSimbolo();
			if(!esOperador(simbolo))
				aux1.addElement(simbolo);
			else{
				if(!aux1.isEmpty())
				aux2.addElement(aux1.pop());
				if(!aux1.isEmpty())
				aux2.addElement(aux1.pop());
				aux2.addElement(simbolo);
			}
		}
		while(!aux2.isEmpty())
			nuevaexp.addElement(aux2.pop());			
		return nuevaexp;
	}
}
