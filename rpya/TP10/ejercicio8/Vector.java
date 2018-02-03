package ejercicio8;

public class Vector {
	//declaracion de variable
	public int []vector;
	public int []vectorResultante;
	public int dim;
	public int i, j;
	
	Vector(int di){
	  dim=di;
	   vector=new int [dim];
	}
	
	//ordenamiento posiones pares;
	public void OrdenamientoPares(){
		int aux;
		for(int pares=0;pares<dim;pares=pares+2){
			aux=vector[i];
			j=i+2;
			while(j>=0 && vector[j]>aux){
				vector[j+2]=vector[j];
				j=j-2;
			}
			vectorResultante[j+2]=aux;
		}
	}
	
	//BUSCAR LOS ELEMENTOS PARES
	public int buscarElementosPosicionesPares(int buscado){
		int pares=0;
		int posicion=0;
		boolean encontrado=false;
		while(encontrado==false&& pares<dim){
			if(vectorResultante[pares]== buscado){
				encontrado=true;
				posicion=pares;
			}
			pares=pares+2;
		}
		return posicion;
	}
	
	public void ordenarPosicionesImpares(){
		int auxImpares=0;
		int c=0;
		for(int impares=3;impares<dim;impares=impares+2){
			auxImpares=vector[impares];
			c=impares-2;
			while(c>=1& vector[c]<auxImpares){
				vector[c+2]=vector[c];
				c=c+2;
			}
			vectorResultante[j+1]=auxImpares;
			}
	}
	
	public int buscarElementoPosicionesImpares(int buscado){
		int f=1;
		int posiciones=0;
		boolean encontrado=false;
		while(encontrado==false&& f<dim){
			if(vectorResultante[f]==buscado){
				encontrado=true;
				posiciones=f;
				}
		}
		return posiciones;
	}
}
