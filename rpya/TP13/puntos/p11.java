package puntos;

public class p11 {

	/**
	 * <>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] vect;
		int prin;
		prin = 0;
		int dim = Console.readInt("Ingrese dimension del vector");
		while (dim > 20 | dim < 0) {
			dim = Console.readInt("Dimension incorrecta,reingrese");
		}
		vect = new char[dim];
		int i;
		for (i = 0; i < dim; i++) {
			vect[i] = Console.readChar("Ingrese caracter" + i);

		}
		System.out.println("El vector de caracteres es palindromo: "
				+ palindromo(vect, prin, dim));
	}

	static boolean palindromo(char[] vect, int prin, int dim) {
		boolean pal = true;
		System.out.println(vect);
		if (vect[prin] != vect[dim - 1]) {
			pal = false;
			return pal;
		}
		if (vect[prin] == vect[dim - 1] && prin <= dim - 1) {
			return pal;
		} else
			return palindromo(vect, prin++, dim--);

	}
}
