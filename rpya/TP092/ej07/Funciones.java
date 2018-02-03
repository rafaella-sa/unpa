package ej07;

import comun.Console;

public class Funciones {
	//a) funci�n que realiza la suma de tres n�meros enteros
	//precondiciones: tres n�meros enteros
	//postcondici�n: la suma entera de los tres n�meros enteros
	static int sumatoriaElementos (int N1, int N2, int N3){
		//declaraci�n de variables
		int SUMA;
		//c�lculo de la suma y retorno del resultado
		SUMA = N1 + N2 + N3;
		return SUMA;
	}
	
	//b) funci�n que verifica si un n�mero es positivo o negativo
	//precondici�n: n�mero entero
	//postcondici�n: caracter indicador
	static char verificarNumero (int X){
		if (X > 0)
			return 'P';
		else
			return 'N';
	}
	
	//c) funci�n que realiza el promedio de dos n�meros
	//precondiciones: dos n�meros enteros
	//postcondici�n: el promedio real de los n�meros 
	static double realizarPromedio (int N1, int N2){
		//declaraci�n de variables
		double PROM;
		//c�lculo del promedio
		PROM = ((double) N1 + (double) N2)/2;
		//retorno del resultado
		return PROM;
	}
	
	//d) funci�n que determina c�al es la mayor de dos letras
	//precondiciones: dos caracteres ingresados
	//postcondici�n: el mayor de los caracteres
	static char mostrarMayorcaracter (char C1, char C2){
		if (C1 > C2)
			return C1;
		else
			return C2;
	}
	
	//e) funci�n que verifica si un caracter es uno de los d�gitos de 0 a 9
	//precondici�n: un caracter ingresado
	//postcondici�n: el mensaje
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
		System.out.println("a) funci�n que realiza la suma de tres n�meros enteros: ");
		System.out.println("Ingrese tres n�meros enteros: ");
		NUM1 = Console.readInt();
		NUM2 = Console.readInt();
		NUM3 = Console.readInt();
		S = sumatoriaElementos (NUM1, NUM2, NUM3);
		System.out.println("La suma de los tres elementos es: " + S);
		
		//b)
		System.out.println("b) funci�n que verifica si un n�mero es positivo o negativo");
		System.out.println("Ingrese un n�mero: ");
		N = Console.readInt();
		POSNEG = verificarNumero(N);
		if (POSNEG == 'P')
			System.out.println("El n�mero " + N + " es positivo.");
		else
			System.out.println("El n�mero " + N + " es negativo.");
		
		//c)
		System.out.println("c) funci�n que realiza el promedio de dos n�meros");
		System.out.println("Ingrese dos n�meros: ");
		X1 = Console.readInt();
		X2 = Console.readInt();
		P = realizarPromedio (X1, X2);
		System.out.println("El promedio de los n�meros es: " + P);
		
		//d
		System.out.println("d) funci�n que determina c�al es la mayor de dos letras");
		System.out.println("Ingrese dos letras: ");
		CA1 = Console.readChar();
		CA2 = Console.readChar();
		MAYOR = mostrarMayorcaracter(CA1, CA2);
		System.out.println("El mayor caracter ingresado es: " + MAYOR);
		
		//e)
		System.out.println("e) funci�n que verifica si un caracter es uno de los d�gitos de 0 a 9");
		System.out.println("Ingrese un d�gito: ");
		DIG = Console.readChar();
		VERIF = clasificarDigito (DIG);
		if (VERIF == true)
			System.out.println("El caracter ingresado es uno de los d�gitos de 0 a 9.");
		else
			System.out.println("El caracter ingresado NO es uno de los d�gitos de 0 a 9.");
		
	}

}
