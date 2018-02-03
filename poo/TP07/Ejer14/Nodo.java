package  Ejer14;

public class Nodo {
	
		private int info,cont;
		
		private Nodo izquierda, derecha;
		
public Nodo(int valor)
		{
	     this.info=valor;
	     this.izquierda=null;
	     this.derecha=null;
	     this.cont=1;
		}

public int getCont() {
	return cont;
}

public void setCont(int cont) {
	this.cont = cont;
}

public void incrementar()
		{
	    cont++;
		}

public void decrementar()
		{
	    cont--;
		}
public int getInfo() {
	return info;
}

public void setInfo(int info) {
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
