package ej9;

import comun.Console;

public class Calificaciones {

	public static void main(String[] args) {
		int C = Console.readInt("Ingrese el numero de calificaciones: ");
		int SUMASO = 0;
		int SUMASA = 0;
		int SUMANO = 0;
		int NOTA;
		for (int CONT = 1; CONT <= C; CONT++){
			NOTA = Console.readInt("Ingrese el valor de la calificacion: ");
			if (NOTA < 60){
				System.out.println("La calificacion: " + NOTA + " es no satisfactoria.");
				SUMANO++;
			}
			else
				if (NOTA < 90){
					System.out.println("La calificacion: " + NOTA + " es satisfactoria.");
					SUMASA++;
				}
				else{
					System.out.println("La calificacion: " + NOTA + " es sobresaliente.");
					SUMASO++;
			}
		}
		System.out.println("La suma de las calificaciones sobresalientes es: " + SUMASO);
		System.out.println("La suma de las calificaciones satisfactorias es: " + SUMASA);
		System.out.println("La suma de las calificaciones no satisfactorias es: " + SUMANO);
	}

}
