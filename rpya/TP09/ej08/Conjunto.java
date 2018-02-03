package ejer08;

public class Conjunto {
	
	private int [] vector;
	private int actual;
	final int dim =10;
//constructor
	public Conjunto (int dim){
		vector=new  int [dim];
		actual=-1;
	}
	public void vaciarVector(){
		actual=-1;
	}
	public void agregarElementos(int elem){
		if (pertenece(elem) && actual < dim){
			actual=actual++;
			vector[0]= elem;
		}

	}
	boolean pertenece (int elem){
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
	public Conjunto interseccion(Conjunto B){
		Conjunto C =new Conjunto();
		for(int i=0;i<actual;i++)
			if(B.pertenece(vector[i]))
				C.agregarElementos(vector [i]);
		
		return C;
		
	}
	public void mostrar(){
		for(int i=0;i<actual;i++)
			System.out.println(vector[i]);
	}
}

