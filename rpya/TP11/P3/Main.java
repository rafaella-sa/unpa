package P3;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila P = new Pila();
		int elem;
		elem = Console.readInt("Ingrese elemento");
		
		P.meter(elem);
		System.out.println("Elementos en la Pila: " + (P.getSize() + 1));
		System.out.println("Faltan para llenarse: " + (P.faltan()-1));
		elem = Console.readInt("Ingrese elemento");
		P.meter(elem);
		System.out.println("Elementos en la Pila: " + (P.getSize() + 1));
		System.out.println("Faltan para llenarse: " + (P.faltan()-1));
		elem = Console.readInt("Ingrese elemento");
		P.meter(elem);
		System.out.println("Elementos en la Pila: " + (P.getSize() + 1));
		System.out.println("Faltan para llenarse: " + (P.faltan()-1));
		elem = Console.readInt("Ingrese elemento");
		P.meter(elem);
		System.out.println("Elementos en la Pila: " + (P.getSize() + 1));
		System.out.println("Faltan para llenarse: " + (P.faltan()-1));
		elem = Console.readInt("Ingrese elemento");
		P.meter(elem);
		System.out.println("Elementos en la Pila: " + (P.getSize() + 1));
		System.out.println("Faltan para llenarse: " + (P.faltan()-1));
		P.mostraElem();
	}
}
