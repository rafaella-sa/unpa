package  PruebaEjer3Char;
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
			System.out.println("	3. Buscar iterativo");
			System.out.println("	4. Buscar recursivo");
			System.out.println("    5. Mostrar INORDEN");
			System.out.println("    6. Mostrar PREORDEN");
			System.out.println("    7. Mostrar POSTORDEN");
			System.out.println("");
	
			opcion=Console.readInt("INGRESE UN OPCIÓN");
			
			switch(opcion)
			    {
			    case 1:{
			    	    char elem=Console.readChar("Ingrese un valor");
			    	    a.insertar(elem);
			    	    break;
			    	   }
			    case 2:{
			    	   char aux=Console.readChar("Ingrese el valor que desea eliminar");
			    	   a.eliminar(aux);
			    	   break;
			    	   }
			    case 3:{
			    	   char valor=Console.readChar("ingrese el valor a buscar");
			    	   if(a.buscar(valor))
			    		   System.out.println("ELEMENTO ENCONTRADO");
			    	   else
			    		   System.out.println("ELEMENTO NO ENCONTRADO");
			     	   break;
			           }
			    case 4:{
			    		char valor=Console.readChar("ingrese el valor a buscar");
			    		boolean enc=false;
			    		if(a.busqueda(a.getRaiz(), valor, enc))
			    		   System.out.println("ELEMENTO ENCONTRADO");
			    		else
			    		   System.out.println("ELEMENTO NO ENCONTRADO");
			     	    break;
			    	   }
			    case 5:{
			    	    System.out.println("Los elementos del arbol son: ");
			    	    a.inorden(a.getRaiz());
			    	    break;
			    	   }
			    case 6:{
			    		System.out.println("Los elementos del arbol son:");
			    	    a.preorden(a.getRaiz());
			    	    break;
			    	   }
			    case 7:{
			    		System.out.println("Los elementos del arbol son:");
			    		a.postorden(a.getRaiz());
			    		break;
			    }
			   
			    }
		  }
		while(opcion!=0);
	}

}
