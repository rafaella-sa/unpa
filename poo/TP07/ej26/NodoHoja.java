package ej26;
public class NodoHoja implements NodoBinario{
	private String dato; // operando
	// constructor
	public NodoHoja(char d) { dato = new Character(d).toString(); }
	// hijo derecho
	public NodoBinario getDer() { return null; }
	public void setDer(NodoBinario n) { }
	public Object getElemento() { return dato; }
	public void setElemento(Object d) { dato=(String)d; }
	public boolean hoja() { return true; }
	// hijo izquierdo
	public NodoBinario getIzq() { return null; }
	public void setIzq(NodoBinario n) { }
}
