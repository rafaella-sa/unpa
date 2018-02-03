package Ejer25;
import comun.*;

public class SistemaOperativo {

	public static void main(String [] arg)
	   {	
		int op=0;int u=0;String t;
		
		Sistema sis;
		sis=new Sistema(); 
		
		do
		  {
			
			System.out.println("1: CARGAR TRABAJO");
		    System.out.println("2: EJECUTAR TRABAJO");
			System.out.println("3: VER COLAS DE TRABAJO");
			System.out.println("4: A DESCANSAR");
		    System.out.println("9: BYE BYE");

			op=Console.readInt("INGRESAR OPCION:");
		    	   	   switch (op)
		    	   	         { 
		    	   	    case 1: {
		    	   	              u=Console.readInt("CARGAR USUARIO");                                             
	                              t=Console.readString("INGRESAR EL NOMBRE DEL TRABAJO");
	                              //nuevo=new String(t); 
	                              sis.cargarTrabajo(u,t);
	                              break; 
		    	   	            }
		    	   	     case 2: {
		    	   	              sis.ejecutar();                                   	   	           	                            	    	   	           	              	    	   	           	            	    	   	           	                
		    	   	              break;
		    	   	             }     
		    	   	     case 3: {	      	           	               	    	   	           	               	 
		    	   	              sis.MostrarTodo();    
		    	   	              break;
		    	   	              }	
		    	   	     case 4: {
		    	   	               sis.MeVoy();
		    	   	               break;
		    	   	             }	
		    	   	                                    	    	   	           	    		    	   	           	     	    	   	           	       
		    	   	         }
		    	   	
		   }
	     
		  while (op <5);
	   }
	   

}
