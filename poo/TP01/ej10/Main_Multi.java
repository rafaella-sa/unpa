package ej10;
import comun.*;
public class Main_Multi{
	public static void main(String[] args) {
		Menu m = new Menu();
		Menu sm = new Menu();
		Multimedia mul = new Multimedia();
		int opcion1, opcion2;
		m.agregarItem("Agregar programa de radio");
		m.agregarItem("Agregar programa de televisi�n");
		m.agregarItem("Modificar programa");
		m.agregarItem("Mostrar programas");
		m.agregarItem("Eliminar programa");
		m.agregarItem("Borrar todos los programas");
		sm.agregarItem("Titulo");
		sm.agregarItem("Responsable de direcci�n de publicaci�n");
		sm.agregarItem("Codigo");
		sm.agregarItem("Duraci�n (minutos)");
		sm.agregarItem("Hora de inicio");
		sm.agregarItem("Emisora");
		sm.agregarItem("Comerciales (cantidad de minutos) - RADIO");
		sm.agregarItem("Responsable de musicalizaci�n - RADIO");
		sm.agregarItem("Comerciales (cantidad) - TELEVISION");
		sm.agregarItem("Tandas (cantidad) - TELEVISION");		
		do{
			opcion1 = m.ejecutarMenu();
			switch(opcion1){
				case 1: {
						String titulo = Console.readString("Ingrese el t�tulo: ");
						String respdir = Console.readString("Ingrese el responsable de direcci�n de publicaci�n: ");
						int codigo = Console.readInt("Ingrese el c�digo: ");
						int duracion = Console.readInt("Ingrese la duraci�n (en minutos): ");
						double horainicio = Console.readDouble("Ingrese la hora de inicio: ");
						String emisora = Console.readString("Ingrese la emisora: ");
						int minutosCom = Console.readInt("Ingrese la cantidad de minutos de comerciales: ");
						String respmusic = Console.readString("Ingrese el responsable de musicalizaci�n: ");
						Radio r = new Radio(titulo, respdir, codigo, duracion, horainicio, emisora, minutosCom, respmusic);
						mul.agregarPrograma(r);
						break;
						}
				case 2: {
						String titulo = Console.readString("Ingrese el t�tulo: ");
						String respdir = Console.readString("Ingrese el responsable de direcci�n de publicaci�n: ");
						int codigo = Console.readInt("Ingrese el c�digo: ");
						int duracion = Console.readInt("Ingrese la duraci�n (en minutos): ");
						double horainicio = Console.readDouble("Ingrese la hora de inicio: ");
						String emisora = Console.readString("Ingrese la emisora: ");
						int cantCom = Console.readInt("Ingrese la cantidad de comerciales: ");
						int cantTan = Console.readInt("Ingrese la cantidad de tandas: ");
						Television t = new Television(titulo, respdir, codigo, duracion, horainicio, emisora, cantCom, cantTan);
						mul.agregarPrograma(t);
						break;
						}
				case 3: {
						System.out.println("Seleccione uno de los programas de la lista para modificar: ");
						mul.mostrarProgramas();
						int cod = Console.readInt("Ingrese el codigo del programa: ");
						int i = mul.buscarPrograma(cod);
								if(mul.elementos[i] instanceof Radio)
									System.out.println("Este es un programa de RADIO. Las opciones son: ");
								else
									System.out.println("Este es un programa de TELEVISION. Las opciones son: ");
								do{
									opcion2 = sm.ejecutarMenu();
									switch(opcion2){
											case 1: {
													String titulo = Console.readString("Ingrese el nuevo t�tulo: ");
													mul.cambiarTitulo(i, titulo);
													break;
													}
											case 2: {
													String respdir = Console.readString("Ingrese el responsable de direcci�n de publicaci�n: ");
													mul.cambiarDireccion(i, respdir);
													break;
													}
											case 3: {
													int codigo = Console.readInt("Ingrese el c�digo: ");
													mul.cambiarCodigo(i, codigo);
													break;
													}
											case 4: {												
													int duracion = Console.readInt("Ingrese la duraci�n (en minutos): ");
													mul.cambiarDuracion(i, duracion);
													break;
													}
											case 5: {													
													double horainicio = Console.readDouble("Ingrese la hora de inicio: ");
													mul.cambiarHoraInicio(i, horainicio);
													break;
													}
											case 6: {
													String emisora = Console.readString("Ingrese la emisora: ");
													mul.cambiarEmisora(i, emisora);
													break;
													}
											case 7: {
													if(mul.elementos[i] instanceof Radio){														
														int minutosCom = Console.readInt("Ingrese la cantidad de minutos de comerciales: ");
														mul.cambiarMinutosCom(i, minutosCom);													
													}
													else
														System.out.println("El programa seleccionado NO es de radio.");
													break;
													}
											case 8: {												
													if(mul.elementos[i] instanceof Radio){														
														String respmusic = Console.readString("Ingrese el responsable de musicalizaci�n: ");
														mul.cambiarRespMusic(i, respmusic);
													}
													else
														System.out.println("El programa seleccionado NO es de radio.");
													break;
													}
											case 9: {
													if(mul.elementos[i] instanceof Television){
														int cantCom = Console.readInt("Ingrese la cantidad de comerciales: ");
														mul.cambiarCantCom(i, cantCom);
													}
													else
														System.out.println("El programa seleccionado NO es de televisi�n.");
													break;
													}
											case 10:{
													if(mul.elementos[i] instanceof Television){
														int cantTan = Console.readInt("Ingrese la cantidad de tandas: ");
														mul.cambiarCantTan(i, cantTan);
													}
													else
														System.out.println("El programa seleccionado NO es de televisi�n.");
													break;													
													}																																				
											}									
								}
								while(opcion2!=0);
								if(opcion2==0)
									System.out.println("Volviendo al men� principal...");					
					break;		
				}
				case 4: {
						mul.mostrarProgramas();
						break;
						}
				case 5: {
						int cod = Console.readInt("Ingrese el codigo del programa: ");
						mul.eliminarPrograma(cod);
						break;
						}
				case 6: {
						char ok = Console.readChar("Est� seguro de borrar todos los programas?");
						if(ok == 's')
							mul.borrarMulti();
						else
							System.out.println("Acci�n cancelada.");
						break;
						}
			}
		}
		while(opcion1!=0);
		if(opcion1==0)
			System.out.println("La secci�n fue finalizada.");
	}
}
