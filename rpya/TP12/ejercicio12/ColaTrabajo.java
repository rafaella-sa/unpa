package ejercicio12;

public class ColaTrabajo { 
	private Trabajo[]elementos;
	private int dim=10;
	private int frente, ultimo;
	
	ColaTrabajo(){
		elementos=new Trabajo[dim];
		frente=0;
		ultimo=0;
	}
	public boolean estaVacio(){
		return (ultimo-1==frente);	
		}
		
		public boolean estaLlena(){
			return(ultimo==frente);
		}
		
		//establece cual es el siguiente elemento
		private int siguiente(int subind){
			if (subind==dim-1)
			   return 0;
			else
				return ++subind;
		}
		
		//incertar un elemento en la cola
		public void insertar(Trabajo elem){
			if(!estaLlena()){
				ultimo=siguiente(ultimo);
				elementos[ultimo]=elem;
			System.out.println(elem.getToke());
			}
			}
		
		//borrar un elemento en la cola
		public Trabajo borrar(){
			if(!estaVacio()){
				frente=siguiente(frente);
				return elementos[frente];
			}
			else
				return null;
		}

}
