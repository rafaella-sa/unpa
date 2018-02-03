package ej15;

public class Alojamiento {
	protected boolean privado;
	protected double cantmetros;
	protected Alojamiento(boolean privado, double cantmetros){
		this.privado = privado;
		this.cantmetros = cantmetros;
	}
	public boolean isPrivado() {
		return privado;
	}
	public void setPrivado(boolean privado) {
		this.privado = privado;
	}
	public double getCantmetros() {
		return cantmetros;
	}
	public void setCantmetros(double cantmetros) {
		this.cantmetros = cantmetros;
	}
}
