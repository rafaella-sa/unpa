package ej10;

public class ColaAuto {
	private final int maxcola=50;
	private Auto []elementos;
	private int frente, ultimo;

	//constructor
	public ColaAuto()
	{
		elementos= new Auto [maxcola];
		frente=0;
 		ultimo=0;
	}
	//verificar si la cola esta o no  vacia
	public boolean estaVacia()
	{
		return (ultimo == frente);
		                    
	}
	//verificar si la cola esta o no llena 
	public boolean estaLlena()
	{
		int sigultimo=siguiente(ultimo);
		return (sigultimo==frente);
	}
	//estable cual es el siguiente elemento
	private int siguiente(int subind)
	{
	if (subind==maxcola-1)
		return 0;
	else
		return subind+1;
	}
	//insertar elemento en la cola
	public void insertar(Auto elem)
	{
	if(!estaLlena())
	{
		ultimo=siguiente(ultimo);
		elementos[ultimo]=elem;
		elementos[ultimo].cantMovi();
	}
		return;
	}
	//borra un elemento de la cola
	public Auto borrar()
	{
		if(!estaVacia())
		{
			elementos[frente].cantMovi();
			frente=siguiente(frente);
			return elementos[frente];	
		}
		else
			return null;
	}
	//mostrar las pante de los autos
	public void mostrar()
	{
		int i;
		for(i=0; i<maxcola; i++)

			System.out.println("La patente es:" + elementos [i].getPatente());
	}

}




