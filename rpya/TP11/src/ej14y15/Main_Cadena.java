package ej14y15;
import comun.*;
public class Main_Cadena {
	public static void main(String[] args) {
		Menu m = new Menu();
		Pila cadena = new Pila();
		m.agregarItem("Verificar si la cadena tiene la forma X & Y");
		m.agregarItem("Verificar si la cadena tiene la forma A # B, donde A y B son de la forma X & Y");
		int opcion;
		String cad;
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
				case 1: { //14)
						cad = Console.readString("Ingrese la cadena: ");
						for (int i = 0; i < cad.length(); i++){
							cadena.meter(cad.charAt(i));
						}
						if(cadena.esDeLaForma())
							System.out.println("La cadena tiene la forma X & Y.");
						else
							System.out.println("La cadena NO tiene la forma X & Y.");	
						break;
						}
				case 2: { //15)
						cad = Console.readString("Ingrese la cadena: ");
						for (int i = 0; i < cad.length(); i++){
							cadena.meter(cad.charAt(i));
						}
						if(cadena.esDeLaNuevaForma())
							System.out.println("La cadena tiene la forma A # B.");
						else
							System.out.println("La cadena NO tiene la forma A # B.");	
						break;
						}
			}
		}
		while(opcion!=0);
		if(opcion==0)
			System.out.println("La sección ha terminado.");			
	}
}

