package Ejer15;

public class IteradorDeArbol {
	
	private Nodo actual; 
	
	
public	IteradorDeArbol (Arbol arb)
		  {
			actual = arb.getRaiz();
		  }

public boolean tieneProximo()
		{ 
		return (tieneDerecha()||tieneIzquierda()); 
		}

public boolean tieneDerecha()
		{
	    return actual.getDerecha()!=null;
		}

public boolean tieneIzquierda()
		{
	   return actual.getIzquierda()!=null;
		}

public Nodo getActual()
		{
		return actual;
		}



public void nodoIzquierdo()
			{
			actual=actual.getIzquierda();
			}

public void nodoDerecho()
			{
	         actual=actual.getDerecha();
	        }

}
