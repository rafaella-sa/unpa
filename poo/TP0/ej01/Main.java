package ej01;

import comun.*;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.agregarItem("Crear CD");
		m.agregarItem("Cargar canciones");
		m.agregarItem("Consultar canciones");
		m.agregarItem("Cantidad de canciones");
		m.agregarItem("Duración total del CD");
		String titulo = "titulo";
		String cantante = "cantante";
		double precio = 0.0;
		String compania = "compania";
		int cantidad = 0;
		int opcion;
		Cd cd = new Cd(titulo, cantante, precio, compania, cantidad);
		do{ 
			opcion = m.ejecutarMenu();
			switch (opcion){
				case 1: {
						titulo = Console.readString("Ingrese el título: ");
						cantante = Console.readString("Ingrese cantante: ");
						precio = Console.readDouble("Ingrese el precio: ");
						compania = Console.readString("Ingrese la compañía discográfica: ");
						cantidad = Console.readInt("Ingrese la cantidad de canciones: ");
						cd.setTitulo(titulo);
						cd.setCantante(cantante);
						cd.setPrecio(precio);
						cd.setCompania(compania);
						cd.setCantidad(cantidad);
						cd.crearCD(cantidad);
						break;
						}
				case 2: {
						if(cd.actual < cd.cantidad){
							String tit = Console.readString("Ingrese el titulo de la canción: ");
							double duracion = Console.readDouble("Ingrese la duración de la canción: ");
							String estilo = Console.readString("Ingrese el estilo de la canción: ");
							String autor = Console.readString("Ingrese el autor de la canción: ");
							Cancion cancion = new Cancion(tit, duracion, estilo, autor);
							cd.agregarCancion(cancion);
						}
						else{
							System.out.println("Ya se cargaron todas las músicas.");
						}
						break;
						}
				case 3: {
						int cancion = Console.readInt("Ingrese la canción: ");
						cd.consultarCancion(cancion);
						break;
						}
				case 4: {
						System.out.println("La cantidad de canciones del CD es: " + cd.getCantidad());
						break;
						}
				case 5: {
						System.out.println("La duración del CD es: " + cd.calcularDuracion());
						break;
						}
			}
		}
		while (opcion != 0);
		if (opcion == 0){
			System.out.println("La sección ha finalizado.");
		}
	}
}