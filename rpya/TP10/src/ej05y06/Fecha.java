package ej05y06;
public class Fecha {
	//atributos de la fecha
	private int dia, mes, anio;	
	//a) constructor
	public Fecha (int DD, int MM, int AAAA){
		if (validarDia (DD) && validarMes (MM) && validarAnio (AAAA)){
			dia = DD;
			mes = MM;
			anio = AAAA;
			}
		else{
			dia = 01;
			mes = 01;
			anio = 2010;
		}
	}	
	//verifica si es o no válido el dia
	public boolean validarDia (int DD){
		if (DD > 0 && DD <= 31)
			return true;
		else
			return false;
	}	
	//verifica si es o no válido el mes
	public boolean validarMes (int MM){
		if (MM > 0 && MM <= 12)
			return true;
		else
			return false;
	}	
	//verifica si es o no valido el año
	public boolean validarAnio (int AAAA){
		if (AAAA >= 0 && AAAA < 2100)
			return true;
		else
			return false;
	}	
	//b) devolver dia, mes y año
	public int getDia (){
		return this.dia;
	}
	public int getMes (){
		return this.mes;
	}
	public int getAnio(){
		return this.anio;
	}	
	//c) cambiar dia, mes y año
	public void setDia (int DD){
		if (validarDia(DD))
			dia = DD;		
	}
	public void setMes (int MM){
		if (validarMes(MM))
			mes = MM;
	}
	public void setAnio (int AAAA){
		if (validarAnio (AAAA))
			anio = AAAA;
	}	
	//d) obtener el nombre del mes de la fecha
	public String getNombreMes(){
		String nombremes = " ";
		switch (mes){	
			case 1: {
					nombremes = "ENERO";
					break;
					}
			case 2: {
					nombremes = "FEBRERO";
					break;
					}
			case 3: {
					nombremes = "MARZO";
					break;
					}
			case 4: {
					nombremes = ("ABRIL");
					break;
					}
			case 5: {
					nombremes = "MAYO";
					break;
					}
			case 6: {
					nombremes = "JUNIO";
					break;
					}
			case 7: {
					nombremes = "JULIO";
					break;
					}
			case 8: {
					nombremes = "AGOSTO";
					break;
					}
			case 9: {
					nombremes = "SEPTIEMBRE";
					break;
					}
			case 10:{
					nombremes = "OCTUBRE";
					break;
					}
			case 11:{
					nombremes = "NOVIEMBRE";
					break;
					}
			case 12:{
					nombremes = "DICIEMBRE";
					break;
					}
		}
		return nombremes;
	}
	//e) definir estación del año a que pertenece la fecha
	public String definirEstacion (){
		String estacion = " ";
		switch (this.mes){
			case 1: {
					estacion = "VERANO.";
					break;
					}
			case 2: {
					estacion = "VERANO.";
					break;
					}
			case 3: {
					if(this.dia<21)
						estacion = "VERANO.";
					else
						estacion = "OTOÑO.";
					break;
					}
			case 4: {
					estacion = "OTOÑO.";
					break;
					}
			case 5: {
					estacion = "OTOÑO.";
					break;
					}
			case 6: {
					if(dia<21)
						estacion = "OTOÑO.";
					else
						estacion = "INVIERNO.";	
					break;
					}
			case 7: {
					estacion = "INVIERNO.";
					break;
					}
			case 8: {
					estacion = "INVIERNO.";
					break;
					}
			case 9: {
					if(dia<21)
						estacion = "INVIERNO.";
					else
						estacion = "PRIMAVERA.";
					break;		
					}
			case 10:{
					estacion = "PRIMAVERA.";
					break;		
					}
			case 11:{
					estacion = "PRIMAVERA.";
					break;		
					}
			case 12:{
					if(dia<21)
						estacion = "PRIMAVERA.";
					else
						estacion = "VERANO.";
					break;
					}
			}
			return estacion;
		}	
	//f) mostrar fecha
	public void mostrarFormatoFecha(){
		String mes = getNombreMes();
		System.out.print(dia + " de " + mes + " de " + anio);
	}
}
