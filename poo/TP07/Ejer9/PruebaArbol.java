package  Ejer9;
import comun.*;

public class PruebaArbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arbol a= new Arbol ();
		int opcion;
		
		
		do
		  {
			System.out.println("******MENU LISTA DE ENTEROS******");
			System.out.println("	1. Ingresar datos");
			System.out.println("	2. Eliminar datos");
			System.out.println("	3. Buscar datos");
			System.out.println("    4  Mostrar INORDEN");
			System.out.println("    5. Mostrar PREORDEN");
			System.out.println("    6. Mostrar POSTORDEN");
			
			System.out.println("");
	
			opcion=Console.readInt("INGRESE UN OPCIÓN");
			
			switch(opcion)
			    {
			    case 1:{
			    	    int elem=Console.readInt("Ingrese un valor");
			    	    a.insertar(elem);
			    	    break;
			    	   }
			    case 2:{
			    	   int aux=Console.readInt("Ingrese el valor que desea eliminar");
			    	   a.eliminar(aux);
			    	   break;
			    	   }
			    case 3:{
			    		int aux=Console.readInt("Ingrese el valor que desea buscar");
			    		boolean enc=false;			    		
			    		if(a.busqueda(a.getRaiz(), aux, enc))
			    			System.out.println("ELEMENTO ENCONTRADO");
			    		else
			    			System.out.println("ELEMENTO NO ENCONTRADO");
			    		break;
			    	   }
			    case 4:{
			    	    System.out.println("Los elementos del arbol son: ");
			    	    a.inorden(a.getRaiz());
			    	    break;
			    	   }
			    case 5:{
			    		System.out.println("Los elementos del arbol son:");
			    	    a.preorden(a.getRaiz());
			    	    break;
			    	   }
			    case 6:{
			    		System.out.println("Los elementos del arbol son:");
			    		a.postorden(a.getRaiz());
			    		break;
			    }
			   
			    }
		  }
		while(opcion!=0);
	}

}
