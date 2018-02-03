package ejercicio8;

public class PruebaPilaACola {
	public static void main(String[] args) {
	 
		//creacion de objetos	
		 Pila entero= new Pila();
		 Cola elementos=new Cola();
		 
		 while(!entero.estaLlena()){
			 int elemento=Console.readInt("ingrese una numero pares");
			 entero.meter(elemento);
		 }
		  //pasar de la pila a la cola
		
		 while(!entero.estaVacio()){
			int pares=entero.sacar();
			if(pares%2==0){
			 elementos.insertar(pares);
			  System.out.println("Los elementos son:"+pares);}
			}
		}
}
