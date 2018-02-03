package ej05;
public class Tateti {
	char [][] matriz;
	char ganador;
	
	Tateti(){
		matriz = new char[3][3];
		ganador = ' ';
	}
	
	
	public char getGanador() {
		return ganador;
	}


	public void setGanador(char ganador) {
		this.ganador = ganador;
	}


	void nuevoJuego(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				matriz[i][j] = ' ';
	}
	
	//verifica si la posición solicitada es válida
	boolean validarPosicion(int f, int c){
		if(f <= 0 || f > 3 || c <= 0 || c > 3)
			return true;
		else if(estaOcupada(f,c))
			return true;
		else 
			return false;
	}
	
	//en caso de que la posición sea válida, verificar si ya está ocupada por algún jugador
	boolean estaOcupada(int f, int c){
		if(matriz[f-1][c-1] != ' ')
			return true;
		else 
			return false;
	}
	
	//inserta el elemento en la posición deseada
	void ingresar(int fila, int columna, char opcion){
		matriz[fila-1][columna-1] = opcion;
	}
	
	//verificar si hay ganador
	boolean hayGanador(char opcion){
		if(ganadorFila(0,0,opcion)){
			setGanador(opcion);
			return true;		
		}
		else if(ganadorColumna(0,0,opcion)){
			setGanador(opcion);
			return true;
		}
			else if(ganadorDiagonal(0,0,opcion)){
				setGanador(opcion);
				return true;
			}
			else
				return false;
			
	}
	
	//verificar si hay ganador en alguna de las filas
	boolean ganadorFila(int i, int j, char opcion){
		if(matriz[i][j] == opcion && matriz[i][j+1] == opcion && matriz[i][j+2] == opcion)
			return true;
		else if(matriz[i+1][j] == opcion && matriz[i+1][j+1] == opcion && matriz[i+1][j+2] == opcion)
				return true;
			else if(matriz[i+2][j] == opcion && matriz[i+2][j+1] == opcion && matriz[i+2][j+2] == opcion)
				return true;
			else
				return false;
	}
	
	//verificar si hay ganador en alguna de las columnas
	boolean ganadorColumna(int i, int j, char opcion){
		if(matriz[i][j] == opcion && matriz[i+1][j] == opcion && matriz[i+2][j] == opcion)
			return true;
		else if(matriz[i][j+1] == opcion && matriz[i+1][j+1] == opcion && matriz[i+2][j+1] == opcion)
				return true;
			else if(matriz[i][j+2] == opcion && matriz[i+1][j+2] == opcion && matriz[i+2][j+2] == opcion)
				return true;
			else
				return false;
	}
	//verificar si hay ganador en alguna de las diagonales
	boolean ganadorDiagonal(int i, int j, char opcion){
		if(matriz[i][j] == opcion && matriz[i+1][j+1] == opcion && matriz[i+2][j+2] == opcion)
				return true;
			else if(matriz[i+2][j] == opcion && matriz[i+1][j+1] == opcion && matriz[i][j+2] == opcion)
					return true;
				else
					return false;
		}
	//mostrar la situación actual del juego
	void mostrarJuego(){
		System.out.println("	1	2	3");
		System.out.println("1	" + matriz[0][0] + "	" + matriz[0][1] + "	" + matriz[0][2]);
		System.out.println("2	" + matriz[1][0] + "	" + matriz[1][1] + "	" + matriz[1][2]);
		System.out.println("3	" + matriz[2][0] + "	" + matriz[2][1] + "	" + matriz[2][2]);
		}
	
	//verificar si el juego ya llegó a su fin
	boolean finDeJuego(char op1, char op2){
		if(hayGanador(op1) || hayGanador(op2) || estaOcupada(1,1) && estaOcupada(1,2) && estaOcupada(1,3) && estaOcupada(2,1) && estaOcupada(2,2) && estaOcupada(2,3)&& estaOcupada(3,1) && estaOcupada(3,2) && estaOcupada(3,3))
			return true;
		else
			return false;
	}

	}
	

