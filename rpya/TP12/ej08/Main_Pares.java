package ej08;
import comun.*;
public class Main_Pares {
	public static void main(String[] args) {
		Cola c = new Cola();
		Pila p = new Pila();
		Menu m = new Menu();
		int opcion, num;
		m.agregarItem("Ingresar elemento");
		m.agregarItem("Mostrar elementos pares");
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
				case 1: {
						num = Console.readInt("Ingrese un número: ");
						p.meter(num);
						break;		
				}
				case 2: {
						c = c.insertarPares(p);
						System.out.println("Los elementos pares son: ");
						while(!c.estaVacia())
							System.out.println(c.borrar());
						break;				
				}			
			}		
		}
		while(opcion!=0);
		if(opcion == 0)
			System.out.println("La sección ha finalizado.");
	}
}