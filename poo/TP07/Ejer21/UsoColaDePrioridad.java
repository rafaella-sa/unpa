package Ejer21;
import comun.*;

public class UsoColaDePrioridad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaDePrioridad cp=new ColaDePrioridad();
		Monticulo m=cp.getMonticulo();
		int opcion;
		
		
		do
		  {
			System.out.println("******MENU LISTA DE ENTEROS******");
			System.out.println("	1. Insertar datos");
			System.out.println("	2. Eliminar datos");
			System.out.println("	3. Mostrar Inorden");
			System.out.println("	4. Mostrar Preorden");
			System.out.println("	5. Mostrar Postorden");
			System.out.println("	6. Limpiar");
			System.out.println("	0. SALIR");
			
			

			opcion=Console.readInt("INGRESE UN OPCIÓN");
			
			switch(opcion)
			    {
			    case 1:{
			    	    int elem=Console.readInt("Ingrese un valor");
			    	    cp.insertar(elem);
			    	    break;
			    	   }
			    case 2:{
			    	   int aux;
			    	   aux=cp.suprimir();
			    	   System.out.println("elem: "+aux);
			    	   break;
			    	   }
			    
			    case 3:{
		    	    	System.out.println("Los elementos del arbol son: ");
		    	    	m.inorden(1);
		    	    	break;
		    	   	   }
			    case 4:{	
		    			System.out.println("Los elementos del arbol son:");
		    			m.preorden(1);
		    			break;
		    	   		}
			    case 5:{
		    			System.out.println("Los elementos del arbol son:");
		    			m.postorden(1);
		    			break;
		    			}
			    case 6:{
			    	    cp.limpiarColaPrioridad();
			    	    break;
			    		}
			    
			    }
		  }
		while(opcion!=0);
			
		
	}

}
