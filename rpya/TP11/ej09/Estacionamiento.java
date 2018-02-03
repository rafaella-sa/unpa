package ej09;
public class Estacionamiento {
	private final int maxpila = 10;
	private Auto[] elementos;
	private int cima, cont;

	//constructor de la pila
	public Estacionamiento(){
		elementos = new Auto[maxpila];
		cima = -1;
	}
	
	//verifica si la pila está o no vacía
	public boolean estaVacio(){
		return(cima == -1);
	}
	
	//verifica si la pila está o no llena
	public boolean estaLleno(){
		return (cima == maxpila - 1);
	}
	
	//agrega un elemento en la pila
	public boolean meter(Auto auto){
		if(!estaLleno()){
			cima++;
			elementos[cima] = auto;
			return true;
		}
		else
			return false;
	}
	//saca un elemento del tope de la pila
	public Auto sacar(int pat){
		cont = 0;
		Estacionamiento e = new Estacionamiento();
		Auto aux = new Auto();
		Auto auto = new Auto();
		boolean ok = false;
		while(!estaVacio() && !ok){	
			aux = sacarAuto();
			if(aux.getPatente() != pat){
				e.meter(aux);
				aux.setMovimientos();
				cont++;
			}
			else{
				auto = aux;
				ok = true;
			}
		}
		while(!e.estaVacio()){
			aux = e.sacarAuto();
			aux.setMovimientos();
			cont++;
			meter(aux);		
		}
		return auto;
	}
	public Auto sacarAuto(){
			Auto aux = new Auto();
			if(!estaVacio()){
				aux = elementos[cima];
				cima--;
			}
			return aux;
	}
	public int getCont(){
		return cont;
	}
	//mostrar los autos
	public void mostrarAutos(){
		int num;
		System.out.println("***** Datos de autos *****");
		System.out.println("");
		for (int i = 0; i <= cima; i++){
			num = i + 1;
			System.out.println("Auto " + num);
			System.out.println("Patente: " + elementos[i].getPatente());
			System.out.println("Movimientos: " + elementos[i].getMovimientos());
			System.out.println("");
		}
		System.out.println("**************************");
	}	
}
