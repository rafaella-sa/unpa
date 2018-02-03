package ej12;
public class DoblePila {
	private final int maxpila = 200;
	private int[] elementos;
	private int dim1, dim2, i, x;	
	//constructor de la pila
	public DoblePila(){
		elementos = new int[maxpila];
		dim1 = -1;
		dim2 = maxpila;
	}	
	//verifica si la pila está o no vacía
	public boolean estaVacia(){
		return(dim1 == -1 && dim2 == maxpila);
	}	
	public boolean estaVaciaFondo(){
		return dim1 == -1;
	}	
	public boolean estaVaciaTope(){
		return dim2 == maxpila;
	}	
	//verifica si la pila está o no llena
	public boolean estaLlena(){
		return (dim1 == maxpila - 1 && dim2 == -1);
	}	
	public boolean estaLlenaFondo(){
		return dim1 == maxpila - 1;
	}	
	public boolean estaLlenaTope(){
		return dim2 == -1;
	}
	//agrega un elemento en la pila
	public void meter(int elem){
			if(elem >= 500 && elem <= 750){
				if(!estaLlenaFondo()){
				dim1++;
				elementos[dim1] = elem;
				}
			}
			if(elem > 750 && elem <= 1000){
				if(!estaLlenaTope()){
				dim2--;
				elementos[dim2] = elem;
			}
			}
	}	
	//saca un elemento del tope de la pila
	public int sacarFondo(){
		int aux = 0;
		if(!estaVaciaFondo()){
			aux = elementos[dim1];
			dim1--;
		}
		return aux;
	}	
	//saca un elemento desde el inicio de la pila
	public int sacarTope(){
		int aux = 0;
		if(!estaVaciaTope()){
			aux = elementos[dim2];
			dim2++;
		}
		return aux;
	}	
	//retorna la dimensión 1
	public int getDim1(){
		return dim1;
	}	
	//retorna la dimensión 2
	public int getDim2(){
		return dim2;
	}	
	//mostra el elemento
	public void mostrarElemento(){
		Pila p = new Pila();
		while(!estaVaciaFondo()){
			x = sacarFondo();
			p.meter(x);
		}
		for (i = 0; i < p.getCima(); i++){
			System.out.println(p.getElemento(i));
		}
		while(!p.estaVacia()){
			meter(p.sacar());
		}
		while(!estaVaciaTope()){
			x = sacarTope();
			System.out.println(x);
			p.meter(x);
		}
		for (i = 0; i < p.getCima(); i++){
			System.out.println(p.getElemento(i));
		}
		while(!p.estaVacia()){
			meter(p.sacar());
		}
	}
}
