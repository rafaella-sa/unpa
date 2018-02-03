package ejer13;

public class Matriz {
	private int [][]elementos;
	private int dimfila;
	private int dimcolum;
	private int actualf;
	private int actualc;

	//constructor para la clase matriz
	Matriz (int DIMF, int DIMC){
		if (DIMF<=0 | DIMC<=0){
			dimfila=9;
			dimcolum=11;
		}
		else
		{
			dimfila= DIMF;
			dimcolum= DIMC;
		}
		actualf=0;
		actualc=0;
		elementos=new int [dimfila][dimcolum];
		}
	//metodo que agrega un elemento
	public void agregarElementos(int valor){
		elementos[actualf][actualc]= valor;
		if (actualc==dimcolum-1){
			actualc=0;
			actualf= actualf+1;
		}
		else
			actualc=actualc+1;
		if (actualf==dimfila)
			actualc=dimcolum;
	}

	//metodos que muestra la matriz
	public void mostrarMatriz(){
		for (int F=0; F<actualf; F++)
			for(int C=0;C<actualc; C++){
				System.out.println(elementos[F][C]);
			}
	}
//Elementos de la diagonal
	public void elemDiagonal(){
		for(int F=0; F<actualf; F++){
			System.out.println("los elementos de diagonalson:" +elementos[F][F]);
		}
	}
//elementos de una fila
	public void elemFila(int fila){
		if (fila>=0 && fila< actualf){
			for (int C=0; C<actualc; C++)
				System.out.println("los elementos de la fila son:" + elementos [fila][C]);
			}
	}
// Mostrar los elementos de una columna
	public void elemColum(int col){
		if(col>=0 && col < actualc){
			for(int F=0; F<actualf; F++)
				System.out.println("los elementos de la columna son:" + elementos [F][col]);
		}
		else
			System.out.println("la columna no existe");
			}
	//sumatoria del contorno
	public int sumaContorno(){
		int suma;
		suma=0;
		for (int F=0; F<actualf; F++)
			for (int C=0; C<actualc; C++)
				suma= suma + elementos[F][C];
		return suma;
		}
}
