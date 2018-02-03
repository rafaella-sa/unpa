package ej10;

import parcialrecursividad.Console;
import parcialrecursividad.Menu;

public class UsoVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		int dim=100;
		Vector v= new Vector(dim);
		Menu m= new Menu();
		m.agregarItem("Agregar elementos");
		m.agregarItem("posicion par asendente");
		m.agregarItem("posicion impar desendente");
		m.agregarItem("¿Se encontro el dato?");
		m.agregarItem("ver los elementos");
		do
		{
			opcion= m.ejecutarMenu();
			switch(opcion)
					{
			case 1://agregar elementos
			{
				System.out.println("agregar elementos");
				int elem= Console.readInt();
			    v.agregarElem(elem);
			    break;
			}
			case 2: //posicion par asendente 
			{
				v.posParAsendentente();
				break;
			}
			case 3: // posicion impar desendente
			{
				v.posImparDentente();
				break;
			}
			case 4://dato 
			{
				System.out.println("ingresar un dato para la posion par");
				int dato= Console.readInt();
				System.out.println("ingresar un dato para la posion impar");
				int dato2= Console.readInt();
				v.buscarDatoPos(dato, dato2);
				break;
			}
			case 5:
			{
				v.mostrarVector();
				break;
			}
			default:
				break;
			}
			}while(opcion!= 0);
		}
		


	}


