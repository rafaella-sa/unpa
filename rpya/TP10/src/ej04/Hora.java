package ej04;
public class Hora {
	//atributos de la hora
	private int hora, minuto, segundo;	
	//a) constructor de la clase Hora
	public Hora (int HH, int MM, int SS){
		if (validarHora (HH) && validarMinutoSegundo(MM) && validarMinutoSegundo (SS)){
			hora = HH;
			minuto = MM;
			segundo = SS;
		}
		else{
			hora = 0;
			minuto = 0;
			segundo = 0;
		}
	}	
	//verifica si es o no válida la hora
	public boolean validarHora (int HH){
		if (HH >= 0 && HH < 24)
			return true;
		else
			return false;
	}
	//verifica si son o no válidos tanto los minutos como los segundos
	public boolean validarMinutoSegundo (int MS){
		if (MS >= 0 && MS < 60)
			return true;
		else
			return false;
	}	
	//b) permite cambiar el valor de la hora
	public void setHora (int HH){
		if (validarHora(HH))
			hora = HH;
	}
	//b) permite cambiar el valor de los minutos
	public void setMinuto (int MM){
		if (validarMinutoSegundo (MM))
			minuto = MM;
	}
	//b) permite cambiar el valor de los segundos
	public void setSegundo (int SS){
		if (validarMinutoSegundo(SS))
			segundo = SS;
	}	
	//c) devuelve la hora pasada en minutos
	public int devolverHoraEnMinutos (){
		int MIN = minuto + hora * 60;
		return MIN;
	}
	//d) devuelve la hora pasada en segundos
	public int devolverHoraEnSegundos (){
		int MIN, SEG;
		MIN = devolverHoraEnMinutos();
		SEG = segundo + MIN * 60;
		return SEG;
	}	
	//e) muestra la hora en el formato hh:mm:ss
	public void mostrarFormatoHora(){
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}
