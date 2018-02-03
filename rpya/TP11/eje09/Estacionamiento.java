package ej09;
public class Estacionamiento {
	private final int maxpila = 10;
	private Auto[] elementos;
	private int cima;
	
	//constructor de la pila
	public Estacionamiento(){
		elementos = new Auto[maxpila];
		cima = -1;
	}
	
	//verifica si la pila está o no vacía
	public boolean estaVacia(){
		return(cima == 1);
	}
	
	//verifica si la pila está o no llena
	public boolean estaLlena(){
		return (cima == maxpila - 1);
	}
	
	//agrega un elemento en la pila
	public void meter(Auto auto){
		if(!estaLlena()){
			System.out.println("Hay lugar para el auto.");
			cima++;
			elementos[cima] = auto;
			auto.setEntradas(auto.getEntradas() + 1);
		}
		else
			System.out.println("NO hay lugar para el auto.");
	}
	
	//saca un elemento del tope de la pila
	public Auto sacar(int patente){		
		Auto aux;
		aux = new Auto();

		if(!estaVacia()){
			
					elementos[cima].setSalidas(elementos[cima].getSalidas()-1);
					aux = elementos[cima];
					cima--;			
				
			}			
		
		return aux;
	}
}