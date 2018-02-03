package ej07;

import comun.Console;

public class Funciones {
	//a) función que realiza la suma de tres números enteros
	//precondiciones: tres números enteros
	//postcondición: la suma entera de los tres números enteros
	static int sumatoriaElementos (int N1, int N2, int N3){
		//declaración de variables
		int SUMA;
		//cálculo de la suma y retorno del resultado
		SUMA = N1 + N2 + N3;
		return SUMA;
	}
	
	//b) función que verifica si un número es positivo o negativo
	//precondición: número entero
	//postcondición: caracter indicador
	static char verificarNumero (int X){
		if (X > 0)
			return 'P';
		else
			return 'N';
	}
	
	//c) función que realiza el promedio de dos números
	//precondiciones: dos números enteros
	//postcondición: el promedio real de los números 
	static double realizarPromedio (int N1, int N2){
		//declaración de variables
		double PROM;
		//cálculo del promedio
		PROM = ((double) N1 + (double) N2)/2;
		//retorno del resultado
		return PROM;
	}
	
	//d) función que determina cúal es la mayor de dos letras
	//precondiciones: dos caracteres ingresados
	//postcondición: el mayor de los caracteres
	static char mostrarMayorcaracter (char C1, char C2){
		if (C1 > C2)
			return C1;
		else
			return C2;
	}
	
	//e) función que verifica si un caracter es uno de los dígitos de 0 a 9
	//precondición: un caracter ingresado
	//postcondición: el mensaje
	static boolean clasificarDigito (char C){
		if (C == '0' | C == '1' | C == '2' | C == '3' | C == '4' | C == '5' | C == '6' | C == '7' | C == '8' | C == '9')
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		//declaraciones
		int NUM1;
		int NUM2;
		int NUM3;
		int N;
		int S;
		char POSNEG;
		boolean VERIF;
		int X1;
		int X2;
		double P;
		char CA1;
		char CA2;
		char MAYOR;
		char DIG;
		
		//a)
		System.out.println("a) función que realiza la suma de tres números enteros: ");
		System.out.println("Ingrese tres números enteros: ");
		NUM1 = Console.readInt();
		NUM2 = Console.readInt();
		NUM3 = Console.readInt();
		S = sumatoriaElementos (NUM1, NUM2, NUM3);
		System.out.println("La suma de los tres elementos es: " + S);
		
		//b)
		System.out.println("b) función que verifica si un número es positivo o negativo");
		System.out.println("Ingrese un número: ");
		N = Console.readInt();
		POSNEG = verificarNumero(N);
		if (POSNEG == 'P')
			System.out.println("El número " + N + " es positivo.");
		else
			System.out.println("El número " + N + " es negativo.");
		
		//c)
		System.out.println("c) función que realiza el promedio de dos números");
		System.out.println("Ingrese dos números: ");
		X1 = Console.readInt();
		X2 = Console.readInt();
		P = realizarPromedio (X1, X2);
		System.out.println("El promedio de los números es: " + P);
		
		//d
		System.out.println("d) función que determina cúal es la mayor de dos letras");
		System.out.println("Ingrese dos letras: ");
		CA1 = Console.readChar();
		CA2 = Console.readChar();
		MAYOR = mostrarMayorcaracter(CA1, CA2);
		System.out.println("El mayor caracter ingresado es: " + MAYOR);
		
		//e)
		System.out.println("e) función que verifica si un caracter es uno de los dígitos de 0 a 9");
		System.out.println("Ingrese un dígito: ");
		DIG = Console.readChar();
		VERIF = clasificarDigito (DIG);
		if (VERIF == true)
			System.out.println("El caracter ingresado es uno de los dígitos de 0 a 9.");
		else
			System.out.println("El caracter ingresado NO es uno de los dígitos de 0 a 9.");
		
	}

}
