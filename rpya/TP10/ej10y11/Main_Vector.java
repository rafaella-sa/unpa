package ej10y11;
import comun.Console;
public class Main_Vector {
	public static void main(String[] args) {
		//creacion de los dos vectores
		Vector vec1;
		Vector vec2;
		int i, elem;
		System.out.println ("Ingrese el tama�o del primer vector: ");
		int tam1 = Console.readInt();
		System.out.println ("Ingrese el tama�o del segundo vector: ");
		int tam2 = Console.readInt();
		while (tam1 == tam2){
			tam2 = Console.readInt("Error. Reingrese el tama�o del segundo vector: ");
		}
		vec1 = new Vector(tam1);
		vec2 = new Vector(tam2);
		//carga de datos
		System.out.println("Carga del primer vector: ");
		for(i = 0; i < tam1; i++){
			elem = Console.readInt("Ingrese el elemento de la posici�n " + i);
			vec1.agregarElemento(elem);
		}
		System.out.println("Carga del segundo vector: ");
		for(i = 0; i < tam2; i++){
			elem = Console.readInt("Ingrese el elemento de la posici�n " + i);
			vec2.agregarElemento(elem);
		}
		//11.a) mostrar el promedio m�s alto de los dos vectores
		double p1, p2;
		p1 = vec1.calcularPromedio();
		p2 = vec2.calcularPromedio();
		if (p1 > p2)
			System.out.println("El mayor promedio es: " + p1);
		else
			System.out.println("El mayor promedio es: " + p2);		
		//11.b) retornar el primer vector ordenado
		System.out.println("El primer vector ordenado es: " + vec1.ordenarVector());		
		//11.c) modificar alg�n elemento del segundo vector
		int elemmodif, posmodif;
		posmodif = Console.readInt("Ingrese la posici�n que ser� modificada: ");
		elemmodif = Console.readInt("Ingrese el elemento de la modificaci�n: ");
		vec2.modificarElemento(elemmodif, posmodif);
		}
	}

