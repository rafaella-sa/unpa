package ej02;
public class AmbitoIdentificador {
	public static void main(String[] args) {
		ClaseAmbito objetoAmbito;
		objetoAmbito = new ClaseAmbito();
		objetoAmbito.metodoTres();
		objetoAmbito.metodoCuatro(1, -1);
		objetoAmbito.metodoDos();
		objetoAmbito.metodoTres();
		objetoAmbito.metodoUno(5);
		objetoAmbito.metodoTres();
		objetoAmbito.metodoCuatro(1, 0);
		objetoAmbito.metodoDos();
		objetoAmbito.metodoTres();
	}
}
