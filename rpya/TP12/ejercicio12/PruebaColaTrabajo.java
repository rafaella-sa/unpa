package ejercicio12;

public class PruebaColaTrabajo {
	public static void main(String[] args) {
		SO sistema=new SO();
		ColaTrabajo tra=new ColaTrabajo();
		Trabajo t=new Trabajo(0, 0);
		int opc=0;
		int ent = 0;
		do{
			System.out.println("Opciones de trabajos");
			System.out.println("--------------------");
			System.out.println("1. Ingrese de trabajo ");
			System.out.println("2. Mostrar el mantenimiento del sistema");
			System.out.println("4.Salir");
			opc=Console.readInt("Eligi una opcion --> ");
		
			switch (opc) {
			
			case 1:{
				ent=Console.readInt("Ingrese su trabajo:");
				t.setToke(ent);				
				//tra.insertar(t);
				sistema.agregarTrabajo(t);
				break;
			}
			case 2:{
				sistema.obtenerSiguienteTrabajo();
				sistema.limpiarTrabajo();
				break;
			}
			
			
			}
		}
		while(opc != 3);
		}
	}

