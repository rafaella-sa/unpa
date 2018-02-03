package Ejer3;
	public class MetodoBurbuja {
		private int [] vector;
		private int dim;
		private int actual;
	public MetodoBurbuja(int tam){	
		if(tam<= 0)
			dim=100;
		else
			dim=tam;
		
		vector=new int[dim];
		actual=0;
	}
	public void agregarElem(int elem){
		if (actual < dim){
			vector[actual]= elem;
			actual=actual++;
			}
	}
	public void ordenacion(){
		int aux;
		for(int i=actual; i>=1;i--){
			//PONER EL MAYOR ELEMENTO DE VECTOR[0]; VECTOR[I] E VECTOR[I]
			for(int j=0; j<=actual; j++){
				if(vector[i]> vector [j++]){
					aux= vector[j];
					vector[j]=vector[j++];
					vector[j++]=aux;
				}
		}
	}
	}
}