
public class Cola {

		private final int maxcola=50;
		private int []elementos;
		private int frente, ultimo;

		//constructor
		public Cola()
		{
			elementos= new int [maxcola];
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
			return subind++;
		}
		//insertar elemento en la cola
		public void insertar(int elem)
		{
		if(!estaLlena())
		{
			ultimo=siguiente(ultimo);
			elementos[ultimo]=elem;
		}
			return;
		}
		//borra un elemento de la cola
		public int borrar()
		{
			if(!estaVacia())
			{
				frente=siguiente(frente);
				return elementos[frente];	
			}
			else
				return Integer.MIN_VALUE;
		}
		}

