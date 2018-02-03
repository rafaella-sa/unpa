package ej07;
import comun.*;
public class Main_Cadena {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.agregarItem("Visualizarla en forma inversa");
		menu.agregarItem("Verificar si es pal�ndromo");
		int opcion;
		String palabra;	
		Cadena contrario = new Cadena();
		palabra = Console.readString("Ingrese una palabra: ");						
		do{
			opcion = menu.ejecutarMenu();
			switch(opcion){
				case 1: {
						for(int i = 0; i < palabra.length(); i++)
							contrario.meter(palabra.charAt(i)); 
						System.out.println(contrario.invertirPalabra());
						break;
						}
				case 2: {
						for(int i = 0; i < palabra.length(); i++)
							contrario.meter(palabra.charAt(i));
						if(contrario.esPalindromo())
							System.out.println("La palabra ingresada es un pal�ndromo.");
						else
							System.out.println("La palabra NO es un pal�ndromo.");
						break;
						}		
			}
		}
		while(opcion!=0);
		}
	}


