package ejer08;
import comun.Console;
import comun.Menu;

public class PruebaConjunto {

	public static void main(String[] args) 
	{
		int dim=4;
		Conjunto conjuntoA;
		Conjunto  conjuntoB;
		int elem = 0;
		Menu M= new Menu();
		M.agregarItem("agregar elementos");
		M.agregarItem(" vaciar ");
		M.agregarItem("devolver elemento");
		M.agregarItem("mostrar");
		M.agregarItem("interseccion");
		M.agregarItem("diferencia");
		M.agregarItem("union");
		conjuntoA =new Conjunto(dim);
		conjuntoB =new Conjunto(dim);
	int opc=0;
		do
		{
			opc=M.ejecutarMenu();
		switch (opc){
			case 1: {
				elem=Console.readInt("ingrese elementos al conjunto A");
				conjuntoA.agregarElementos(elem);
				elem=Console.readInt("ingrese elementos al conjunto B");
				conjuntoB.agregarElementos(elem);
				break;
			}
			case 2:{
				conjuntoA.vaciarVector();
				break;
			}
			case 3:{
				int pos=Console.readInt("ingrese una posicion para buscar el elemento");
				System.out.println("el elemento del conjunto A es: " + conjuntoA.devolverElem(pos));
				break;
			}
			case 4:
			{
				System.out.println("el conjunto es: ");
				conjuntoA.mostrar();
				break;
			}
			case 5:{
				System.out.println("la interseccion entre conjunto es: ");
				conjuntoA.interseccion(conjuntoB);
				break;
			}
			case 6:
			{
				System.out.println("la diferencia entre los conjuntos es: ");
				conjuntoA.diferencia(conjuntoB);
				break;
			}
			case 7:
			{
				System.out.println("la union entre conjuntos es: ");

				break;
			}
			default: {
				break;
			}

}
		}while (opc != 0);
			
		

	}
}

