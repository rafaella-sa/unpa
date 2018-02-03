package ej08;
import comun.*;
public class Main_Pizarra {
	public static void main(String[] args) {
		Menu m = new Menu();
		Menu sm = new Menu();
		Pizarra p = new Pizarra();
		int opcion1, opcion2;
		m.agregarItem("Agregar una figura");
		m.agregarItem("Eliminar una figura");
		m.agregarItem("Borrar la pizarra");
		m.agregarItem("Calcular la superficie de las figuras");
		m.agregarItem("Calcular el perímetro de las figuras");
		m.agregarItem("Cambiar el color de fondo de una figura");
		m.agregarItem("Cambiar el color de borde de una figura");
		m.agregarItem("Cambiar el color de fondo de la pizarra");
		m.agregarItem("Mostrar elementos de la pizarra");
		m.agregarItem("Dibujar pizarra");
		sm.agregarItem("Circulo");
		sm.agregarItem("Rectángulo");
		sm.agregarItem("Linea");
		String color = Console.readString("Ingrese el color de la pizarra: ");
		p.setColor(color);
		do{
			System.out.println("PIZARRA");			
			opcion1 = m.ejecutarMenu();
			switch(opcion1){
				case 1: {
						do{
						System.out.println("Ingresar figura");
						opcion2 = sm.ejecutarMenu();
						switch(opcion2){
							case 1: {
									double radio = Console.readDouble("Ingrese el radio: ");
									int x = Console.readInt("Ingrese el valor de X del centro: ");
									int y = Console.readInt("Ingrese el valor de Y del centro: ");
									Punto centro = new Punto(x, y);
									String cb = Console.readString("Ingrese el color de borde: ");
									String cf = Console.readString("Ingrese el color de fondo: ");
									Circulo c = new Circulo(centro, radio, cb, cf);
									p.agregarFigura(c);
									System.out.println("Figura ingresada con éxito.");
									break;																		
									}
							case 2: {
									System.out.println("Punto superior izquierdo");
									int xsi = Console.readInt("Ingrese el valor de X: ");
									int ysi = Console.readInt("Ingrese el valor de Y: ");
									Punto psi = new Punto(xsi, ysi);
									System.out.println("Punto superior derecho");
									int xsd = Console.readInt("Ingrese el valor de X: ");
									int ysd = Console.readInt("Ingrese el valor de Y: ");
									Punto psd = new Punto(xsd, ysd);
									System.out.println("Punto inferior izquierdo");
									int xii = Console.readInt("Ingrese el valor de X: ");
									int yii = Console.readInt("Ingrese el valor de Y: ");
									Punto pii = new Punto(xii, yii);
									System.out.println("Punto inferior izquierdo");
									int xid = Console.readInt("Ingrese el valor de X: ");
									int yid = Console.readInt("Ingrese el valor de Y: ");
									Punto pid = new Punto(xid, yid);
									String cb = Console.readString("Ingrese el color de borde: ");
									String cf = Console.readString("Ingrese el color de fondo: ");
									Rectangulo r = new Rectangulo(psi, psd, pii, pid, cb, cf);
									p.agregarFigura(r);
									System.out.println("Figura ingresada con éxito.");
									break;
									}
							case 3: {
									double largo = Console.readDouble("Ingrese el largo: ");
									String cb = Console.readString("Ingrese el color de borde: ");
									String cf = Console.readString("Ingrese el color de fondo: ");
									Linea l = new Linea(largo, cb, cf);
									p.agregarFigura(l);
									break;
									}
							}				
						}
						while(opcion2!=0);
						if (opcion2 == 0)
							System.out.println("Volviendo al menu principal...");
						break;
						}
					case 2: {
							int pos = Console.readInt("Ingrese la posición de la figura que se eliminará da pizarra: ");
							p.eliminarFigura(pos - 1);
							break;
							}
					case 3: {
							p.borrarPizarra();
							break;
							}
					case 4: { 
							double sup = p.superficiePizarra();
							System.out.println("La superficie de la pizarra es: " + sup);
							break;
							}
					case 5: {
							p.perimetroPizarra();
							break;
							}
					case 6: {
							int pos = Console.readInt("Ingrese la posición de la figura: ");
							String cf = Console.readString("Ingrese el nuevo color de fondo: ");
							p.cambiarColorFondo(pos - 1, cf);							
							break;
							}
					case 7: {
							int pos = Console.readInt("Ingrese la posición de la figura: ");
							String cb = Console.readString("Ingrese el nuevo color de borde: ");
							p.cambiarColorBorde(pos - 1, cb);
							break;
							}
					case 8: {
							String col = Console.readString("Ingrese el nuevo color de fondo: ");
							p.setColor(col);
							break;
							}
					case 9: {
							p.mostrarPizarra();
							break;
							}
					case 10:{
							p.dibujarPizarra();
							break;
							}
			}
		}
		while(opcion1!=0);
		if(opcion1 == 0){
			System.out.println("Sección finalizada con suceso.");
	}
}
}