package ej01;
import comun.Menu;
public class Main_Cola {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.agregarItem("a)");
		m.agregarItem("b)");
		int opcion;
		do{
			opcion = m.ejecutarMenu();
			switch (opcion){
				case 1: {//a)
						Cola c = new Cola();
						int x = 0;
						int y = 1;
						c.insertar(x);
						c.insertar(y);
						y = c.borrar();
						int z = y + 5;
						while(!c.estaVacia()){
							z = c.borrar();
							System.out.println(z);
						}
						break;
						}
				case 2: {//b)
						Pila p = new Pila();
						Cola c = new Cola();
						int x = 0;
						int y = 1;
						int z = x + y;
						while(z < 10){
							if((z % 2) == 0)
								p.meter(z);
							else
								c.insertar(z);
							x = y;
							y = z;
							z = x + y;
						}
						System.out.println("La pila contiene: ");
						while(!p.estaVacia()){
							z = p.sacar();
							System.out.println(z);
						}
						System.out.println("La cola contiene: ");
						while(!c.estaVacia()){
							z = c.borrar();
							System.out.println(z);
						}
						break;		
						}
			}
		}
		while(opcion!=0);
	}
}
