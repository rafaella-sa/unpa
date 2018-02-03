package Ejer11;
import Comun.Console;
public class Vocales {
public int cantVocal(String c, int i, int cantv){
	if(i==c.length())
		return cantv;
	else{
		if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i) == 'o' || c.charAt(i)== 'u')
			cantv++;
		i++;
	    return cantVocal(c, i, cantv);
	}
	}

	public static void main(String[] args) {
		Vocales OBJ=new Vocales();
		String c=Console.readString("ingrese una palabra");
		System.out.println("la cantidad de vocales es:" + OBJ.cantVocal(c, 0, 0));

	}

}
