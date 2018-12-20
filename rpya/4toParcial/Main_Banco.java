package parcial;
import comun.*;
public class Main_Banco {
	public static void main(String[] args) {
		Banco b = new Banco();
		Menu m = new Menu();
		m.agregarItem("Ingresar clientes en las colas de las cajas");
		m.agregarItem("Atención al cliente");
		m.agregarItem("Verificar caja disponible");
		m.agregarItem("Mostrar atención de la caja");
		Cliente cliente;
		int i, opcion;
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
				case 1: { //ingresar clientes en las colas
						for(i = 0; i < 3; i++){
							System.out.println("PRIMERA CAJA");
							String n = Console.readString("Ingrese el nombre del cliente: ");
							int r = Console.readInt("Ingrese la cantidad de retiros: ");
							int d = Console.readInt("Ingrese la cantidad de depositos: ");
							int c = Console.readInt("Ingrese la cantidad de consultas: ");
							int p = Console.readInt("Ingrese la cantidad de pagos: ");
							cliente = new Cliente(n, r, d, c, p);
							b.ingresarCliente(cliente, 1);
							}
						for(i = 0; i < 3; i++){
							System.out.println("SEGUNDA CAJA");
							String n = Console.readString("Ingrese el nombre del cliente: ");
							int r = Console.readInt("Ingrese la cantidad de retiros: ");
							int d = Console.readInt("Ingrese la cantidad de depositos: ");
							int c = Console.readInt("Ingrese la cantidad de consultas: ");
							int p = Console.readInt("Ingrese la cantidad de pagos: ");
							cliente = new Cliente(n, r, d, c, p);
							b.ingresarCliente(cliente, 2);
							}
						break;
						}
				case 2: { //atención al cliente
						int caja = Console.readInt("Ingrese la caja (1/2): ");
						if(caja == 1)
							b.atenderCliente(1);
						else
							b.atenderCliente(2);					
						break;
						}
				case 3: { //verificar caja disponible
						if(b.cajaDisponible() == 1)
							System.out.println("La primer caja a quedar disponible es la caja UNO.");
						else
							System.out.println("La primer caja a quedar disponible es la caja DOS.");
						break;
						}
				case 4: { //mostrar atención de la caja
						b.mostrarAtencion();
						break;
						}
			}
		}
		while(opcion != 0);
		if (opcion == 0)
			System.out.println("La sección ha finalizado.");
	}
}
