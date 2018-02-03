package ej08;

import comun.Console;

public class Funciones_vector {
		//a) función que muestra los elementos de un vector
		//precondición: vector cargado
		//postcondición: muestra del vector
		static void mostrarVector (int []vector, int TOPE){
			//declaraciones
			int x;
			//muestra del vector
			System.out.println("Elementos del vector: ");
			for (x = 0; x < TOPE; x++){
				System.out.println(vector[x]);
			}
		}
		
		//b) función que busca el mayor elemento del vector
		//precondición: vector cargado
		//postcondición: el mayor elemento
		static int buscarMayorelemento (int []vector, int TOPE){
			//declaraciones
			int  mayor;
			int X;
			//carga de datos
			mayor = vector[0];
			for (X = 0; X < TOPE; X++){
				if(vector [X] > mayor)
					mayor = vector [X];
			}
			return mayor;
		}
		
		//c) función que muestra el vector en orden invertido
		//precondición: vector cargado
		//postcondición: vector en orden invertido
		static void invertirVector (int []vector, int TOP){
			//declaraciones
			int x;
			int []vec;
			vec = new int [TOP];
			//inversión del vector y muestra del resultado
			for (x = 0; x < TOP; x++){
				vec [TOP-1-x] = vector[x];
			}
			mostrarVector (vec, TOP);		
		}
	public static void main(String[] args) {
		//declaraciones
		int DIM = 100;
		int []vec;
		vec = new int [DIM];
		int i;
		int m;
		int n;
		
		//carga de datos
		System.out.println("Ingrese la dimensión del vector: ");
		n = Console.readInt();
		while (n <= 0 || n > DIM){
			System.out.println("Error. Reingrese la dimensión del vector: ");
			n = Console.readInt();			
		}
		System.out.println("Ingrese los elementos del vector: ");
		for (i = 0; i < n; i++){
			vec [i] = Console.readInt();
		}
		
		//a)
		System.out.println("a) función que muestra los elementos de un vector");
		mostrarVector(vec, n);
		
		//b)
		System.out.println("b) función que busca el mayor elemento del vector");
		m = buscarMayorelemento(vec, n);
		System.out.println("El mayor elemento en el vector es " + m);
		
		//c)
		System.out.println("c) función que muestra el vector en orden invertido");
		invertirVector(vec, n);
		

	}

}
