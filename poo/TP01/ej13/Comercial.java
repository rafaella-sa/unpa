package ej13;

public class Comercial extends Usuario {
	private final double descuento;
	public Comercial(String d, String n, double des){
		super(d, n);
		this.descuento = des;
	}
	protected double calculaFacturacion(){
		double total = cuenta * 0.32;
		return total - (total * descuento);
	}
}
