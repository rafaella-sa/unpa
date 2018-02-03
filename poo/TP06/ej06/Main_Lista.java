package ej06;
import comun.*;
public class Main_Lista {
	public static void main(String[] args) {
	Menu m = new Menu();
	m.agregarItem("Insertar elemento");
	m.agregarItem("Eliminar elemento");
	m.agregarItem("Mostrar lista");
	m.agregarItem("a) Buscar elemento");
	m.agregarItem("b) Cantidad de elementos");
	m.agregarItem("c) Sumatoria");
	m.agregarItem("d) Mayor elemento");
	m.agregarItem("   Menor elemento");
	m.agregarItem("e) Inverso (Pila)");		
	m.agregarItem("f) Inverso (Recursividad)");
	m.agregarItem("g) Invertir la lista");
	m.agregarItem("h) Copia de la lista");
	int opcion, num;
	Lista lista = new Lista();
	do{
		opcion = m.ejecutarMenu();
		switch(opcion){
		case 1: {
			num = Console.readInt("Ingrese el elemento: ");
			lista.insertar(num);
			break;
		}
		case 2: {
			num = Console.readInt("Ingrese el elemento: ");
			lista.suprimir(num);
			break;
		}
		case 3: {
			lista.mostrarLista();
			break;
		}
		case 4: { //a)
			num = Console.readInt("Ingrese el elemento: ");
			if(lista.buscar(num))
				System.out.println("Elemento encontrado.");
			else
				System.out.println("Elemento NO encontrado.");
			break;
		}
		case 5: { //b)
			System.out.println("La cantidad de elementos en la lista es de: " + lista.cantidad());
			break;
		}
		case 6: { //c)
			System.out.println("La sumatoria de elementos en la lista es de: " + lista.sumatoria());
			break;
		}
		case 7: { //d
			System.out.println("El mayor elemento en la lista es: " + lista.mayor());
			break;
		}
		case 8: {
			System.out.println("El menor elemento en la lista es: " + lista.menor());
			break;
		}
		case 9: { //e
			lista.inversoPila();
			break;
		}
		case 10: { //f
			lista.inversoRecursivo(lista.getLista());
			break;
		}
		case 11: { //g
			lista.invertirLista();
			lista.mostrarLista();
			break;
		}
		case 12: { //h
			Lista copia = lista.copiaLista();
			copia.mostrarLista();
			break;
		}
		}
	}
while(opcion!=0);
	}

}
