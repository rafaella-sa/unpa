package ej10;
import comun.Console;
public class Vocales {
	public static int cantVocal(String c, int i, int cantv){
		if(i == c.length())
			return cantv;
		else{
			if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i) == 'o' || c.charAt(i)== 'u')
				cantv++;
			i++;
		    return cantVocal(c, i, cantv);
			}
		}
		public static void main(String[] args) {
			String c = Console.readString("Ingrese una palabra: ");
			System.out.println("La cantidad de vocales es: " + cantVocal(c, 0, 0));
		}
}
