package ej09;
import comun.*;
public class Main_Estacionamiento {
	public static void main(String[] args) {
		Estacionamiento est;
		est = new Estacionamiento();
		Menu menu;
		menu = new Menu();
		menu.agregarItem("Ingresar auto");
		menu.agregarItem("Sacar auto");
		menu.agregarItem("Mostrar autos");
		int opcion, pat;
		
		do{
			opcion=menu.ejecutarMenu();	
			switch(opcion){
				case 1: {
						pat = Console.readInt("Ingrese la patente del auto: ");
						Auto auto = new Auto();
						auto.setPatente(pat);
						if(est.meter(auto)){
							System.out.println("Hay lugar para el auto.");
							System.out.println("El auto de patente " + auto.getPatente() + " ha ingresado.");
						}
						else
							System.out.println("No hay lugar para el auto.");
						break;
						}
				case 2: {
						pat = Console.readInt("Ingrese la patente del auto: ");
						est.sacar(pat);
						System.out.println("El auto ha salido.");
						System.out.println("Fueron necesarios " + est.getCont() + " movimientos para retirar el auto.");
						break;
						}
				case 3: {
						est.mostrarAutos();
						break;
						}
			}
		}
		while(opcion!=0);
		if(opcion == 0)
			System.out.println("La sesión ha finalizado.");
	}
}
