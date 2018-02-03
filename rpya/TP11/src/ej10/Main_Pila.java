package ej10;
import comun.*;
public class Main_Pila {
	public static void main(String[] args) {
		Pila p = new Pila();
		Pila aux = new Pila();
		Menu m = new Menu();
		m.agregarItem("Ingresar elemento en la pila");
		m.agregarItem("Asignar a X el 2do. elemento de la parte superior modificando la pila");
		m.agregarItem("Asginar a X el 2do. elemento de la parte superior");
		m.agregarItem("Asignar a X el elemento N-ésimo modificando la pila");
		m.agregarItem("Asignar a X el N-ésimo elemento");
		m.agregarItem("Asignar a X el elemento fondo de la pila");
		m.agregarItem("Asignar a X el elemento fondo de la pila sin modificarla");
		m.agregarItem("Mostrar los elementos de la pila");
		int dim, i, n, num, opcion;
		int x = 0;
		do{
			opcion = m.ejecutarMenu();
			switch(opcion){
				case 1: {
						num = Console.readInt("Ingrese un número en la pila: ");
						p.meter(num);
						break;
						}
				case 2: {//a)
						for (i = 0; i < 2; i++){
							x = p.sacar();
						}
						System.out.println("El valor de X es " + x);
						break;
						}
				case 3: {//b)
						aux.meter(p.sacar());
						x = p.sacar();
						System.out.println("El valor de X es " + x);
						while(!aux.estaVacia())
							p.meter(aux.sacar());
						break;
						}
				case 4: {//c)
						n = Console.readInt("Ingrese el valor de N: ");
						while(n <= 0 || n > p.getCima()){
							n = Console.readInt("ERROR. Reingrese el valor de N: ");
						}
						i = 0;
						while (i < n){
							x = p.sacar();
							i++;
						}
						System.out.println("El valor de X es " + x);
						break;
						}
				case 5: {//d)
						n = Console.readInt("Ingrese el valor de N: ");
						while(n <= 0 || n > p.getCima())
							n = Console.readInt("ERROR. Reingrese el valor de N: ");					
						i = 0;
						while (i < n){
							if (i == n-1)
								x = p.sacar();
							else
								aux.meter(p.sacar());
							i++;
						}
						System.out.println("El valor de X es " + x);
						while (!aux.estaVacia())
							p.meter(aux.sacar());
						break;
						}
				case 6: {//e)				
						while (!p.estaVacia())
							x = p.sacar();						
						System.out.println("El valor de X es " + x);
						break;
						}
				case 7: {//f)
						dim = p.getCima();
						for (i = dim; i > 0; i--){
							aux.meter(p.sacar());
						}
						x = p.sacar();
						System.out.println("El valor de X es " + x);
						while(!aux.estaVacia()){
							p.meter(aux.sacar());
						}
						break;
						}
				case 8: {
						System.out.println("Los elementos de la pila son: ");
						for (i = 0; i <= p.getCima(); i++){
							System.out.println(p.getElemento(i));
						}
				}
			}
		}
		while(opcion != 0);
		if(opcion == 0)
			System.out.println("La sección ha finalizado.");
	}
}


