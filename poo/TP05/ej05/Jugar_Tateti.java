package ej05;
import comun.*;
public class Jugar_Tateti {
	public static void main(String[] args) {
		Tateti juego = new Tateti();
		char seguir = 's';
		do{
			System.out.println("NUEVO PARTIDO");
				juego.nuevoJuego();
				int turno = 1;
				int f, c;
				int movimientos = 0;
				while(movimientos < 10 && !juego.finDeJuego('X', 'O')){
					juego.mostrarJuego();
					if(turno == 1)
						System.out.println("Jugador 1 selecciona fila y columna: ");
					else
						System.out.println("Jugador 2 selecciona fila y columna: ");					
					f = Console.readInt("Fila: ");
					c = Console.readInt("Columna: ");
					while(juego.validarPosicion(f, c)){
						System.out.println("Posición invalida. Reingrese: ");
						f = Console.readInt("Fila: ");
						c = Console.readInt("Columna: ");
					}
					if(turno == 1){
						juego.ingresar(f, c, 'X');
						turno = 2;
					}
					else{
						juego.ingresar(f, c, 'O');
						turno = 1;
					}
					if(juego.hayGanador('X') || juego.hayGanador('O')){
						juego.mostrarJuego();					
						if(juego.getGanador() == 'X')
							System.out.println("El ganador es el jugador UNO ('X')");
						else if(juego.getGanador() == 'O')
							System.out.println("El ganador es el jugador DOS ('O')");				
					}	
					movimientos++;
				}
				if(juego.getGanador() == ' '){
					juego.mostrarJuego();
					System.out.println("No hubo ganadores en este partido.");
				}
				seguir = Console.readChar("Desea jugar de nuevo? (s/n)");
		}
		while(seguir == 's');
		if(seguir != 's')
			System.out.println("SECCIÓN FINALIZADA.");
	}
}

