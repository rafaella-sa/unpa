package ej01;
import comun.Console;
public class Inverso {
	public static void main(String[] args) {
		int num = Console.readInt("Ingrese el número: ");
		System.out.println("El número ingresado en orden inverso es: "); 
		invertirNumero(num);
	}
	//método recursivo que imprime el número en orden inverso
	//precondición: número decimal (entero)
	//postcondición: el número en orden inverso
	public static void invertirNumero(int n){
		if(n < 10) //caso base
			System.out.print(n);
		else{
			System.out.print(n%10);
			invertirNumero(n/10); //llamador más pequeño
		}
	}
}
