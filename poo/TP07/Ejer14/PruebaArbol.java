package  Ejer14;
import Comun.*;

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
			System.out.println("	4. Cantidad De Elementos");
			System.out.println("	5. Altura del Arbol");
			System.out.println("	6. Elementos de un nivel");
			System.out.println("	7. Antecesores");
			System.out.println("    8. Mostrar INORDEN");
			System.out.println("    9. Mostrar PREORDEN");
			System.out.println("    10. Mostrar POSTORDEN");
			System.out.println("    0. SALIR!!! ");
	
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
			    	    int elem=Console.readInt("ingrese el elemento que desea buscar");
			    	    if(a.busqueda(a.getRaiz(),elem,false))
			    	    System.out.println("ELEMENTO ENCONTRADO");
			    	    else
				    	    System.out.println("ELEMENTO NO ENCONTRADO");
			    		break;
			    	   }
			    case 4:{
			    		//System.out.println("En el arbo hay: "+a.cantidadDeElem(a.getRaiz(),0));
			    		break;
		    			}
			    case 5:{
		    	    	System.out.println("La altura de arbol es"+a.alturaDelArbol(a.getRaiz()));
		    	    	break;
		    	   	   }
			    case 6:{
		    	    	int nivel=Console.readInt("Ingrese el nivle que desea ver");
		    	    	a.mostrarPorNivel(a.getRaiz(), nivel);
		    	    	break;
		    	   	   }
			    case 7:{
			    	    int elem=Console.readInt("ingrese el elemento ");
			    	    if(!a.estaVacio())
			    	   	  {
			    		   System.out.println("Los antecesores de: "+elem+" son:");
			    		   a.antecesores(a.getRaiz(), elem);
			    	   	  }
			    	    else
			    		   System.out.println("No hay elementos cargados");
			    		   break;
			    	   	}
			    case 8:{
			    	    System.out.println("Los elementos del arbol son: ");
			    	    a.inorden(a.getRaiz());
			    	    break;
			    	   }
			    case 9:{
			    		System.out.println("Los elementos del arbol son:");
			    	    a.preorden(a.getRaiz());
			    	    break;
			    	   }
			    case 10:{
			    		System.out.println("Los elementos del arbol son:");
			    		a.postorden(a.getRaiz());
			    		break;
			    }		  
			 }
		  }
	while(opcion!=0);
   }
}
