package ej11;
import comun.*;
public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.agregarItem("Agregar diario");
		m.agregarItem("Agregar revista");
		m.agregarItem("Modificar publicación");
		m.agregarItem("Mostrar todas las publicaciones");
		m.agregarItem("Borrar publicación");
		m.agregarItem("Borrar todas las publicaciones");		
		Menu sm = new Menu();
		sm.agregarItem("Titulo");
		sm.agregarItem("Director de publicación");
		sm.agregarItem("Codigo");
		sm.agregarItem("Editor responsable");
		sm.agregarItem("Cantidad de páginas");
		sm.agregarItem("Precio");
		sm.agregarItem("Año de publicación");
		sm.agregarItem("Mes de publicación");
		sm.agregarItem("REVISTA: Titulo de la nota de tapa");
		sm.agregarItem("REVISTA: Numero de la nota de tapa");
		sm.agregarItem("DIARIO: Recargo por envíos al interior");
		sm.agregarItem("DIARIO: Semana de publicación");
		int opcion1, opcion2;
		Empresa e = new Empresa();
		do{
			opcion1 = m.ejecutarMenu();
			switch(opcion1){
				case 1: {
						String titulo = Console.readString("Ingrese el título: ");
						String persona = Console.readString("Ingrese el responsable de dirección de publicación: ");
						int codigo = Console.readInt("Ingrese el código: ");
						String editor = Console.readString("Ingrese el editor responsable: ");
						int cantpag = Console.readInt("Ingrese la cantidad de páginas: ");
						double precio = Console.readDouble("Ingrese el precio: ");
						int ano = Console.readInt("Ingrese el año de publicación: ");
						int mes = Console.readInt("Ingrese el mes de publicación: ");
						double recargo = Console.readDouble("Ingrese el recargo por envío al interior: ");
						int semana = Console.readInt("Ingrese la semana de publicación: ");
						char tipo = Console.readChar("Ingrese el tipo de diario: quincenal(q) o semanal(s)");
						if(tipo == 'q'){
							Quincenales quin = new Quincenales(titulo, persona, codigo, editor, cantpag, precio, ano, mes, recargo, semana);
							e.agregarPublicacion(quin);
						}
						else{
							Semanales sem = new Semanales(titulo, persona, codigo, editor, cantpag, precio, ano, mes, recargo, semana);
							e.agregarPublicacion(sem);
						}
						break;
						}
				case 2: {
						String titulo = Console.readString("Ingrese el título: ");
						String persona = Console.readString("Ingrese el responsable de dirección de publicación: ");
						int codigo = Console.readInt("Ingrese el código: ");
						String editor = Console.readString("Ingrese el editor responsable: ");
						int cantpag = Console.readInt("Ingrese la cantidad de páginas: ");
						double precio = Console.readDouble("Ingrese el precio: ");
						int ano = Console.readInt("Ingrese el año de publicación: ");
						int mes = Console.readInt("Ingrese el mes de publicación: ");
						String tapa = Console.readString("Ingrese el titulo de la nota de tapa: ");
						int numero = Console.readInt("Ingres el número de la nota de tapa: ");
						Revista r = new Revista(titulo, persona, codigo, editor, cantpag, precio, ano, mes, tapa, numero);
						e.agregarPublicacion(r);
						break;
						}
				case 3: {
						System.out.println("Seleccione una de las publicaciones de la lista para modificar: ");
						e.mostrarPubli();
						int cod = Console.readInt("Ingrese el codigo de la publicación: ");
						int i = e.buscarPubli(cod);
								if(e.elementos[i] instanceof Revista)
									System.out.println("Esta es una REVISTA. Las opciones son: ");
								else
									System.out.println("Este es un DIARIO. Las opciones son: ");
								do{
									opcion2 = sm.ejecutarMenu();
									switch(opcion2){
											case 1: {
													String titulo = Console.readString("Ingrese el nuevo título: ");
													e.cambiarTitulo(i, titulo);
													break;
													}
											case 2: {
													String persona = Console.readString("Ingrese el responsable de dirección de publicación: ");
													e.cambiarPersona(i, persona);
													break;
													}
											case 3: {
													int codigo = Console.readInt("Ingrese el código: ");
													e.cambiarCodigo(i, codigo);
													break;
													}
											case 4: {												
													String editor = Console.readString("Ingrese el editor responsable: ");
													e.cambiarEditor(i, editor);
													break;
													}
											case 5: {													
													int cantpag = Console.readInt("Ingrese la cantidad de paginas: ");
													e.cambiarCantpag(i, cantpag);
													break;
													}
											case 6: {
													double precio = Console.readDouble("Ingrese el precio: ");
													e.cambiarPrecio(i, precio);
													break;
													}
											case 7: {
													int ano = Console.readInt("Ingrese el año de publicación: ");
													e.cambiarAno(i, ano);
													break;
													}
											case 8: {
													int mes = Console.readInt("Ingrese el mes de publicación: ");
													e.cambiarMes(i, mes);
													break;
													}
											case 9: {												
													if(e.elementos[i] instanceof Revista){														
														String tapa = Console.readString("Ingrese el titulo de la nota de tapa: ");
														e.cambiarTapa(i, tapa);
													}
													else
														System.out.println("La publicación seleccionada NO es una revista.");
													break;
													}
											case 10:{
													if(e.elementos[i] instanceof Revista){
														int numero = Console.readInt("Ingrese el número de la nota de tapa: ");
														e.cambiarNumero(i, numero);
													}
													else
														System.out.println("La publicación seleccionada NO es una revista.");
													break;
													}
											case 11:{
													if(e.elementos[i] instanceof Revista)
														System.out.println("La publicación seleccionada NO es un diario.");
													else{
														double recargo = Console.readDouble("Ingrese el recargo: ");
														e.cambiarRecargo(i, recargo);
													}
													break;													
													}	
											case 12:{
													if(e.elementos[i] instanceof Revista)
														System.out.println("La publicación seleccionada NO es un diario.");
													else{
														int semana = Console.readInt("Ingrese la semana: ");
														e.cambiarSemana(i, semana);
													}
													break;													
													}
											}									
								}
								while(opcion2!=0);
								if(opcion2==0)
									System.out.println("Volviendo al menú principal...");					
					break;		
				}
				case 4: {
						e.mostrarPubli();
						break;
						}
				case 5: {
						int cod = Console.readInt("Ingrese el codigo de la publicación: ");
						e.eliminarPublicacion(cod);
						break;
						}
				case 6: {
						char ok = Console.readChar("Está seguro de borrar todas las publicaciones? (S/N)");
						if(ok == 's')
							e.borrarPubli();
						else
							System.out.println("Acción cancelada.");
						break;
						}
			}
		}
		while(opcion1!=0);
		if(opcion1==0)
			System.out.println("La sección fue finalizada.");
	}


	}


