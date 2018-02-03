package ej20;
import comun.Console;
public class Vector {
	//a) mostrar el vector de forma inversa
	public void mostrar(int [] vector, int x){
		if(x==0)
			System.out.println(vector[x]);
		else{
			System.out.println(vector[x]);
			mostrar(vector, x-1);
			}
	}
	//b) buscar en el vector un determinado valor
	public boolean buscar(int[] vector, int i, int dim, int elem){
		if(i < dim){
			if(elem == vector[i])
				return true;			
			else
				return buscar(vector, i+1, dim, elem);
		}
		else
			return false;			
	}
	//c) sumar los elementos del vector
	public int sumarVector(int[] vector,int dim, int i){
		if (i == dim-1)
			return vector[i];
		else
			return vector[i]+ sumarVector(vector,dim, i+1 );
	}
	//d) buscar el valor máximo de los elementos del vector		
	public int buscarMaximo(int[] vector, int dim, int i, int max){
			if (i >= dim - 1)
				return max;
			else{
				int j = i + 1;
				if(vector[i] <= vector[j])
					max = vector[j];
				else
					max = vector[i];
				return buscarMaximo(vector, dim, i+1, max);
			}
	}
	//main
	public static void main(String[] args) {
		Vector v = new Vector();
		int i = 0;
		int dim = Console.readInt("Ingrese la dimensión: ");
		int x = dim - 1;
		//carga del vector
		int[] vector;
		vector = new int [dim];
		for(int j=0; j<dim; j++)
			vector[j] = Console.readInt("ingrese un elemento al vector");
		//a)
		System.out.println("Los elementos del vector en orden inverso son:");
		v.mostrar(vector, x);
		//b)
		int e=Console.readInt("Ingrese el elemento a buscar: ");
		if (v.buscar(vector, i, dim, e))
			System.out.println("El elemento fue encontrado en el vector.");
		else
			System.out.println("El elemento NO fue encontrado en el vector.");
		//c)
		System.out.println("La suma de los elementos es: " + v.sumarVector(vector,dim, i));
		//d)
		int max = vector[0];
		System.out.println("El valor máximo del vector es: " + v.buscarMaximo(vector, dim, i, max));
	}
}
