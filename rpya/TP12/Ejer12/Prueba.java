package Ejer12;
import Comun.Console;
import Comun.Menu;
public class Prueba {
	public static void main(String[] args) {
		SistemaO OBJSO = new SistemaO();
		Menu myMenu= new Menu();
		int opcion;
		myMenu.agregarItem("agregar ");
		myMenu.agregarItem("sacar token");
		myMenu.agregarItem("apagar sistema");
		do
		{
			
			opcion= myMenu.ejecutarMenu();
			switch (opcion)
			{
			case 1: {
				for(int i=0; i<5;i++){
					int U=Console.readInt("ingrese un usuario");
					int T=Console.readInt("ingrese token");
				Trabajo T1=new Trabajo(U,T);
				OBJSO.agregarJob(T1);
				}
				break;
			}
			case 2:
			{
				System.out.println("el token extraido es: " + OBJSO.obtenerSigTrab());
				break;
			}
			case 3:{
				System.out.println("apagando el sistema");
				OBJSO.limpiar();
				
				break;
			}
			case 4:{
				
			}
	}
		}while(opcion != 0);
	}
}


