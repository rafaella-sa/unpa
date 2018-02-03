package tp13;
import Comun.Console;
class Veintiuno {
	//a) inverso: método que muestra el vector en orden inversa
	public static void inverso (int[] vector, int a){
		if (a == 0)  
			System.out.println(vector [0]);
		else{
			System.out.println(vector [a]);
			inverso (vector, a - 1);
		}
		return;			
		}
	
	//b) buscado: método que busca un elemento en el vector
	public static void buscado (int elemento, int [] vector, int b){
		if (b < vector.length){
			if (elemento == vector[b])
				System.out.println(elemento + " está en el vector, en la posición " + b + ".");
			else
				buscado (elemento, vector, b + 1);
		}
		else
			System.out.println(elemento + " no está en el vector.");
		return;
	}
		
	//c) suma: método que calcula la suma de los elementos del vector 
	public static int suma (int[] vector, int c){
		if (c == vector.length - 1)
			return vector[c];
		else 
			return (vector[c] + suma (vector, c + 1));		
	}
	
	//d) maximo: método que muestra el mayor elemento en el vector
	public static int maximo(int[] vector, int d, int mayor){
	if (d == vector.length - 1)
		return mayor;
	else if (d < vector.length - 1){
			if (vector[d++] > vector[d])
				mayor = vector[d++];
			else
				maximo (vector, d + 1, mayor);
		}
	return mayor;
	}

	
	
	public static void main(String[] args) {
		//carga de la dimensión del vector y de sus elementos
		int x = Console.readInt("Ingrese la dimensión del vector: ");
		while (x <= 0)
			x = Console.readInt("El valor ingresado no es válido. Ingrese la dimensión del vector: ");
		int [] vector;
		vector = new int [x];
		for (int j = 0; j < x; j++){
			vector [j] = Console.readInt("Ingrese un valor en la posición " + j + " del vector: ");
		}
		
		//llamada al primer método
		int a = x - 1;
		System.out.println("El vector en orden inversa es:");
		inverso(vector, a);
		
		//llamada al segundo método
		int b = 0;
		int elemento = Console.readInt("Ingrese el elemento a ser buscado: ");
		buscado(elemento, vector, b);
		
		
		//llamada al tercer método
		int c = 0;
		System.out.println("La suma de los elementos del vector es: " + suma(vector, c));
		
		//llamada al cuarto método
		int d = 0;
		System.out.println("El mayor elemento en el vector es: " + maximo(vector, d, vector[0])); 
	}
}
