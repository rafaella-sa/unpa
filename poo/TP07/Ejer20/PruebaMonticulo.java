package Monticulo;
import comun.*;

public class PruebaMonticulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monticulo m=new Monticulo();
		int opcion;
		
		
		
		do
		  {
			System.out.println("********//MENÚ MONTICULO//******");
			System.out.println("  		1.Ingresar Elementos");
			System.out.println("  		2.Eliminarar Elementos");
			System.out.println("  		3.Cantidad de  Elementos");
			System.out.println("  		4.Elemento de una Posición");
			System.out.println("  		5.Mostrar INORDEN");
			System.out.println("  		6.Mostrar PREORDEN");
			System.out.println("  		7.Mostrar POSTORDEN");
			System.out.println("  		8.Mostrar");
			System.out.println("  		0.SALIR");
			opcion=Console.readInt ("INGRESE UNA OPCIÓN");
			
			switch(opcion)
		    {
		    case 1:{
		    	    int elem=Console.readInt("Ingrese un valor");
		    	    m.insertar(elem);
		    	    break;
		    	   }
		    case 2:{
		    	   int aux;
		    	   aux=m.eliminar(1);
		    	   System.out.println("elem: "+aux);
		    	   break;
		    	   }
		    case 3:{
		    	   System.out.println("El monticulo tiene: "+m.getCantidad());
		     	   break;
		    	   }
		    case 4:{
		           int pos=Console.readInt("ingrese la posicion del elemento"); 	
		           if(m.getElem(pos)!=-1423)
		        	   System.out.println("Elem:"+m.getElem(pos));
		    	   else
		        	   System.out.println("Posicion incorrecta");
		           break;
		    	   }
		    case 5:{
	    	    	System.out.println("Los elementos del arbol son: ");
	    	    	m.inorden(1);
	    	    	break;
	    	   	   }
		    case 6:{	
	    			System.out.println("Los elementos del arbol son:");
	    			m.preorden(1);
	    			break;
	    	   		}
		    case 7:{
	    			System.out.println("Los elementos del arbol son:");
	    			m.postorden(1);
	    			break;
	    			}
		      }
			
		  }
		while(opcion!=0);
	}
}
