package tp13;
import Comun.Console;
class Veintiuno {
	//a) inverso: m�todo que muestra el vector en orden inversa
	public static void inverso (int[] vector, int a){
		if (a == 0)  
			System.out.println(vector [0]);
		else{
			System.out.println(vector [a]);
			inverso (vector, a - 1);
		}
		return;			
		}
	
	//b) buscado: m�todo que busca un elemento en el vector
	public static void buscado (int elemento, int [] vector, int b){
		if (b < vector.length){
			if (elemento == vector[b])
				System.out.println(elemento + " est� en el vector, en la posici�n " + b + ".");
			else
				buscado (elemento, vector, b + 1);
		}
		else
			System.out.println(elemento + " no est� en el vector.");
		return;
	}
		
	//c) suma: m�todo que calcula la suma de los elementos del vector 
	public static int suma (int[] vector, int c){
		if (c == vector.length - 1)
			return vector[c];
		else 
			return (vector[c] + suma (vector, c + 1));		
	}
	
	//d) maximo: m�todo que muestra el mayor elemento en el vector
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
		//carga de la dimensi�n del vector y de sus elementos
		int x = Console.readInt("Ingrese la dimensi�n del vector: ");
		while (x <= 0)
			x = Console.readInt("El valor ingresado no es v�lido. Ingrese la dimensi�n del vector: ");
		int [] vector;
		vector = new int [x];
		for (int j = 0; j < x; j++){
			vector [j] = Console.readInt("Ingrese un valor en la posici�n " + j + " del vector: ");
		}
		
		//llamada al primer m�todo
		int a = x - 1;
		System.out.println("El vector en orden inversa es:");
		inverso(vector, a);
		
		//llamada al segundo m�todo
		int b = 0;
		int elemento = Console.readInt("Ingrese el elemento a ser buscado: ");
		buscado(elemento, vector, b);
		
		
		//llamada al tercer m�todo
		int c = 0;
		System.out.println("La suma de los elementos del vector es: " + suma(vector, c));
		
		//llamada al cuarto m�todo
		int d = 0;
		System.out.println("El mayor elemento en el vector es: " + maximo(vector, d, vector[0])); 
	}
}
