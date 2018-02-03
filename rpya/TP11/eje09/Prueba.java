package ej09;
import Comun.Console;
import Comun.Menu;
public class Prueba {
	public static void main(String[] args) {
		Estacionamiento OBJPILA=new Estacionamiento();
		Menu myMenu=new Menu();
		int opcion;
		myMenu.agregarItem("entrar un auto");
		myMenu.agregarItem("sacar auto");
		
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
				String patente=Console.readString("ingrese una patente para el auto");
				Auto auto = new Auto(patente);
				OBJPILA.entrar(auto);
				break;
			}
			case 2:
			{
				String patente=Console.readString("ingrese la patente a buscar");
				Auto auto2=new Auto(patente);
				System.out.println("el auto extraido del estacionamiento es:" + auto2.getPatente());
				System.out.println("la cantidad de movimientos fue:" + auto2.getcant());
				OBJPILA.sacarAuto(auto2);
				break;
				}
			
	}
		}while(opcion != 0);
		
	}
}


