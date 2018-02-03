package ej7;

import comun.Console;

public class Catedra {

	public static void main(String[] args) {
		char DIA = Console.readChar("Ingrese el dia de la semana: ");
		switch (DIA){
		case 'L' :{
			System.out.println("Hoy NO tengo programacion.");
			break;
		}
		case 'M' :{
			System.out.println("Hoy TENGO programacion.");
			break;
			}
		case 'I' :{
			System.out.println("Hoy TENGO programacion.");
			break;
		}
		case 'J' :{
			System.out.println("Hoy TENGO programacion.");
			break;
		}
		case 'V' :{
			System.out.println("Hoy NO tengo programacion.");
			break;
		}
		case 'S' :{
			System.out.println("Hoy NO tengo programacion.");
			break;
		}
		case 'D' :{
			System.out.println("Hoy NO tengo programacion.");
			break;
		}
		default: {
				System.out.println("El caracter ingresado no es valido.");
			}
		}

	}

}
