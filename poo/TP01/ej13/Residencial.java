package ej13;
public class Residencial extends Usuario{
	public Residencial(String d, String n){
		super(d, n);
	}
	protected double calculaFacturacion(){
		return (cuenta - 180) * 0.32;
	}
}
