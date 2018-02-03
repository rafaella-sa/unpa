package ejer14;

import comun.Console;
import comun.Menu;
public class PruebaKiosco {
	public static void main(String[] args) {
		int opcion;
		String nom= Console.readString("ingrese un nombre para el kiosco");
		Kiosco OBJK= new Kiosco(nom);		
		Articulo articulo;
		Menu myMenu= new Menu();
		myMenu.agregarItem("comprar articulos para el kiosco");
		myMenu.agregarItem("vender articulos");
		myMenu.agregarItem("control de Stock");
		myMenu.agregarItem("mostrar articulos");
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
				articulo= new Articulo();
				String nombrea=Console.readString("ingrese el nombre del articulo");
				int cod=Console.readInt("ingrese un codigo para el articulo");
				String descr=Console.readString("ingrese la descripcion");
				double Prec=Console.readDouble("ingrese el precio");
				int cant=Console.readInt("ingrese la cantidad de articulos");
				articulo.setNombre(nombrea);
				articulo.setCodigo(cod);
				articulo.setDescripcion(descr);
				articulo.setPrecio(Prec);
				OBJK.comprar(articulo, cant);
				break;
			}
			case 2://vender
				{
					int cant=Console.readInt("ingrese la cantidad que desea vender");
					int cod=Console.readInt("ingrese el codigo del articulo");
					OBJK.vender(cod, cant);
					break;
				}
			case 3://
			{
				System.out.println("el stock de los productos es:");
				OBJK.controlStock();
				break;
			}
			case 4: //
			{
				OBJK.mostrarArticulos();
				break;
			}
			default:{
				break;
			}
			}
	}while(opcion != 0);
		
	}
}