package ej26;
public interface NodoBinario {
	// recupera y asigna el hijo derecho
	public NodoBinario getDer();
	public void setDer(NodoBinario n);
	// recupera y asigna del elemento del nodo
	public Object getElemento();
	public void setElemento(Object v);
	// devuelve true si el nodo es una hoja
	public boolean hoja();
	// recupera y asigna el hijo izquierdo
	public NodoBinario getIzq();
	public void setIzq(NodoBinario n);
}
