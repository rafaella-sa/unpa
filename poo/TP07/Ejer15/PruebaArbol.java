package  Ejer15;
import comun.*;

public class PruebaArbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arbol a= new Arbol ();
		Arbol b=new Arbol();
		int opcion;
		int cant=Console.readInt("Ingrese la cantidad de elementos del primer arbol");
		a.cargarEnFormaRandom(cant);
		
		int cantid=Console.readInt("Ingrese la cantidad de elementos del primer arbol");
		b.cargarEnFormaRandom(cantid);
		
		do
		  {
			System.out.println("******MENU LISTA DE ENTEROS******");
			System.out.println("    1. Mostrar 	UNION");
			System.out.println("    2. Mostrar INTERSECCIÓN");
			System.out.println("    3. Mostrar DIFERENCIA");
			
			
			System.out.println("	0.SALIR");
	
			opcion=Console.readInt("INGRESE UN OPCIÓN");
			
			switch(opcion)
			    {
			    case 1:{
			    	   int elem=Console.readInt("Ingrese un elemento");
			    	   a.insertar(elem);
			    	   } 
			    case 6:{
			    	    a.mostrarUniion(b, a.getRaiz());
			    	    break;
			    	   }
			   
			    }
		  }
		while(opcion!=0);
	}

}
