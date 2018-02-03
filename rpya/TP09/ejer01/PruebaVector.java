package ejer01;
import comun.Console;
import comun.Menu;
public class PruebaVector {

	public static void main(String[] args) {
		//creacion del objeto vector
		int dim1;
		//int dim2;
		int elem;
		int elem2;
		int opcion;
		//carga de la dimension
		dim1= Console.readInt("ingrese un numero para la dimension");
		//dim2= Console.readInt("ingrese un numero para la dimension");
		Vector VECTOR1=new Vector(dim1);
		//Vector VECTOR2= new Vector(dim2);
		Menu myMenu= new Menu();
		myMenu.agregarItem("agregar elementos");
		myMenu.agregarItem("comparar promedio");
		myMenu.agregarItem("obtener mayor");
		myMenu.agregarItem("obtener menor");
		do
		{
			opcion=myMenu.ejecutarMenu();
			switch(opcion)
			{
			case 1:{
				for (int ind=0; ind<dim1; ind++){
					elem= Console.readInt("ingrese un elemento para el vector");
					VECTOR1.agregarElemento(elem);
				}
			/*	for (int ind2=0; ind2< dim2; ind2++){
					elem2=Console.readInt("ingrese un elemento al vector2");
					VECTOR2.agregarElemento(elem2);
			}*/
				break;
			}

			case 2:
			{
				System.out.println("" + VECTOR1.SumaElem());
				//VECTOR1.compararProm(VECTOR2);
				break;
			}
			case 3:
			{
				System.out.println("el elemento mayor es: "+ VECTOR1.getobtenerMayor());
				break;
			}
			case 4:
			{
				System.out.println("el elemento menor es: " +VECTOR1.getobtenerMenor());
				break;
			}
		}
		}while (opcion != 0);
	}
	}
