package ej12;
import comun.*;
public class Main_SO {
	public static void main(String[] args) {
		SistemaOperativo so = new SistemaOperativo();
		int opcion;
		Trabajo trabajo;
		Menu m = new Menu();
		m.agregarItem("Añadir trabajo");
		m.agregarItem("Obtener el trabajo de mayor prioridad");
		m.agregarItem("Apagar sistema para mantenimiento");
		do{
			opcion= m.ejecutarMenu();
			switch(opcion){
				case 1: { //Añadir trabajo
						int u = Console.readInt("Ingrese un usuario: ");
						int t = Console.readInt("Ingrese un token: ");
						Trabajo tra = new Trabajo(u, t);
						so.anadirTrabajo(tra);		
						break;
						}
				case 2: { //Obtener el trabajo de mayor prioridad
						trabajo = so.obtenerSiguienteTrabajo();
						System.out.println("El trabajo de mayor prioridad en el momento es: " + trabajo.getToken());
						break;
						}
				case 3: { //Apagar sistema para mantenimiento
						so.limpiarTrabajos();
						break;
						}
			}
		}
		while(opcion!= 0);
		if(opcion == 0)
			System.out.println("La sección ha finalizado.");
	}
}
