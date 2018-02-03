package ej11;
import comun.*;
public class Main_Bicola {
	public static void main(String[] args) {
		//declaración y creación de variables
		Bicola bc = new Bicola();
		BicolaRestrictaInsertar bcri = new BicolaRestrictaInsertar();
		BicolaRestrictaBorrar bcrb = new BicolaRestrictaBorrar();
		Menu m = new Menu();
		m.agregarItem("Bicola");
		m.agregarItem("Bicola - Restricción(Insertar)");
		m.agregarItem("Bicola - Restricción(Sacar)");
		Menu sub1 = new Menu();
		sub1.agregarItem("Insertar elementos por izquierda");
		sub1.agregarItem("Eliminar elementos por izquierda");
		sub1.agregarItem("Insertar elementos por derecha");
		sub1.agregarItem("Eliminar elementos por derecha");
		sub1.agregarItem("Mostrar elementos");
		Menu sub2 = new Menu();
		sub2.agregarItem("Insertar elementos");
		sub2.agregarItem("Eliminar elementos por izquierda");
		sub2.agregarItem("Eliminar elementos por derecha");
		sub2.agregarItem("Mostrar elementos");
		Menu sub3 = new Menu();
		sub3.agregarItem("Insertar elementos por izquierda");
		sub3.agregarItem("Insertar elementos por derecha");
		sub3.agregarItem("Eliminar elementos");
		sub3.agregarItem("Mostrar elementos");
		int opcion1, opcion2;
		char elem;
		do{
			opcion1 = m.ejecutarMenu();
			switch(opcion1){	
				case 1: {						
						do{
							opcion2 = sub1.ejecutarMenu();
							switch(opcion2){
								case 1: {
										elem = Console.readChar("Ingrese un elemento: ");
										bc.insertarIzquierda(elem);
										break;
										}
								case 2: {
										elem = bc.eliminarIzquierda();
										System.out.println("El elemento sacado es: " + elem);
										break;
										}
								case 3: {
										elem = Console.readChar("Ingrese un elemento: ");
										bc.insertarDerecha(elem);
										break;
										}
								case 4: {
										elem = bc.eliminarDerecha();
										System.out.println("El elemento sacado es: " + elem);
										break;
										}
								case 5: {
										System.out.println("Los elementos de la bicola son: ");
										bc.mostrarElementos();
										break;
										}
								default:
										break;
							}
						}
						while(opcion2!=0);
						if(opcion2 == 0)
							System.out.println("Retornando al menu principal...");
						break;
						}
				case 2: {						
						do{
							opcion2 = sub2.ejecutarMenu();
							switch(opcion2){
								case 1: {
										elem = Console.readChar("Ingrese un elemento: ");
										bcri.insertar(elem);
										break;
										}
								case 2: {
										elem = bcri.borrarIzquierda();
										System.out.println("El elemento sacado es: " + elem);
										break;
										}
								case 3: {
										elem = bcri.borrarDerecha();
										System.out.println("El elemento sacado es: " + elem);
										break;
										}
								case 4: {
										System.out.println("Los elementos de la bicola son: ");
										bcri.mostrarElementos();
										break;
										}
								default:
										break;
							}
						}
						while(opcion2!=0);
						if(opcion2 == 0)
							System.out.println("Retornando al menu principal...");
						break;
						}
				case 3: {
						do{
							opcion2 = sub3.ejecutarMenu();
							switch(opcion2){
								case 1: {
										elem = Console.readChar("Ingrese un elemento: ");
										bcrb.insertarIzquierda(elem);
										break;
										}
								case 2: {
										elem = Console.readChar("Ingrese un elemento: ");
										bcrb.insertarDerecha(elem);
										break;
										}
								case 3: {
										elem = bcrb.borrar();
										System.out.println("El elemento sacado es: " + elem);
										break;										
										}
								case 4: {
										System.out.println("Los elementos de la bicola son: ");
										bcrb.mostrarElementos2();
										break;
										}
							}
						}
						while(opcion2!=0);
						if(opcion2 == 0)
							System.out.println("Retornando al menu principal...");
						break;
						}
			}
		}
		while(opcion1!=0);
		if(opcion1 == 0)
			System.out.println("La sección ha finalizado.");
	}
}


