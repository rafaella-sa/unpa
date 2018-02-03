package puntos;

public class punto14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = Console.readInt("Ingrese primer numero natural");
		b = Console.readInt("Ingrese segundo numero natural");
		System.out.println("Resultado recursivo: " + naturales(a, b));
	}

	static int naturales(int a, int b) {
		System.out.println(a);
		System.out.println(b);

		if (b == 1 | a == 1) {

			return a * b;
		} else {

			return a + naturales(a, (b - 1));
		}
	}

}
