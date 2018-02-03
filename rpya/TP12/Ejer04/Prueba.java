package Ejer04;
import Comun.Console;
import Comun.Menu;
class Prueba {

	public static void main(String[] args) {
		Movible OBJCOLA=new Movible();
		Menu myMenu=new Menu();
		int opcion;
		myMenu.agregarItem("agregar elem");
		myMenu.agregarItem("cantidad de elementos");
		
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
					int elem=Console.readInt("ingrese un elemnto a la cola");
					OBJCOLA.agregarElem(elem);
				break;
			}
			case 2:
			{
				System.out.println("la cantidad de elementos en la cola es:" + OBJCOLA.cantElem());
				
				break;
				}
			
	}
		}while(opcion != 0);
		
	}
}