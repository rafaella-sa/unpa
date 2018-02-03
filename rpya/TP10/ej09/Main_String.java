package ej09;
import comun.*;
public class Main_String {
	public static void main(String[] args) {
		//declaración y creación de variables
		Menu menu;
		menu = new Menu();
		int cont, opcion, i;
		String palabra, cadena;
		char carbuscado, carviejo, carnuevo, letra;
		boolean encontrado = false;
		menu.agregarItem("Buscar un caracter");
		menu.agregarItem("Reemplazar un caracter por otro");
		menu.agregarItem("Devolver el primer caracter");
		menu.agregarItem("Contar la cantidad de ocurrencias de un determinado caracter");
		menu.agregarItem("Convertir de minúscula a mayúscula");
		menu.agregarItem("Realizar la comparación con otra cadena ingresada");		
		//carga de datos
		cadena = Console.readString("Ingrese una palabra: ");
		//funciones
		do{
			opcion = menu.ejecutarMenu();
			switch (opcion){
				case 1: {
						carbuscado = Console.readChar("Ingrese el caracter a ser buscado: ");			
						i = 0;
						while(i < cadena.length() && encontrado == false){		
							if(cadena.charAt(i) == carbuscado){
								System.out.println("El caracter " + carbuscado + " se encuentra en la posición " + (cadena.charAt(i)+1));
								encontrado = true;
								}
								i++;	
							}
						if(encontrado == false)
							System.out.println("El caracter " + carbuscado + " NO pertenece a la palabra.");
						break;
						}
				case 2: {
						carviejo = Console.readChar("Ingrese el caracter que será reemplazado: ");
						carnuevo = Console.readChar("Ingrese el caracter de reemplazo: ");
						cadena.replace(carviejo, carnuevo);
						break;
						}
				case 3: {
						System.out.println("El primer caracter de la palabra es: " + cadena.charAt(0));
						break;
						}
				case 4: {
						letra = Console.readChar("Ingrese el caracter que se debe contar: ");
						cont = 0;
						for (i = 0; i < cadena.length(); i++){
							if(cadena.charAt(i) == letra)
								cont++;
							}
						System.out.println("La cantidad de caracteres " + letra + " en la palabra es " + cont);
						break;				
						}
				case 5: {
						cadena.toUpperCase();
						System.out.println("La palabra en mayúsculas es: " + cadena);
						break;
						}
				case 6: {
						palabra = Console.readString("Ingrese la palabra de comparación: ");
						if(cadena.equals(palabra))
							System.out.println("Las palabras son iguales.");
						else
							System.out.println("Las palabras NO son iguales.");
						break;
						}
			}
		}
		while(opcion!=0);		
	}
}