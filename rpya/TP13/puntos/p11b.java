package puntos;

public class p11b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int prin;
		prin = 0;
		cadena = Console.readString("Ingrese cadena: ");
		int dim=cadena.length();
		System.out.println("El vector de caracteres es palindromo: "
				+ palindromo(cadena, prin,dim));
	}

	static boolean palindromo(String cadena, int prin,int dim) {
		boolean pal = true;
		System.out.println(cadena);
		if (cadena.charAt(prin) != cadena.charAt(dim-1)) {
			pal = false;
			return pal;
		}
		if (cadena.charAt(prin) == cadena.charAt(dim-1)&& prin <= dim-1) {
			return pal;
		} else
			return palindromo(cadena, prin++,dim--);

	}
}
