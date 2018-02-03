package tp13;
import Comun.Console;
class Doce {
 public boolean palindromo (String palabra){
 if (palabra.length == 0 | palabra.length == 1)
	 return true;
 else if (palabra.charAt(i) == palabra.charAt(n))
		 return palindromo (palabra Substring(palabra.length - 1));
	 else
		 return false;
	
public static void main(String[] args) {
		String palabra = Console.readString("Ingrese una palabra cualquiera: ");
		if (palindromo(palabra) = true)
			System.out.println("La palabra " + palabra + " es un palindromo.");
		else
			System.out.println("La palabra " + palabra + " NO es un palindromo.");
		}
		

	}

}
