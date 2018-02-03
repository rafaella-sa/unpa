/**
 * 
 */
package practico9;

/**
 * @author usuario
 *
 */
public class Uno {

	/**
	 * @param args
	 * Uno (int DD, int MM, int AAAA)
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//función que devuelve una fecha específica
	}
		public void autogenerarFecha(){
			System.out.println("La fecha es: 01/01/2002.");
		{
		}
		//declaraciones
		int DD;
		int MM;
		int AAAA;
		System.out.println("Ingrese el día de la fecha:");
		DD=Console.readInt();
		MM=Console.readInt("Ingrese el mes de la fecha");
		AAAA=Console.readInt("Ingrese el año de la fecha");
		if(DD<=0|DD>31|MM<=0|MM>12|AAAA<=0){
			autogenerarFecha();
		}
}
}







