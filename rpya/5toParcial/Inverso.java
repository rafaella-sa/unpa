package ej01;
import comun.Console;
public class Inverso {
	public static void main(String[] args) {
		int num = Console.readInt("Ingrese el n�mero: ");
		System.out.println("El n�mero ingresado en orden inverso es: "); 
		invertirNumero(num);
	}
	//m�todo recursivo que imprime el n�mero en orden inverso
	//precondici�n: n�mero decimal (entero)
	//postcondici�n: el n�mero en orden inverso
	public static void invertirNumero(int n){
		if(n < 10) //caso base
			System.out.print(n);
		else{
			System.out.print(n%10);
			invertirNumero(n/10); //llamador m�s peque�o
		}
	}
}
