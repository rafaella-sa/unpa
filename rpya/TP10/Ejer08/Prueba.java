package Ejer08;
import comun.Console;
import comun.Menu;
public class Prueba {

	public static void main(String[] args) {
		int dim=Console.readInt("ingrese un numero para la dimensio");
		ParImpar OBJVEC=new ParImpar(dim);
		Menu myMenu;
		myMenu=new Menu();
		int opcion;
		myMenu.agregarItem("agregar elementos");
		myMenu.agregarItem("mostrar elementos");
		myMenu.agregarItem("");
		
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
				int elem=Console.readInt("ingrese un elemento al vector");
				OBJVEC.agregarElem(elem);
				break;
			}
			case 2:
			{
				System.out.println("elemento del vector");
				OBJVEC.mostrar();
				
				break;
			}
			case 3:{
				
				break;
			}
	}
		}while(opcion != 0);
	}
}