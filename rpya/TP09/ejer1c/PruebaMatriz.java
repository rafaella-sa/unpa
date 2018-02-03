package ejer1c;
import comun.Console;
import comun.Menu;
public class PruebaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion del objeto matriz
		int dimf;
		int dimc;
		int elem;
		Matriz OBJMAT;
		int col;
		int opcion;
		//carga de la dimension
		dimf = Console.readInt("ingrese un numero para la dimension fila");
		dimc = Console.readInt("ingrese un numero para la dimension colum");
		while (dimc != dimf){
			System.out.println("dimension invalida ingresada, vuelva a ingresar");
			System.out.println("la dimension ingresada es:"+ dimc);
		}
		//CREACION DEL OBJETO
		OBJMAT=new Matriz (dimf,dimc);
		Menu myMenu= new Menu();
		myMenu.agregarItem("agregar elementos");
		myMenu.agregarItem("mostrar matriz");
		myMenu.agregarItem("elementos de la columna son ");
		myMenu.agregarItem("elementos de la diagonal son ");
		myMenu.agregarItem("elementos de la fila son ");
		myMenu.agregarItem("la suma de los elementos es: " );
		do
		{
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1:
			{
				for (int f=0; f< dimf; f++)
					for(int c=0; c< dimc; c++){
						elem= Console.readInt("ingrese un elemento para la matriz");
						OBJMAT.agregarElementos(elem);
					}
				break;
			}
			case 2:
			{
				System.out.println("la matriz es");
				OBJMAT.mostrarMatriz();
				break;
			}
			case 3:
			{
				col= Console.readInt("ingrese un numero de columna");
				System.out.println("los elementos de una columna son :");
				OBJMAT.elemColum(col);
				break;
			}
			case 4:
			{
				OBJMAT.elemDiagonal();
				break;
			}
			case 5:
			{
				int fila=Console.readInt("ingrese un posicion par la fila");
				OBJMAT.elemFila(fila);
				break;
			}
			case 6:
			{
				System.out.println("la suma de los elementos son :" + OBJMAT.sumaMatriz());
				
			}
			default:
			{
				break;
			}
			}
		}while(opcion != 0);
		}
	}

		
		


