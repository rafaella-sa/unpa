package ejer13;

public class PruebaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion del objeto matriz
		int dimf;
		int dimc;
		int elem;
		Matriz OBJMAT;
		int col;
	
	
		//carga de la dimension
		dimf = Console.readInt("ingrese un numero para la dimension fila");
		while (dimf <=0 && dimf>10){
			System.out.println("dimension invalida ingresada, vuelva a ingresar");
			System.out.println("la dimension ingresada es:"+ dimf);
			dimf= Console.readInt("ingrese un numero para la dimension fila");
		}
		dimc = Console.readInt("ingrese un numero para la dimension colum");
		while (dimc <=0 || dimc>12 ||dimc == dimf){
			System.out.println("dimension invalida ingresada, vuelva a ingresar");
			System.out.println("la dimension ingresada es:"+ dimc);
			dimc= Console.readInt("ingrese un numero para la dimension colum");
		}
		//CREACION DEL OBJETO
		OBJMAT=new Matriz (dimf,dimc);
		// CARGA DE LA MATRIZ
		for (int f=0; f< dimf; f++)
			for(int c=0; c< dimc; c++){
				elem= Console.readInt("ingrese un elemento para la matriz");
				OBJMAT.agregarElementos(elem);
			}
		//MUESTRA DE LA MATRIZ
		System.out.println("la matriz es");
		OBJMAT.mostrarMatriz();
		col= Console.readInt("ingrese un numero de columna");
		System.out.println("los elementos de una columna:");
		OBJMAT.elemColum(col);
		System.out.println("los elementos de la diagonalson");
		OBJMAT.elemDiagonal();
		
		

	}
}
