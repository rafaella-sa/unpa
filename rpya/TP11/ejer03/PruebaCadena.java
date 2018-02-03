package ejer03;
import comun2.Console;
public class PruebaCadena {

	public static void main(String[] args) {
		Cadena cad=new Cadena (5);
		String c=Console.readString("igrese una palabra");
		cad.cargarCadena(c);
		cad.inversapalab();
		
		
		
		

	}

}
