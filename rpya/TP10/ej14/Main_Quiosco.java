package ej14;
import comun.*;
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
		while(opcion!=0){
        switch (opcion){
        case 1: { 
        			Q.abrirQuiosco();
        			System.out.println("El quiosco está abierto.");
        		}
 	   	   		 break;           
        case 2: { 	
        			if(Q.getEstadoQuiosco()) 	{
        				System.out.println("El quiosco está abierto."); 
			         	}
        			else  {
        				System.out.println("El quiosco está CERRADO."); 
			         			}
        			break;
               }
        case 3: {
        			if(Q.getEstadoQuiosco())
			         		{
        				System.out.println ("Ingrese el precio del artículo: ");
        				double pre=Console.readDouble();
        				System.out.println ("Ingrese el codigo del artículo: ");
        				int cod=Console.readInt();
        				System.out.println ("Ingrese el stock del artículo: ");
        				int sto =Console.readInt();
        				System.out.println("Ingrese la descripción del artículo: ");
        				String des=Console.readString();
        				A = new Articulo(pre, cod, sto, des);
        				Q.comprarArticulo(A, sto);
			         		}
        			else 	{
        				System.out.println("El quiosco está cerrado, no se pueden cargar los artículos.");
			          		}
        		break;
        		}
        case 4: {
        			 if (Q.getEstadoQuiosco()){
        					 System.out.println("Ingrese el código del artículo a vender: ");
        					 int cod=Console.readInt();
        					 System.out.println("Ingrese la cantidad a vender: ");
        					 int cant=Console.readInt();
        					 Q.venderArticulo(cod, cant);			         
        			 }
			      else{
		    	     System.out.println("El quiosco está cerrado, no se pueden realizar ventas.");
		             }	 
        		break;
        }
        case 5: {
	         	Q.mostrarArticulos();
	         	Q.controlDeStock();
	         	break;
        		}                	       
        }
        opcion=menu.ejecutarMenu();
   }
   System.out.println("");       
   if(opcion==0){
	  Q.cerrarQuiosco();
   	  System.out.println("El quiosco está cerrado.");
   		}
	}
}


