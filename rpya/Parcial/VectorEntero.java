package recursividad;
import comun.Console;
class VectorEntero {
	//maximo: método que muestra el mayor elemento en el vector
	public int maximo(int[] vector, int mayor, int dim, int d){
	if(d < dim){
		if (dim == 0|dim == 1)
			return mayor;
		else
				if(vector[d] > mayor){
					mayor = vector[d];
					return maximo(vector, mayor, dim, d + 1); 
				}
				else
					return maximo(vector, mayor, dim, d+1);
	}
	return mayor;
	}
			
	//método recursivo que realiza el producto
	public int producto(int[] vector, int x, int i){	
	if(i==0)
		return vector[i];
	else
		return (vector[i] * producto(vector, x, i - 1));
	}
		
public static void main(String[] args) {
		//carga de la dimensión del vector y de sus elementos y creación del objeto
		VectorEntero v = new VectorEntero();
		int dim = Console.readInt("Ingrese la dimensión del vector: ");
		while (dim <= 0)
			dim = Console.readInt("El valor ingresado no es válido. Ingrese la dimensión del vector: ");
		int [] vector;
		vector = new int [dim];
		for (int i = 0; i < dim; i++){
			vector [i] = Console.readInt("Ingrese un valor en la posición " + i + " del vector: ");
		}
	
		//llamada al método producto
		int i = dim - 1;
		int x = Console.readInt("Determine el valor de X: ");
		System.out.println("Resultado: " + v.producto(vector, x, i));
		System.out.println("El vector cargado es: ");
		for (int j = 0; j < dim; j++)
			System.out.println(vector[j]);
		
		//llamada al método maximo
		int d = 0;
		int mayor = 0;
		System.out.println("El mayor valor en el vector es: " + v.maximo(vector, mayor, dim, d));
	}
}
