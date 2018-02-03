package ej08;
import comun.Console;
public class Main_Expresion{
	public static void main(String[] args) {
		String exp = Console.readString("Ingrese la expresión: ");
		Expresion e = new Expresion(exp);
		boolean verif = e.verificarExpresion();
		if(verif == true)
			System.out.println("La expresión es correcta.");
		else
			System.out.println("La expresión es incorrecta.");
	}
}
