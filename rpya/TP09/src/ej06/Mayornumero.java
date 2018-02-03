package ej06;

import comun.Console;

public class Mayornumero {

	public static void main(String[] args) {
		System.out.print("Ingrese tres numeros enteros: ");
		int NRO1 = Console.readInt();
		int NRO2 = Console.readInt();
		int NRO3 = Console.readInt();
		if (NRO1 > NRO2 & NRO1 > NRO3)
			System.out.println("El mayor es: " + NRO1);
		else
				if (NRO2 > NRO1 & NRO2 > NRO3)
					System.out.println("El mayor es: " + NRO2);	
				else 
					System.out.println("El mayor es:" + NRO3);
	}

}
