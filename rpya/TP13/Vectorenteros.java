package ejercicio21;
import Comun.Console;
class Vectorenteros {
	//a) inverso: método que muestra el vector en orden inversa
	public void inverso (int[] vector, int a){
		if (a == 0)  
			System.out.println(vector [0]);
		else{
			System.out.println(vector [a]);
			inverso (vector, a - 1);
		}
		return;			
		}
	
	//b) buscado: método que busca un elemento en el vector
	public void buscado (int elemento, int [] vector, int b, int x){
		if (b < x--){
			if (elemento == vector[b])
				System.out.println(elemento + " está en el vector, en la posición " + b + ".");
			else
				buscado (elemento, vector, b + 1, x);
		}
		else
			System.out.println(elemento + " no está en el vector.");
		return;
	}
		
	//c) suma: método que calcula la suma de los elementos del vector 
	public int suma (int[] vector, int c){
		if (c == 0)
			return vector[0];
		else 
			return (vector[c] + suma (vector, c - 1));		
	}
	
	//d) mayor: método que muestra el mayor elemento en el vector
	public int mayor(int[] vector, int d, int M, int x){
	if (d < x--)
		if (d >= x--)
		return M;
		else {
			if (vector[d] < vector[d++])
				M = vector[d];
			else
				M = vector[d + 1];
			return mayor (vector, d + 1, M, x);
		}
}
	

	public static void main(String[] args) {
		//carga de la dimensión del vector y de sus elementos y creación del objeto
		Vectorenteros v = new Vectorenteros();
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
		v.inverso(vector, a);
		
		//llamada al segundo método
		int b = 0;
		int elemento = Console.readInt("Ingrese el elemento a ser buscado: ");
		v.buscado(elemento, vector, b, x);
		
		
		//llamada al tercer método
		int c = x - 1;
		System.out.println("La suma de los elementos del vector es: " + v.suma(vector, c));
		
		//llamada al cuarto método
		int d = 0;
		int M = 0;
		System.out.println("El mayor elemento en el vector es: " + v.mayor(vector, d, M, x)); 
	}
}
