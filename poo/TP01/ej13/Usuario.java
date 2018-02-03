package ej13;
public class Usuario {
	protected String nombre, dni;
	protected int cuenta;
	
	public Usuario(String d, String n){
		this.nombre = n;
		this.dni = d;
		this.cuenta = 0;
	}
	protected void conexion(int s){ //Contabiliza 's' segundos en la cuenta
		cuenta = cuenta + s;
	}
	protected double calculaFacturacion(){ //Calcula el importe facturable
		return cuenta * 0.32;
	}
	protected void reset(){ //Pone a cero la cuenta
		cuenta = 0;
	}
}
