package ej06;

public class Nodo {
	int info;
	Nodo sig;
	Nodo (int valor)
	{
	info = valor;
	sig = null;
	}
	void setInfo(int valor)
	{ info = valor;}
	void setSig(Nodo dir)
	{ sig = dir;}
	int getInfo()
	{ return info;}
	Nodo getSig()
	{ return sig;}
}
