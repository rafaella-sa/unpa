package Ejer07;
import Comun.Console;
public class SumaPar {

	public int sumaPar(int num){
		if(num==0)
			return 0;
		else
			return(num+ sumaPar(num-2));
	
}
	public static void main(String[] args) {
		SumaPar s= new SumaPar();
		int num=Console.readInt("ingrese un numero par");
		if(num%2==0)
			System.out.println("el resultado es:" + s.sumaPar(num));
		else
			System.out.println("no se puede ejecutar el metodo, vuelva a ingresar");
	}

}

