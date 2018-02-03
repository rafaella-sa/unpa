package ej26;
public class NodoInterno implements NodoBinario{
	private NodoBinario izquierdo, derecho; // para los hijos
	private Character operador; // para el operador
	// constructor
	public NodoInterno(char op) {
	operador = new Character(op); }
	public NodoBinario getDer() { return derecho; } // hijo derecho
	public void setDer(NodoBinario n) { derecho = n; }
	// dato del nodo
	public Object getElemento() { return operador; }
	public void setElemento(Object op) {
	operador = (Character) op; }
	public boolean hoja() { return false; } // hoja
	public NodoBinario getIzq() { return izquierdo; } // hijo izquierdo
	public void setIzq(NodoBinario n) { izquierdo = n; }
}
