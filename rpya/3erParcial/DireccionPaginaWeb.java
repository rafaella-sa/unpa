package ej01;

import comun.Console;

public class DireccionPaginaWeb {
	public static void main(String[] args) {
		//declaración de variables
		int i, n;
		char []dir;
		char viejocar, nuevocar;
		
		//carga de la URL
		n = Console.readInt("Ingrese cantidad de caracteres de la URL: ");
		while(n <= 0)
			n = Console.readInt("Error. Reingrese el valor: ");
		dir = new char [n];
		System.out.println("Ingrese la URL: ");
		for (i = 0; i < n; i++)
			dir[i] = Console.readChar();
		String direccion = new String(dir);
	
		//contar la cantidad de barras de la URL
		
		//obtener la URL principal
		
		
		//reemplazar en toda URL un caracter por otro
		viejocar = Console.readChar("Ingrese el caracter a ser reemplazado: ");
		nuevocar = Console.readChar("Ingrese el caracter de reemplazo: ");
		direccion.replace(viejocar, nuevocar);

		//determinar si se encuentra o no en la URL un valor de texto "UNPA"	
		if(direccion.contains("UNPA"))
			System.out.println("UNPA está incluido en esta URL.");
		else
			System.out.println("UNPA NO está incluido en esta URL.");
		
		//mostrar la URL
		System.out.println(direccion.valueOf(dir));
	}

}
