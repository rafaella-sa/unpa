package ejer01;

public class Vector {
	// declaracion de variables
	private int [] vector1;
	private int dim1;
	private int actual;
//constructor
	public Vector (int tam1){
		if(tam1<= 0)
			dim1=100;
		else
			dim1=tam1;
		actual=0;
		vector1=new int[dim1];
	}
	// metodo que agrega un elemento
	public void agregarElemento(int elemen){
		if (actual < dim1){
			vector1[actual]= elemen;
			actual=actual++;
			}
	}
	//devolver un elemento
	public int getElem(int posicion){
		return vector1[posicion];
			}
	public int getCantelem(){
		return actual+1;

	}
	public int SumaElem(){
		int suma;
		suma=0;
		for (int ind=0; ind<actual; ind++)
			suma=suma+ vector1[ind];
		return suma;
		}
	public double promedio(){
		int suma;
		double prom;
		prom=0;
		suma=SumaElem();
		prom= suma/actual;
		return prom;
	}
	//modificar elemento
	public void modificarElem(int pos, int valor){
			if (pos < actual){
				for(int ind=0; ind<actual; ind++)
					if (pos==ind)
						vector1[ind]=valor;
			}
		}
	public int getobtenerMayor(){
		int mayor;
		mayor=vector1[0];
		for (int ind=1; ind<actual; ind++){
			if (vector1[ind]>mayor)
				mayor= vector1[ind];
		}
		return mayor;
	}
	public int getobtenerMenor(){
		int menor;
		menor=vector1[0];
		for (int ind=1; ind<actual; ind++){
			if (vector1[ind]< menor)
				menor= vector1[ind];
		}
		return menor;
	}
	public void ordenVector(){
		int dim=actual;
		int [] vectorO;
		vectorO= new int [dim];
		int menor;
		menor= vector1[0];
		for (int ind=1; ind<actual; ind++){
			if (vector1[ind]< menor)
				vectorO[ind - 1]=menor;
		}
	}
	public int [] devolverVector(){
		int dim=actual;
		int [] vectorD;
		vectorD= new int [dim];
		
		for(int ind=actual;ind<0;ind--){
			vectorD[ind]= vector1[ind];
		}
		return vectorD;
	}
	public void compararProm(Vector v ){
		double p1=promedio();
		System.out.println(p1);
		double p2=v.promedio();
		System.out.println(p2);
		if (p1>p2)
			 System.out.println("el mayor promedio es:" + p1); 
		else
			System.out.println("el mayor promedio es:" + p2);
		return;
	}
	
}


