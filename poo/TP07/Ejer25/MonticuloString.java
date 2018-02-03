package Ejer25;


public class MonticuloString{
	Trabajo []nodos;
	int numnodos, dim;
	
	public MonticuloString()
	{
		dim=51;
		nodos=new Trabajo[dim];
		numnodos=0;	
	}
	
	public void añadirTrabajo(Object nuevo ){
		
		if(numnodos<dim)
		{
			numnodos++;
			nodos[numnodos]=(Trabajo) nuevo;//inserta el final del arbol	
			restMontArriba();
		}
	}
	
	public Trabajo eliminar(int indice){
		
		Trabajo aux=nodos[indice];
		nodos[indice]=nodos[numnodos];
		numnodos--;
		restMontAbajo(indice);
		return aux;
			
	}
	
	public boolean estaVacia(){
		return numnodos<1;
		}
		
	public void restMontArriba(){//restaura el monticulo hacia arriba
		int actual, padre;
		Trabajo aux;
		boolean ok=false;
		actual=numnodos;
		padre=actual/2;
		while(actual>1&&!ok){
			if(nodos[padre].getId()>=nodos[actual].getId())
				ok=true;
			else
			{//intercambia con el padre
				aux=nodos[padre];
				nodos[padre]=nodos[actual];
				nodos[actual]=aux;
				actual=padre;//sube
				padre=actual/2;
				}
			}
	}
	
	public void restMontAbajo(int indice){
		boolean ok=false;
		int maxhijo,raiz=indice;
		Trabajo aux;
		while(raiz*2<=numnodos&&!ok){
			if(raiz*2==numnodos)
				maxhijo=raiz;
			else
				if(nodos[raiz*2].getId()>nodos[raiz*2+1].getId())
					maxhijo=raiz*2;
				else
					maxhijo=raiz*2+1;
			if(nodos[raiz].getId()<nodos[maxhijo].getId())
			{
				aux=nodos[raiz];
				nodos[raiz]=nodos[maxhijo];
				nodos[maxhijo]=aux;
				raiz=maxhijo;
			}
			else
				ok=true;
			}
		}
		
		public void preorden(int indice){
			
			if(indice<=numnodos){
				
				System.out.println(nodos[indice]+"");
				preorden(indice*2);
				preorden(indice*2+1);
				}
			}
			
		public int getRaiz(){
			return 1;
			}
			
			
		public boolean estaLlena(){
			return (numnodos==dim);
		}
		
		public void mostrar(){
			
			for(int i=1;i<=numnodos;i++){
				System.out.println("Trabajo: "+nodos[i].getToken());
			}
		}
		
		
}