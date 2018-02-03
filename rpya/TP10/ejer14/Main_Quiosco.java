package ej14;

import comun.Console;
import comun.Menu;

public class Main_Quiosco {
	public static void main(String[] args) {
		Quiosco Q;
		Q = new Quiosco();
		Articulo A;
		int opcion = 0;
		Menu menu;
		menu = new Menu();
		menu.agregarItem("Abrir el quiosco");
	    menu.agregarItem("Ver el estado del quiosco");
		menu.agregarItem("Comprar productos");
		menu.agregarItem("Vender productos");
		menu.agregarItem("Mostrar stock disponible");
		opcion = menu.ejecutarMenu();

		while(opcion!=0)
        {
        switch (opcion)
             {
        case 1: //abrir quiosco
        		{ 
        			Q.abrirQuiosco();
        			System.out.println("El quiosco est� abierto.");
        		}
 	   	   		 break;
             
        case 2: //ver el estado del kiosco
        		{ 	
        			if(Q.getEstadoQuiosco()) 	{
        				System.out.println("El quiosco est� abierto."); 
			         	}
        			else  {
        				System.out.println("El quiosco est� CERRADO."); 
			         			}
        			break;
               }
        case 3: //Comprar producto
        		{
        			if(Q.getEstadoQuiosco())
			         		{
        				System.out.println ("Ingrese el precio del art�culo: ");
        				double pre=Console.readDouble();
        				System.out.println ("Ingrese el codigo del art�culo: ");
        				int cod=Console.readInt();
        				System.out.println ("Ingrese el stock del art�culo: ");
        				int sto =Console.readInt();
        				System.out.println("Ingrese la descripci�n del art�culo: ");
        				String des=Console.readString();
        				A = new Articulo(pre, cod, sto, des);
        				Q.comprarArticulo(A, sto);
			         		}
        			else 	{
        				System.out.println("El quiosco est� cerrado, no se pueden cargar los art�culos.");
			          		}
        		break;
        		}
        case 4: //Vender producto
        		{
        			 if (Q.getEstadoQuiosco())
			         {
			         System.out.println("Ingrese el c�digo del art�culo a vender: ");
			         int cod=Console.readInt();
			         System.out.println("Ingrese la cantidad a vender: ");
			         int cant=Console.readInt();
			         Q.venderArticulo(cod, cant);			         
		            } 
			      else
		             {
		    	     System.out.println("El quiosco est� cerrado, no se pueden realizar ventas.");
		             }
        		break;
        }
        case 5: //Mostrar los productos del kiosco
        		{
        		System.out.println ("El quiosco posee: ");
	         	Q.mostrarArticulos();
	         	break;
        		}
                 	       
        }
        opcion=menu.ejecutarMenu();
   }
   System.out.println("");
       
   if(opcion==0){
	  Q.cerrarQuiosco();
   	  System.out.println("El quiosco est� cerrado.");
   }
	}

}
