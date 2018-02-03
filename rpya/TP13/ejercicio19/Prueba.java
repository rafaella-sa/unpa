package ejercicio19;
import comun.Console;

public class Prueba {

	public static void main(String[] args) {
		
		String s1=Console.readString("Ingrese un palabra");
		String s2=Console.readString("Ingres otra vez una palabra");
		if(comparacion(s1,s2,0)==true)
			System.out.println("");
	}
	static boolean comparacion(String sec1, String sec2,int ind){
		if(sec1.charAt(ind)!=sec2.charAt(ind))
			return false;
		else
			return comparacion(sec1,sec2,ind+1);	
	}
}
