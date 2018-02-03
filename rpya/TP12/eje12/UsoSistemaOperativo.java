package ej12;
import parcialrecursividad.Console;
import parcialrecursividad.Menu;

public class UsoSistemaOperativo {
	
public static void main(String[] args) {
	

	
	SistemaOperativo s= new SistemaOperativo();
int opcion=0;
Trabajo trabajo;
Menu m= new Menu();
 m.agregarItem("Agregar");
 m.agregarItem("El trabajo con mayor prioridad");
  m.agregarItem("mantenimiento");

do
{
	opcion= m.ejecutarMenu();
	switch(opcion)
			{
	case 1://agregar
	{
		int u=Console.readInt("Ingresar un usuario");
		int t=Console.readInt("Ingresar un token");
		Trabajo p1= new Trabajo(u,t);
		s.agregarTrabajo(p1);		
	    break;
	}
	case 2: //trabajo con mayor prioridad
	{	
	   trabajo=s.obtenerSiguienteTrabajo();
	   System.out.println("mayor prioridad" + trabajo.getToken());
		break;
	}
	case 3: // mantenimiento
	{
		s.limpiarTrabajo();
		break;
	}
	
	default:
		break;
	}
	}while(opcion!= 0);
}



}

