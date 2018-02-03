package  PruebaEjer3Char;

public class Nodo {
	
		private char info;
		private Nodo izquierda, derecha;
		
public Nodo(char valor)
		{
	     this.info=valor;
	     this.izquierda=null;
	     this.derecha=null;
		}

public char getInfo() {
	return info;
}

public void setInfo(char info) {
	this.info = info;
}

public Nodo getIzquierda() {
	return izquierda;
}

public void setIzquierda(Nodo izquierda) {
	this.izquierda = izquierda;
}

public Nodo getDerecha() {
	return derecha;
}

public void setDerecha(Nodo derecha) {
	this.derecha = derecha;
}

public boolean esHoja()
		 {
	     return(derecha==null && izquierda==null);
		 }


public boolean tieneUnHijo()
		 {
		 if (derecha == null && izquierda != null)
			 return true;
		 else if (derecha != null && izquierda == null)
			 return true;
		 else
			 return false;
		 }


public Nodo getUnicoHijo()
		 {
		 if ( derecha == null )
			 return izquierda;
		 else
			 return derecha;
		 }

}
