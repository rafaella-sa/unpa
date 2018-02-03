package ej12;
import comun.*;
public class Main_DoblePila {
	public static void main(String[] args) {
		Menu m = new Menu();
		DoblePila dp = new DoblePila();
		m.agregarItem("Ingresar un elemento");
		m.agregarItem("Sacar un elemento entre 500 y 750");
		m.agregarItem("Sacar un elemento entre 750 y 1000");
		m.agregarItem("Mostrar elementos");
		int num, opcion;
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
				case 1: {
						num = Console.readInt("Ingrese un número: ");
						while(num < 500 || num > 1000){
							num = Console.readInt("ERROR. Reingrese el número: ");
						}
						dp.meter(num);
						break;
						}
				case 2: {
						System.out.println("El elemento sacado es " + dp.sacarFondo());
						break;
						}
				case 3: {
						System.out.println("El elemento sacado es " + dp.sacarTope());
						break;
						}
				case 4: {
						System.out.println("Los elementos de la doble pila son: ");
						dp.mostrarElemento();						
						break;
						}
			}			
		}
		while(opcion!=0);
		if(opcion==0)
			System.out.println("La sección ha finalizado.");
	}
}


