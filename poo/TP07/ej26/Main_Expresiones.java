package ej26;
import comun.*;
import java.util.Vector;

public class Main_Expresiones {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.agregarItem("Ingresar expresión - PREORDEN (notación prefija)");
		m.agregarItem("Ingresar expresión - POSTORDEN(notación posfija)");
		m.agregarItem("Mostrar expresión - PREORDEN (notación prefija)");
		m.agregarItem("Mostrar expresión - POSTORDEN(notación posfija)");
		m.agregarItem("Mostrar expresión - INORDEN  (notación infija)");
		m.agregarItem("Evaluar el árbol");
		int opcion;
		ArbolBinarioExpresion a = new ArbolBinarioExpresion();
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
			case 1: { 
				String e = Console.readString("Ingrese la expresión: ");
				Expresion exp = new Expresion(e);
				a.generarArbolPreorden(exp);
				break;				
			}
			case 2: { 
				String aux = Console.readString("Ingrese la expresión: ");
				Expresion exp = new Expresion(aux);
				Vector<Character> e = exp.postordenAPreorden();
				for(int i = 0; i < e.size(); i++)
				System.out.println(e.elementAt(i));
				a.generarArbolPostorden(e);
				exp.setS(0);
				break;
				}
			case 3: {
				a.preorden(a.getRaiz());
				break;
			}
			case 4: {
				a.postorden(a.getRaiz());
				break;
			}
			case 5: {
				a.inorden(a.getRaiz());
				break;
			}
			case 6: {
				System.out.println(a.eval(a.getRaiz()));
				break;
			}
			}
		}
		while(opcion!=0);
	}

}
