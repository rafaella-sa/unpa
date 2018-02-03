package Punto4;

public class Main {
	public static void main(String[] args) {
		Cola c = new Cola();
		int elem;
		elem = Console.readInt("Ingrese elemento");

		c.insertar(elem);

		elem = Console.readInt("Ingrese elemento");
		c.insertar(elem);

		elem = Console.readInt("Ingrese elemento");
		c.insertar(elem);

		elem = Console.readInt("Ingrese elemento");
		c.insertar(elem);

		elem = Console.readInt("Ingrese elemento");
		c.insertar(elem);
		
		System.out.println("Elementos actuales de la cola");
		c.mostraElem();
		
		System.out.println("Elementos luego de haber borrado repetidos");
		c.elimRep(c);
	}
}
