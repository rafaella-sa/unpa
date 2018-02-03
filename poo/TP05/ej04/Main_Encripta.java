package ej04;
import java.io.*; //libreria de entrada / salida
public class Main_Encripta {
	public static void main (String[] args){
		Encripta en = new Encripta();
		//Variables utilizadas
		String lsdato_entrada="";
		System.out.println("Introduzca los datos a encriptar:");
		//Aqui se cargan los datos a encriptar
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader texto = new BufferedReader(isr);
			lsdato_entrada=texto.readLine();
			en.setLsdato_entrada(lsdato_entrada);
		}
		catch(IOException e){ //Muestra si hay errores al cargar los datos		
			System.err.println("Errors:" + e.getMessage());
		}
		//Aquí empieza la encriptación por método ASCII, al valor de cada letra
		//Le suma el valor de su posición y lo va concatenando en una nueva
		//variable
		en.encriptarTexto();
		//Despliega el resultado encriptado
		en.mostrarTexto();
		//Inicializa la variable para desencriptar
		//Aquí desencripta utilizando el mismo concepto, pero le resta en lugar
		//de sumar para obtener el valor original
		en.desencriptarTexto();
		//Muestra la cadena desencriptada
		en.mostrarTexto();
		}
}
