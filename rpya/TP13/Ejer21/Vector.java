package Ejer21;
import Comun.Console;
public class Vector {

	public int sumaV(int [] vector,int dim, int i){
	if (i==dim-1)
		return vector[i];
	if(i>=0)
			return vector[i]+ sumaV(vector,dim, i+1 );
	else
		return -1;
}
	public void mostrar(int [] vector, int x){
	if(x==0)
		System.out.println(vector[x]);
	else{
		System.out.println(vector[x]);
		 mostrar(vector, x-1);
}
}
	public boolean buscar(int [] vector, int i, int dim, int elem){
		if(i<dim){
			if(elem==vector[i])
				return true;
		
			else
				return buscar(vector, i+1, dim, elem);
	}
		else
			return false;
		
}
public int valorM(int [] vector, int dim, int i, int aux){
		if (i>=dim--)
			return aux;
		else{
			if(vector[i]<=vector[i++])
				aux=vector[i];
			else
				aux=vector[i+1];
			return valorM(vector, dim, i+1, aux);
		}
}
	public static void main(String[] args) {

	Vector v=new Vector();
	int i=0;
	int dim=Console.readInt("ingrese una dimension");
	int x=dim-1;
	//CARGA DEL VECTOR
	int []vector;
	vector = new int [dim];
	int elem;
	for(int j=0; j<dim; j++)
		vector[j]=elem=Console.readInt("ingrese un elemento al vector");
	//METODO 1
	System.out.println("lA SUMA DE LOS ELEMENTOS ES:" + v.sumaV(vector,dim, i));
	//METODO2
	System.out.println("los elementos del vector son:");
	v.mostrar(vector, x);
	//METODO 3
	int e=Console.readInt("ingrse el elemento a comparar");
	System.out.println("elemento encontrado? " + v.buscar(vector, i, dim, e));
	//METODO 4
	int aux=0;
	System.out.println("el valor maximo es:" + v.valorM(vector, dim, i, aux));
	
		}
	}
