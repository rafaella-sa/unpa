package ej02;
import comun.*;
public class Main {
	public static void main(String[] args) {
	Menu m = new Menu();
	m.agregarItem("Agregar comida al menu");
	m.agregarItem("Agregar bebida al menu");
	m.agregarItem("Mostrar opciones de comida y bebida");
	m.agregarItem("Seleccionar comida");
	m.agregarItem("Seleccionar bebida");
	m.agregarItem("Crear Sugerencia");
	m.agregarItem("Seleccionar Sugerencia de la casa");
	m.agregarItem("Generar factura");
	Menu_DonPipo menu = new Menu_DonPipo();
	Opcion consumo = new Opcion();
	Sugerencia sug = new Sugerencia();
	int opcion;
	do{
		opcion = m.ejecutarMenu();
		switch(opcion){
			case 1: {
					String nombre = Console.readString("Ingrese el nombre de la comida: ");
					double precio = Console.readDouble("Ingrese el precio de la comida: ");
					int codigo = Console.readInt("Ingrese el codigo de la comida: ");
					char tipo = Console.readChar("Ingrese el tipo de la comida: ");
					Comida comida = new Comida(nombre, precio, codigo, tipo);
					menu.agregarComida(comida);
					System.out.println("Agregado al menu: " + comida.getNombre());
					break;
					}
			case 2: {
					String nombre = Console.readString("Ingrese el nombre de la bebida: ");
					double precio = Console.readDouble("Ingrese el precio de la bebida: ");
					int codigo = Console.readInt("Ingrese el codigo de la bebida: ");
					Bebida bebida = new Bebida(nombre, precio, codigo);
					menu.agregarBebida(bebida);
					System.out.println("Agregado al menu: " + bebida.getNombre());
					break;
					}
			case 3: {
					menu.mostrarComidas();
					menu.mostrarBebidas();
					break;
					}
			case 4: {
					menu.mostrarComidas();
					int codigo = Console.readInt("Ingrese el codigo seleccionado: ");
					consumo.agregarPlato(menu.buscarComida(codigo));
					break;
					}
			case 5: {
					menu.mostrarBebidas();
					int codigo = Console.readInt("Ingrese el codigo seleccionado: ");
					consumo.agregarBebida(menu.buscarBebida(codigo));
					break;
					}
			case 6: {
					int codigo = Console.readInt("Ingrese el código de la entrada: ");
					Comida plato1 = menu.buscarComida(codigo);
					while(plato1.getTipo() != 'e'){
						codigo = Console.readInt("ERROR. Reingrese el código de la entrada: ");
						plato1 = menu.buscarComida(codigo);
					}
					sug.agregarPlato(plato1);
					codigo = Console.readInt("Ingrese el código del segundo plato: ");
					Comida plato2 = menu.buscarComida(codigo);
					while(plato2.getTipo() == 'e' || plato2.getTipo() == 'o' || plato2.getTipo() == 'g'){
						codigo = Console.readInt("ERROR. Reingrese el código del segundo plato: ");
						plato2 = menu.buscarComida(codigo);
					}
					sug.agregarPlato(plato2);
					codigo = Console.readInt("Ingrese el código del postre: ");
					Comida plato3 = menu.buscarComida(codigo);
					while(plato3.getTipo() != 'o'){
						codigo = Console.readInt("ERROR. Reingrese el código del postre: ");
						plato3 = menu.buscarComida(codigo);
					}
					sug.agregarPlato(plato3);
					System.out.println("La Sugerencia de la Casa es: ");
					sug.mostrar();
					break;
			}
			case 7: {
					System.out.println("La Sugerencia de la Casa es: ");
					sug.mostrar();
					System.out.println("El precio es: " + sug.calcularPrecio());
					break;
					}
			case 8: {
					System.out.println("El consumo total es: ");
					consumo.mostrar();
					System.out.println("El precio total es: " + consumo.calcularPrecio());
					break;
			}
		}
	}
while(opcion!=0);
}
}
