package ej26;

public class Test {
/*
	Vector<Character> inordenAPreorden(){
		char simbolo;
		Vector<Character> nuevaexp = new Vector<Character>();
		Stack<Character> aux1 = new Stack<Character>(); 
		Stack<Character> aux2 = new Stack<Character>();
		while(haySimbolo()){
			simbolo = obtenerSimbolo();
			if(!esOperador(simbolo))
				aux1.addElement(simbolo);
			else{
				aux2.addElement(simbolo);
				while(!aux1.isEmpty())
					aux2.addElement(aux1.pop());
			}
		}
		while(!aux2.isEmpty())
			aux1.addElement(aux2.pop());
		while(!aux1.isEmpty())
			nuevaexp.addElement(aux1.pop());
		return nuevaexp;
	}
	
	 * char simbolo;
		Vector<Character> nuevaexp = new Vector<Character>();
		Stack<Character> aux1 = new Stack<Character>(); 
		Stack<Character> aux2 = new Stack<Character>();
		Stack<Character> parentesis = new Stack<Character>();
		while(haySimbolo()){
			simbolo = obtenerSimbolo();
			if(simbolo == '(')
				parentesis.addElement(simbolo);
			else{
			if(!esOperador(simbolo))
				aux1.addElement(simbolo);
			else{
				aux2.addElement(simbolo);
				while(!aux1.isEmpty())
					aux2.addElement(aux1.pop());
			}
			}
		}
		while(!aux2.isEmpty())
			aux1.addElement(aux2.pop());
		while(!aux1.isEmpty())
			nuevaexp.addElement(aux1.pop());
		return nuevaexp;
	 case 3: {
				String aux = Console.readString("Ingrese la expresion: ");
				Expresion exp = new Expresion(aux);
				Vector<Character> e = exp.inordenAPreorden();
				for(int i = 0; i < e.size(); i++)
					System.out.println(e.elementAt(i));
				a.generarArbolPostorden(e);
				break;
			}
	 
	 */
}
