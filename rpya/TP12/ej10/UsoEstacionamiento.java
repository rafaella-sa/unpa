package ej10;

import parcialrecursividad.Console;

public class UsoEstacionamiento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Estacionamiento e = new Estacionamiento();
				String patente, pat;
				Auto a;
				char opcion;
				opcion = 'e';
				while (opcion == 'e' || opcion == 's' || opcion== 'm') {
					System.out.println("ingrese la letra e para la entrada o la letra s para la salida o m para mostrar");
					opcion = Console.readChar();
					    if (opcion == 'e') {
						System.out.println("ingrese una patente");
						patente = Console.readString();
						Auto auto= new Auto(patente);
						e.llegaAuto(auto);
					  }
					    else 
					    	if(opcion == 's') {
						System.out.println("ingrese una patente");
						pat = Console.readString();
						a=e.saleAuto(pat);
						System.out.println("La cantidad de veces que fue movido es:"
						     + a.getMovimiento());
					    }
					    	 else 
							    	if(opcion == 'm') 
							    	{
							    		e.mostrarEsta();
							    	}
				}
			}
		

	}


