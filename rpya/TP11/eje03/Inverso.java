package ej03;
import comun.Console;
public class Inverso {
	public static void main(String[] args) {
		String palabra;
		palabra = Console.readString("Ingrese una palabra: ");
		PilaTres contrario;
		contrario = new PilaTres();
		for(int i = 0; i < palabra.length(); i++){
			contrario.meter(palabra.charAt(i)); 
		}
		System.out.println(contrario.invertirPalabra());
	}
}
