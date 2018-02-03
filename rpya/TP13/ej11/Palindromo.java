package ej11;
import comun.Console;
public class Palindromo{
	public static void main(String[] args) {
		//creación y carga del vector
		int dim = Console.readInt("Ingrese la cantidad de letras: ");
		char[] vector;
		vector = new char[dim];
		for(int i = 0; i < dim; i++){
			int n = i+1;
			char letra = Console.readChar("Ingrese la letra " + n + " de la palabra: ");
			vector[i] = letra;
		}
		//verificación
		if(palindromo(vector, 0, --dim))
			System.out.println("es palindromo");
		else
			System.out.println("no es palindromo");		
		}
	//método que verifica si es palíndromo
	public static boolean palindromo(char[] vector, int izq, int der){
		if(der <= izq)
			return true;
		else
			if(vector[izq] != vector[der])
				return false;
			else
				return palindromo(vector, izq++, der--);
	}
}
