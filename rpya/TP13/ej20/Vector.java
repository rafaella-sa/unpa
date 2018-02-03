package ej20;
import comun.Console;
public class Vector {
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
	//a) inverso: m�todo que muestra el vector en orden inversa
	public static void inverso (int[] vector, int i){
		if (i == 0)  
			System.out.println(vector [0]);
		else{
			System.out.println(vector [i]);
			inverso (vector, i--);
		}
		}	
	//b) buscado: m�todo que busca un elemento en el vector
	public static void buscado (int elemento, int [] vector, int i){
		if (i < vector.length){
			if (elemento == vector[i])
				System.out.println(elemento + " est� en el vector, en la posici�n " + i + ".");
			else
				buscado (elemento, vector, i++);
		}
		else
			System.out.println(elemento + " no est� en el vector.");
	}		
	//c) suma: m�todo que calcula la suma de los elementos del vector 
	public static int suma (int[] vector, int i){
		if (i == vector.length - 1)
			return vector[i];
		else 
			return (vector[i] + suma (vector, i++));		
	}
	
	//d) maximo: m�todo que muestra el mayor elemento en el vector
	public static int maximo(int[] vector, int i, int mayor){
	if (i == vector.length)
		return mayor;
	else 
		if (i < vector.length){
			if (vector[i] > mayor)
				mayor = vector[i];
		}
		return maximo (vector, i++, mayor);
	}
}
