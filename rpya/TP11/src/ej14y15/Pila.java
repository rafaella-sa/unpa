package ej14y15;
public class Pila {
	private final int maxpila = 100;
	private char[] elementos;
	private int cima;
	//constructor de la pila
	public Pila(){
		elementos = new char[maxpila];
		cima = -1;
	}	
	//verifica si la pila está o no vacía
	public boolean estaVacia(){
		return(cima == -1);
	}	
	//verifica si la pila está o no llena
	public boolean estaLlena(){
		return (cima == maxpila - 1);
	}	
	//agrega un elemento en la pila
	public void meter(char elem){
		if(!estaLlena()){
			cima++;
			elementos[cima] = elem;
		}
	}	
	//saca un elemento del tope de la pila
	public char sacar(){
		char aux = ' ';
		if(!estaVacia()){
			aux = elementos[cima];
			cima--;
		}
		return aux;
	}	
	//retornar copia de la pila
	public Pila copiarPila (){
		char x;
		Pila copia = new Pila();
		Pila aux = new Pila();
		while (!estaVacia()){
			aux.meter(sacar());
		}
		while(!estaLlena()){
			x = aux.sacar();
			meter(x);
			copia.meter(x);
		}
		return copia;
	}
	//14) verifica si la pila tiene el formato X & Y
	public boolean esDeLaForma(){
		Pila copia = new Pila();
		copia = copiarPila();	
		Pila subcad1 = new Pila();
		Pila subcad2 = new Pila();
		Pila aux = new Pila();
		int dim = 0;
		char x;
		int i = 0;
		boolean carga = false;
		while (i < cima && carga == false){
			x = copia.sacar();
			if(x != '&')
				subcad1.meter(x);
			else{
				dim = i+1;
				carga = true;
			}
			i++;				
		}
		for (i = dim; i < cima; i++){
			aux.meter(copia.sacar());
		}		
		while(!aux.estaVacia())
			subcad2.meter(aux.sacar());
		boolean ok = true;
		while (!subcad1.estaVacia() && !subcad2.estaVacia()&& ok == true){
			if(subcad1.sacar() == subcad2.sacar())
				ok = true;
			else
				ok = false;
		}
		return ok;
	}
	//15) verifica si la pila tiene el formato A#B donde A y B son de la forma X & Y
	public boolean esDeLaNuevaForma(){
		Pila copia = new Pila();
		Pila aux = new Pila();
		copia = copiarPila();
		int i = 0;
		char x;
		boolean ok = true;
		while(ok == true && i < cima){
			x = copia.sacar();
			if(x != '#')
				aux.meter(x);
			else{
				if(aux.esDeLaForma())
					ok = true;
				else
					ok = false;
				while(!aux.estaVacia())
					aux.sacar();
			}
			i++;
	}
	return ok;	
	}
}
