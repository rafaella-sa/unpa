package Ejer10;
import Comun.Menu;
import Comun.Console;
public class Prueba {
	public static void main(String[] args) {
		Estacionamiento OBJCOLA=new Estacionamiento();
		Menu myMenu=new Menu();
		Auto auto = null;
		int opcion;
		myMenu.agregarItem("entrar un auto");
		myMenu.agregarItem("sacar auto");
		myMenu.agregarItem("espacio");
		
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
				String patente=Console.readString("ingrese una patente para el auto");
				auto = new Auto(patente);
				System.out.println("hay espacio en el estacionamiento:" + OBJCOLA.espacio());
				OBJCOLA.agregarAuto(auto);
				break;
			}
			case 2:
			{
				String pat=Console.readString("ingrese la patente a buscar");				
				Auto a=new Auto(pat);
					/*if(a.getPatente().equals(auto.getPatente())){
						System.out.println("el auto existe");
						
						System.out.println("hay lugar en el estacionamiento" + OBJCOLA.espacio());
						//System.out.println("la cantidad de movimientos fue:" + auto.getCant());
					}
					else
						System.out.println("el auto no existe");*/
				System.out.println("el auto extraido fue " + OBJCOLA.sacar(a)+ a.getPatente());

				break;
			}
			case 3:{
				System.out.println("espacio " + OBJCOLA.espacio());
				break;
			}
	}
		}while(opcion != 0);
	}
}