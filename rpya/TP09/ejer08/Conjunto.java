package ejer08;

public class Conjunto {
	private int [] vector;
	private int actual;
	private int dim;
	//constructor
	public Conjunto (int dim){
		this.dim=dim;
		actual=0;
		vector=new  int [dim];
	}
	public void vaciarVector(){
		actual=-1;
	}
	public void agregarElementos(int elem){
		if (actual < dim){
			vector[actual]= elem;
			actual=actual+1;
		}

	}
	public boolean pertenece(int elem){
		boolean enc=false;
		int i=0;
		while (i<=actual && ! enc){
			if (vector[i]== elem)
				enc=true;
			else
				i++;
			}
		return enc;
		
	}
	public int devolverElem(int pos){
			return vector [pos];
	}
	public Conjunto interseccion(Conjunto B){
		Conjunto C = new Conjunto(10);
		for(int i=0;i<actual;i++)
			if(B.pertenece(vector[i]))
				C.agregarElementos(vector [i]);
		
		return C;
	}
	/*public Conjunto union (Conjunto B){
		Conjunto U= new Conjunto(30);
		int i=0;*/
	/* do
	 {
		  B.devolerElem(i)=! vector[i];
		  i++;
	 }while(i <actual);
		 
		}

		*/	
			/*U.agregarElementos(vector [i]);
			if(B.pertenece(vector [i])){
				System.out.println();
			}
			else 
				U.agregarElementos(vector[i]);
		}
		return U;
	}*/
	public Conjunto diferencia(Conjunto B){
		Conjunto D= new Conjunto (20);
		for (int i=0; i<actual; i++){
			if(B.pertenece(vector [i])){
				System.out.println();
			}
			else 
				D.agregarElementos(vector[i]);
		}
		return D;
	}
				

	public void mostrar(){
		for(int i=0;i<actual;i++)
			System.out.println("elemento: " + vector[i]);
	}
}


