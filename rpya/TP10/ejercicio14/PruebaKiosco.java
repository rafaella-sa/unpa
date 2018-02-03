package ejercicio14;

import comun.Console;
import comun.Menu;

public class PruebaKiosco {

	
	public static void main(String[] args) {
		
		Kiosco obj;
		System.out.println("Ingrese el nombre del kiosco!!!!");
		String nombre=Console.readString();
		obj=new Kiosco (nombre);
		Menu menu;
	       int  opcion=0;
	       int pos=0;
	       int elem=0;
	       menu=new Menu();
	       menu.agregarItems("Abrir un producto");
	       menu.agregarItems("Conocer el estado del quiosco");
		   menu.agregarItems("Comprar productos");
		   menu.agregarItems("Vender productos");
		   menu.agregarItems("Mostrar stock disponible");
	       
	       
	       opcion=menu.ejecutarMenu();

	       while(opcion!=0)
	            {
	            switch (opcion)
	                 {
	            case 1: //agregar un producto
	            		{ 
	            		if(obj.abrirKiosco()){
	            			System.out.println("El kiosco esta abrierto");
	            		}
         	   	   		 break;
	            		}
	            case 2: //conocer el estado del kiosco
	            		{ 	
	            			if(obj.estadoKiosco()) 	{
	            				System.out.println("El quiosco esta abierto"); 
	   			         	}
	            			else  {
	            				System.out.println("El quiosco esta CERRADO"); 
	   			         			}
	            			break;
	                   }
	            case 3: //Comprar producto
	            		{
	            			if(obj.estadoKiosco()==true)
	   			         		{
	            				System.out.println("Ingrese el nombre del producto");
	            				String des=Console.readString();
	            				System.out.println ("Ingrese precio del producto");
	            				double pre=Console.readDouble();
	            				System.out.println ("Ingrese la cantidad del producto");
	            				int can=Console.readInt();
	            				System.out.println ("Ingrese el codigo del producto");
	            				int cod=Console.readInt();
	            				Articulo producto;
	            				producto=new Articulo(des, pre, cod, can);
	            				obj.comprarArticulo(producto, can);
	   			         		}
	            			else 	{
	            				System.out.println("El quiosco esta cerrado, no se puede cargar los productos");
	   			          		}
	            		break;
	            		}
	            case 4: //Vender producto
	            		{
	            			 if (obj.estadoKiosco()==true)
	    			         {
	    			         System.out.println("Ingrese el codigo del producto que va a vender: ");
	    			         int cod=Console.readInt();
	    			         System.out.println("Ingrese la cantidad a vender");
	    			         int cantidad=Console.readInt();
	    			         obj.venderProductos(cod, cantidad);			         
	    		            } 
	    			      else
	    		             {
	    		    	     System.out.println("El quiosco esta cerrado, no se puede cargar los productos");
	    		             }
	            		break;
	            }
	            case 5: //Mostrar los productos del kiosco
	            		{
	            		System.out.println ("En el quiosco hay: ");
			         	obj.mostrarProducto();
			         	break;
	            		}
	                     	       
	            }//switch
	            opcion=menu.ejecutarMenu();
	       }//while
	       System.out.println("");
	           
	       if(opcion==0)
		      System.out.println("Ha finalizado la secion!!");
	       	  System.out.println("El quiosco se ha cerrado!!");
          }     

}


