
public class Pila {
	private final int maxpila=100;
	private int [] elementos;
	private int cima;
	//constructor
	public Pila()
	{
		elementos= new int [maxpila];
		cima=-1;
	}
	//verificar si esta o no vacia
	public boolean estaVacia()
	{
		return(cima==-1);
	}
	//verificar si esta llena
	public boolean estaLlena()
	{
		return(cima== maxpila-1);
	}
	// agregar elemento a la pila
	public boolean meter(int elem)
	{
		if(!estaLlena())
		{
			cima++;
			elementos[cima]=elem;
		    return true;
		}
		else
			return false;
		}

	//sacar  elemento a la pila
	public int sacar()
	{
		int aux=Integer.MIN_VALUE;
		if(!estaVacia())
		{
		   aux=elementos[cima];
		   cima--;
		}
		    return aux;
	}
}

