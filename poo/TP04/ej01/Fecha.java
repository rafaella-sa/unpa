package ej01;
import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Pre;
import org.contract4j5.contract.Post;
@Contract
public class Fecha {
	//atributos de la fecha
	private int dia, mes, anio;	
	//constructor
	@Pre("$args[0] > 0 && $args[0] <= 31 && $args[1] > 0 && $args[1] <= 12 && $args[2] >= 0 && $args[2] < 2100")
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
	@Pre("DD[0] > 0 && DD[0] <= 31")
		public boolean validarDia (int DD){
			if (DD > 0 && DD <= 31)
				return true;
			else
				return false;
		}	
	
	@Pre("MM > 0 && MM <= 12")
		//verifica si es o no válido el mes
		public boolean validarMes (int MM){
			if (MM > 0 && MM <= 12)
				return true;
			else
				return false;
		}
	
	@Pre("AAAA >= 0 && AAAA < 2100")
		//verifica si es o no valido el año
		public boolean validarAnio (int AAAA){
			if (AAAA >= 0 && AAAA < 2100)
				return true;
			else
				return false;
		}	
	
	//devolver dia, mes y año
	@Pre("$this.dia > 0 && $this.dia <= 31")
	public int getDia (){ return this.dia; }
	
	@Pre("$this.mes > 0 && $this.mes <= 12")
	public int getMes (){ return this.mes; }
	
	@Pre("$this.anio >= 0 && $this.dia < 2100")
	public int getAnio(){ return this.anio; }	
	
	//cambiar dia, mes y año
	@Pre("DD > 0 && DD <= 31")
	public void setDia (int DD){
		if (validarDia(DD))
			dia = DD;		
	}
	
	@Pre("MM > 0 && MM <= 12")
	public void setMes (int MM){
		if (validarMes(MM))
			mes = MM;
	}
	
	@Pre("AAAA > 0 && AAAA < 2100")
	public void setAnio (int AAAA){
		if (validarAnio (AAAA))
			anio = AAAA;
	}
	
	//obtener el nombre del mes de la fecha
	@Pre("$this.mes > 0 && $this.mes <= 12")
	@Post("$return == $this.nombremes != null")
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
	
	//mostrar fecha
	public void mostrarFormatoFecha(){
		String mes = getNombreMes();
		System.out.print(dia + " de " + mes + " de " + anio);
	}
}
