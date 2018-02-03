package ej13;

public class Grandes extends Usuario{
	private int mayor;
	public Grandes(String d, String n){
		super(d, n);
		mayor = 0;
	}
	protected void conexion (int s){
		if(s > mayor)
			mayor = s;
		cuenta = cuenta + s;
	}
	protected double calculaFacturacion(){
		cuenta = cuenta - mayor;
		return cuenta * 0.32;
	}
}
