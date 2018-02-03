package ej07;

public class Nodo {
	public int info;
	public Nodo sig;
	public Nodo (int valor){
		info = valor;
		sig = null;
	}
	public void setInfo(int valor)
	{ info = valor;}
	public void setSig(Nodo dir)
	{ sig = dir;}
	public int getInfo()
	{ return info;}
	public Nodo getSig()
	{ return sig;}
}
