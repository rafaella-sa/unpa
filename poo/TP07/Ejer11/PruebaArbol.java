package  Ejer11;
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
			System.out.println("	3. Altura del arbol");
			System.out.println("	4. Cantidad de elementos");
			System.out.println("	5. Mostrar Hojas");
			System.out.println("	6. Mostrar Elementos de un nivel");
			System.out.println("	7. Mostrar Descendientes");
			System.out.println("	8. Mostrar Ascendientes");
			System.out.println("	9. Buscar y mostrar el padre");
			System.out.println("	10.Buscar y mostrar los hermanos");
			System.out.println("    11.Mostrar INORDEN");
			System.out.println("    12.Mostrar PREORDEN");
			System.out.println("    13.Mostrar POSTORDEN");
			System.out.println("    14.Mostrar NODO");
			System.out.println("15. cantidad de hojas");
			System.out.println("	 0.SALIR");
	
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
			    	    System.out.println("La altura de arbol es"+a.alturaDelArbol(a.getRaiz()));
			    	    break;
			    	   }
			    case 4:{
			    	    System.out.println("En el arbo hay: "+a.cantidadDeElem(a.getRaiz()));
			    	    break;
			    		}
			    case 5:{
			    		System.out.println("Las hojas del arbol son:");
			    	    a.mostrarHojas(a.getRaiz());
			    		break;
			    	   }
			    case 6:{
			    	    int nivel=Console.readInt("Ingrese el nivle que desea ver");
			    	    a.mostrarPorNivel(a.getRaiz(), nivel);
			    	    break;
			    	   }
			    
			    case 7:{
			    	   int elem=Console.readInt("Ingrese el elementos quye desea ver los descendientes ");
			    	   if(!a.estaVacio())
			    	   	  {
			    		   System.out.println("Los descendientes de: "+elem+"son: ");
			    		   Nodo aux=a.buscarNodo(elem);
			    		   a.descendientesElemento(aux);
			    	   	  }
			    	   else
			    		   System.out.println("No hay elementos cargados!!!");
			    	   break;
			    	   }
			    case 8:{
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
			    case 9:{
			    		int elem=Console.readInt("ingrese un elemento");
			    	    
			    		a.padreElemento(a.getRaiz(), elem);
			    		break;
			    	   }
			    case 10:{
			    	    int elem=Console.readInt("ingrese el elemento");
			    	    a.hermanosElemento(a.getRaiz(), elem);
			    	    break;
			    		}
			    case 11:{
			    	    System.out.println("Los elementos del arbol son: ");
			    	    a.inorden(a.getRaiz());
			    	    break;
			    	   }
			    case 12:{
			    		System.out.println("Los elementos del arbol son:");
			    	    a.preorden(a.getRaiz());
			    	    break;
			    	   }
			    case 13:{
			    		System.out.println("Los elementos del arbol son:");
			    		a.postorden(a.getRaiz());
			    		break;
			    		}
			    case 14:{
			    	    int elem=Console.readInt("ingrese el valor que desea ver");
			    	    if(a.buscarNodo(elem)!=null)
			    		System.out.println("ELEM: "+ a.buscarNodo(elem).getInfo());
			    	    else
			    	    	System.out.println("el elemento no se encuentra!!!");
			    		break;
			    		}
			    case 15: {
			    	System.out.println("La cantidad de hojas es: " + a.cantHojas(a.getRaiz()));
			    	break;
			    }
			    }
		  }
		while(opcion!=0);
	}

}
