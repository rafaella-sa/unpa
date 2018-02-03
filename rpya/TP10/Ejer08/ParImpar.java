package Ejer08;
	
public class ParImpar {
		private int [] elementos;
		private int dim;
		private int actual;
		//Constructor
		public ParImpar(int dim){
			elementos=new int [dim];
			actual=0;
		}
		public boolean agregarElem(int elem){
			boolean agrego;
			if (actual<dim){
				elementos[actual]=elem;
				actual++;
				agrego=true;
			}
			else
				agrego=false;
			return agrego;
		}
	/*	public void ordenar(){
			int aux;
			for(int i=0; i<actual; i++){
				if(i%2==0)
					  
			}
		}*/
		public int mostrar(){
			int i;
			for ( i=0; i<actual; i++){
				System.out.println("");
			}
			return elementos[i];	
		}
	}
