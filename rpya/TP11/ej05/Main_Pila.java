package ej05;
import comun.*;
public class Main_Pila {

	public static void main(String[] args) {
		int opcion;
		Pila P;
		P = new Pila();
		Menu menu;
		menu = new Menu();
		menu.agregarItem("Ingresar elemento en la pila");
		menu.agregarItem("Sacar elemento de la pila");
		do{
			System.out.println(" ");
			opcion = menu.ejecutarMenu();
			switch(opcion){
				case 1: {
						int elem = Console.readInt("Ingrese elemento de la pila: ");
						P.meter(elem);
						break;
						}
				case 2: {
						P.sacar();
						break;
						}
				default:
					System.out.println("La opción no existe.");
			}
			
		}
		while(opcion != 0);
	}
}
